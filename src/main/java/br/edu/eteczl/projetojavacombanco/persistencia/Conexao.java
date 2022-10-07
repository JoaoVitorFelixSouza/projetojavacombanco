package br.edu.eteczl.projetojavacombanco.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static String NomeBanco = "bancoaulajava";
	private static String host = "localhost";
	private static String port = "3306";
	private static String usuario = "root";
	private static String senha = "";
	private static Connection conn;
	
	public static Connection getInstance() {
		
		String url = "jdbc:mysql://" + Conexao.host + ":" + Conexao.port + "/" + Conexao.NomeBanco;
		
		if(Conexao.conn != null) {
			return Conexao.conn;
		} else {
			
			try {
				
				Conexao.conn = DriverManager.getConnection(url, Conexao.usuario, Conexao.senha);
				return Conexao.conn;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return null;
			
			}
			
		}
		
	}

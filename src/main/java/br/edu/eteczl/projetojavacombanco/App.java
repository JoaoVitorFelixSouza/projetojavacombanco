package br.edu.eteczl.projetojavacombanco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.eteczl.projetojavacombanco.persistencia.Conexao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Connection instanciaDeConexaoValida = Conexao.getInstance();
       System.out.println(instanciaDeConexaoValida);
    
    
    try {
    	
		Statement stmt = instanciaDeConexaoValida.createStatement();
    	ResultSet rs = stmt.executeQuery("select * from clientes");
    	
    	while(rs.next()) {
    		String n = rs.getString("nomes");
    		System.out.println(n);
    	}
    	
    } catch (SQLException e ) {
    	e.printStackTrace();
    }
    
    Connection segundCon = Conexao.getInstance();
    System.out.println(segundCon);
   }
}
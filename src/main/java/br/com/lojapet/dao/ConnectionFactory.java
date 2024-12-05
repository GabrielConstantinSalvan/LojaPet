package br.com.lojapet.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USER = "root";
	private static final String SENHA = "root";
	
	public static Connection conectar() {
		
		
	
		try {
			// invocar a bibilioteca de conexao ao banco de dados
			Class.forName("com.mysql.jdbc.Driver");
			// crate database lojaPetSalvan
			Connection conexao = 
					DriverManager
						.getConnection("jdbc:mysql://localhost:3306/lojaPetSalvan", USER, SENHA);
			return conexao;
		} catch (Exception e) {
			// throw -> jogar pra cima
			// RuntimeException -> Erro que aconteceu enquanto o codigo rodava

			throw new RuntimeException();
		}		
				
	}
	
	
	
}

package br.com.lojapet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.lojapet.model.Funcionario;

public class FuncionarioDao {	
	
	private Connection conexao;
	
	public FuncionarioDao() {
		conexao = ConnectionFactory.conectar();
	}

	public void inserir(Funcionario funcionario) {
		String sql = "INSERT INTO funcionario (nome, cargo, idade) VALUES (?, ?, ?)";
		
		PreparedStatement smtp; //Executar a consulta sql
		try {
			
			smtp = conexao.prepareStatement(sql);
			smtp.setString(1, funcionario.getNome());
			smtp.setString(2, funcionario.getCargo());
			smtp.setInt(3, funcionario.getIdade());
			
			smtp.execute();
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			System.out.println("Deu erro: " + e.getMessage());
		}
	}
	
	public List<Funcionario> listar(){
		String sql = "SELECT * FROM funcionario";
		
		PreparedStatement smtp;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>(); 
		try {
			smtp = conexao.prepareStatement(sql);
			ResultSet resultado = smtp.executeQuery();
			while (resultado.next()) {
				
				Funcionario fu = new Funcionario();
				fu.setId(resultado.getLong("funcionario_id"));
				fu.setNome(resultado.getString("nome"));
				fu.setCargo(resultado.getString("cargo"));
				fu.setIdade(resultado.getInt("idade"));
				funcionarios.add(fu);			
			}
			
			resultado.close();
			smtp.close();
			conexao.close();
			return funcionarios;
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
			
	}
	
	public Funcionario buscar (long funcionarioId) {
		
		String sql = "SELECT * FROM funcionario WHERE funcionario_Id = ?";
		PreparedStatement smtp;
		
		try {
			
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(1, funcionarioId);
			ResultSet resultado = smtp.executeQuery();
			Funcionario f = null;
			
			 while (resultado.next()){
				 f = new Funcionario();
				 f.setId(resultado.getLong("funcionario_Id"));
				 f.setNome(resultado.getString("nome"));
				 f.setCargo(resultado.getString("cargo"));
				 f.setIdade(resultado.getInt("idade"));
				 
			 }
			 
			 smtp.close();
			 resultado.close();
			 conexao.close();
			 return f;
			
		} catch (Exception e) {
			System.out.println("Deu erro no buscar  do DAO: " + e.getMessage());
			System.out.println(e);
			throw new RuntimeException();
		}
	}
	
	
	public void excluir(Long funcionarioId) {
		String sql = "DELETE FROM funcionario WHERE funcionario_id = ?";
		
		PreparedStatement smtp;
		
		try {
			
			smtp = conexao.prepareStatement(sql);
		
			smtp.setLong(1, funcionarioId);
			
			smtp.execute();
			
			
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Deu erro no deletar no DAO: " + e.getMessage());
			System.out.println(e);
			throw new RuntimeException();
		}
	}
	
	public void atualizar( Long idFuncionario, Funcionario f) {
		String sql = "UPDATE funcionario SET nome = ?, cargo = ?, idade = ? WHERE funcionario_id = ?";
		
		PreparedStatement smtp;
		
		try {
			
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(4, idFuncionario);
			smtp.setString(1, f.getNome());		
			smtp.setString(2, f.getCargo());			
			smtp.setInt(3, f.getIdade());	
		
		
			smtp.execute();
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Deu erro no atualizar do DAO: " + e.getMessage());
			System.out.println(e);
			throw new RuntimeException();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

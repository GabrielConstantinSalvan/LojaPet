package br.com.lojapet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.lojapet.model.Racao;

public class RacaoDao {
	
	private Connection conexao;
	
	public RacaoDao() {
		conexao = ConnectionFactory.conectar();
	}

	public void inserir(Racao racao) {
		String sql = "INSERT INTO racao (nome, preco, descricao) VALUES (?, ?, ?)";
		
		PreparedStatement smtp; //Executar a consulta sql
		try {
			
			smtp = conexao.prepareStatement(sql);
			smtp.setString(1, racao.getNome());
			smtp.setDouble(2, racao.getPreco());
			smtp.setString(3, racao.getDescricao());
			
			smtp.execute();
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			System.out.println("Deu erro: " + e.getMessage());
		}
	}
	
	public List<Racao> listar(){
		String sql = "SELECT * FROM racao";
		
		PreparedStatement smtp;
		List<Racao> racoes = new ArrayList<Racao>(); 
		try {
			smtp = conexao.prepareStatement(sql);
			ResultSet resultado = smtp.executeQuery();
			while (resultado.next()) {
				
				Racao ra = new Racao();
				ra.setId(resultado.getLong("id"));
				ra.setNome(resultado.getString("nome"));
				ra.setPreco(resultado.getDouble("preco"));
				ra.setDescricao(resultado.getString("descricao"));
				racoes.add(ra);				
			}
			
			resultado.close();
			smtp.close();
			conexao.close();
			return racoes;
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
			
	}
	
	public Racao buscar (long id) {
		
		String sql = "SELECT * FROM racao WHERE id = ?";
		PreparedStatement smtp;
		
		try {
			
			smtp = conexao.prepareStatement(sql);
			smtp.setLong(1, id);
			ResultSet resultado = smtp.executeQuery();
			Racao r = null;
			
			 while (resultado.next()){
				 r = new Racao();
				 r.setId(resultado.getLong("id"));
				 r.setNome(resultado.getString("nome"));
				 r.setPreco(resultado.getDouble("preco"));
				 r.setDescricao(resultado.getString("descricao"));
				 
			 }
			 
			 smtp.close();
			 resultado.close();
			 conexao.close();
			 return r;
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	
	public void excluir(Long racaoId) {
		String sql = "DELETE FROM racao WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			
			smtp = conexao.prepareStatement(sql);
			// Esse setLong pega o ? que vem da consulta do SQL, ele é one based, então começa do 1
			smtp.setLong(1, racaoId);
			
			smtp.execute();
			
			
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}
	
	public void atualizar(Racao l, Long idRacao) {
		String sql = "UPDATE racao SET nome = ?, preco = ?, descricao = ?, WHERE id = ?";
		
		PreparedStatement smtp;
		
		try {
			// 1. Nome
			// 2. Preco
			smtp = conexao.prepareStatement(sql);
			smtp.setString(1, l.getNome());		
			smtp.setDouble(2, l.getPreco());			
			smtp.setString(3, l.getDescricao());			
		
			smtp.execute();
			smtp.close();
			conexao.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
		
	}
	
	
	
}

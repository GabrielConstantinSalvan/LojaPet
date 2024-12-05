package br.com.lojapet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import br.com.lojapet.dao.FuncionarioDao;
import br.com.lojapet.dao.RacaoDao;
import br.com.lojapet.model.Funcionario;

@Controller
public class FuncionarioController {
	
	@RequestMapping("/formUser")
	public String form(Long idFuncionario, Model model) {
		
		FuncionarioDao dao = new FuncionarioDao();
		
		Funcionario f = new Funcionario();
		
		if(idFuncionario != null) {
			f = dao.buscar(idFuncionario);
		}
		
		model.addAttribute("funcionario", f);
		
		return "formUser"; 
		
	}
	
	@RequestMapping("/user")
	public String user(Long idFuncionario, Model model) {
		
		FuncionarioDao dao = new FuncionarioDao();
		model.addAttribute("funcionario", dao.listar());
		
		
		return "user";
	}
	
	
	@RequestMapping(value = "adicionarFuncionario", method = RequestMethod.POST )
	public String adicionarFuncionario(Funcionario funcionario) {
		FuncionarioDao dao = new FuncionarioDao();
		dao.inserir(funcionario);
		
		return "redirect:home";
	}
	
	
	@RequestMapping(value = "deletarFuncionario", method = RequestMethod.GET)
	public String deletarFuncionario(Long idFuncionario) {
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.excluir(idFuncionario);
		
		return "home";
	}
	
	
	@RequestMapping(value = "atualizarFuncionario", method = RequestMethod.POST)
	public String atualizarFuncionario(Long idFuncionario, Funcionario f) {
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.atualizar(idFuncionario, f);
		
		return "redirect:home";
	}
	
}

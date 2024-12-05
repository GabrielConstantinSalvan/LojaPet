package br.com.lojapet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lojapet.dao.ConnectionFactory;
import br.com.lojapet.dao.RacaoDao;
import br.com.lojapet.model.Racao;

@Controller

public class IndexController {
		
	@RequestMapping("/")
		public String inicio() {
			// Conectar ao banco de dados
			ConnectionFactory.conectar();
			// Redirecionar a rota home
			return "redirect:home";
		}
	
	@RequestMapping("/home")
	public String index(Model model) {
		RacaoDao dao = new RacaoDao();
		model.addAttribute("racoes", dao.listar());
		return "home";
	}

	@RequestMapping("/form")
	public String form(Long idRacao, Model model) {
		
		RacaoDao dao = new RacaoDao();
		
		Racao l = new Racao();
		
		if(idRacao != null) {
			l = dao.buscar(idRacao);
		}
		
		model.addAttribute("racao", l);
		
		return "form"; // form.html
	}
	
	@RequestMapping("/racao")
	public String racao(Long idRacao, Model model) {
		
		RacaoDao dao = new RacaoDao();
		model.addAttribute("racao", dao.buscar(idRacao));
		
		
		return "racao";
	}
	
	
	@RequestMapping(value = "adicionarRacao", method = RequestMethod.POST )
	public String adicionarRacao(Racao racao) {
		RacaoDao dao = new RacaoDao();
		dao.inserir(racao);
		return "redirect:home";
	}
	
//--------------------------
	
	@RequestMapping("deletarRacao")
	public String deletarRacao(Long idRacao) {
		
		
		
		RacaoDao dao = new RacaoDao();
		dao.excluir(idRacao);
		
		return "redirect:home";
	}
	
	/*
	 * Atualizar Livro || GET || POST || PUT || DELETE
	 * GET - Buscar informações
	 * POST - Criar informações
	 * PUT -  Atualizar informações
	 * DELETE - Deletar informações
	 */
	
	@RequestMapping(value = "atualizarRacao", method = RequestMethod.POST)
	public String atualizarRacao(Long idRacao, Racao l) {
		RacaoDao dao = new RacaoDao();
		
		dao.atualizar(l, idRacao);
		
		return "redirect:home";
	}
	 
	
}

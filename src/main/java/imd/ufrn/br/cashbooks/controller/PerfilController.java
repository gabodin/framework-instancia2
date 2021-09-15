package imd.ufrn.br.cashbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import imd.ufrn.br.cashbooks.model.Usuario;
import imd.ufrn.br.cashbooks.service.MovimentacaoService;
import imd.ufrn.br.cashbooks.service.UsuarioService;


@Controller
@RequestMapping("/perfil")
public class PerfilController {
	
	@Autowired
	UsuarioService serviceUsuario;
	
	@Autowired
	MovimentacaoService serviceMovimentacao;

	@GetMapping
	public String index(Model model) {
		
		Usuario proprietario = serviceUsuario.getUsuario();
		
		
		model.addAttribute("user", proprietario);
		
		return "perfil/index";
	}
	
	@GetMapping(value="/editar")
	public String edit(Model model) {
		
		Usuario proprietario = serviceUsuario.getUsuario();
		
		
		model.addAttribute("user", proprietario);
		
		return "perfil/form";
	}
	
	
	@PutMapping
	public String edit(@RequestBody Usuario entityProprietario) {
		serviceUsuario.update(entityProprietario.getId(), entityProprietario);
		
		return "redirect:/perfil/";
	}
	
	@GetMapping(value="/dividas")
	public String dividas(Model model) {
		
		Usuario proprietario = serviceUsuario.getUsuario();
		
		model.addAttribute("movimentacoes", serviceMovimentacao.getDividas());
		
		return "perfil/dividas";
	}
	
	@GetMapping(value="/dividas/pagar/{id}")
	public String pagarMovimentacoesFiado(@PathVariable("id") Long id) {
		serviceMovimentacao.pagarMovimentacao(id);
		
		return "redirect:/perfil/dividas/";
	}
}
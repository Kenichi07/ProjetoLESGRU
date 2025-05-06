package br.edu.fatecgru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.fatecgru.model.entity.Brinquedo;
import br.edu.fatecgru.service.BrinquedoService;

@Controller
public class MenuController {

	@Autowired
	private BrinquedoService brinquedoService;
	/*
    @GetMapping("/catalogo")
    public String catalogo() {
        return "catalogo"; // Isso carrega catalogo.html de /templates
    }
 
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    */
    
	@GetMapping("/catalogo")
	public String listarCategorias(Model model) {
		List<Brinquedo> brinquedos = brinquedoService.listAll();
		model.addAttribute("brinquedos", brinquedos);
		return "catalogo";
	}
	
    @GetMapping("/home")
	public String listarTodos(Model model) {
		List<Brinquedo> brinquedos = brinquedoService.listMaisBaratos(6);
	    model.addAttribute("brinquedos", brinquedos);
		return "home";
	}

    @GetMapping("/equipe")
    public String equipe() {
        return "equipe"; 
    }
}
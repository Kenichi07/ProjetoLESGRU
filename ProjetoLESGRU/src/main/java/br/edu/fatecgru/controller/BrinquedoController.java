package br.edu.fatecgru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.edu.fatecgru.model.entity.Brinquedo;
import br.edu.fatecgru.service.BrinquedoService;

//@RestController
@Controller
@RequestMapping("/brinquedos")
public class BrinquedoController {

	@Autowired
	private BrinquedoService brinquedoService;
	
	@GetMapping("/index")
    public String index() {
        return "index"; // apenas retorna o HTML
    }
	
	@GetMapping("/list")
	public List<Brinquedo> listarTodos() {
		return brinquedoService.listAll();
	}
	/*
	@GetMapping("/list")
	public String listarTodos(Model model) {
		List<Brinquedo> brinquedos = brinquedoService.listAll();
		model.addAttribute("brinquedos", brinquedos);
		return "lista";
	}*/
	
	@GetMapping("/{id}")
	public Brinquedo getByCode(@PathVariable("id") int id) {
		return brinquedoService.getByCode(id);
	}
	
	@PostMapping("/brinquedo")
	public Brinquedo insert(@RequestBody Brinquedo brinquedo) {
		return brinquedoService.saveBrinquedo(brinquedo);
	}
	
	@PutMapping("/{id}")
	public Brinquedo update(@RequestBody Brinquedo brinquedo, @PathVariable Integer id) {
		Brinquedo brinquedoUpdate = brinquedoService.getByCode(id);
		brinquedoUpdate.setDescricao(brinquedo.getDescricao());
		brinquedoUpdate.setCategoria(brinquedo.getCategoria());
		brinquedoUpdate.setDetalhes(brinquedo.getDetalhes());
		brinquedoUpdate.setMarca(brinquedo.getMarca());
		brinquedoUpdate.setPreco(brinquedo.getPreco());
		
		return brinquedoService.saveBrinquedo(brinquedoUpdate);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		brinquedoService.delete(id);
	}
}

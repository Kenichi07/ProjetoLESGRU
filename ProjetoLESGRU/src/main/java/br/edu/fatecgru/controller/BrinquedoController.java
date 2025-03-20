package br.edu.fatecgru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.edu.fatecgru.model.entity.Brinquedo;
import br.edu.fatecgru.service.BrinquedoService;

@RestController
public class BrinquedoController {

	@Autowired
	private BrinquedoService brinquedoService;
	
	@GetMapping("/brinquedos")
	public List<Brinquedo> listarTodos() {
		return brinquedoService.listAll();
	}
	
	@GetMapping("/brinquedos/{id}")
	public Brinquedo getByRaAluno(@PathVariable("id") int id) {
		return brinquedoService.getByCode(id);
	}
	
	@PostMapping("/brinquedos")
	public Brinquedo insert(@RequestBody Brinquedo brinquedo) {
		return brinquedoService.saveBrinquedo(brinquedo);
	}
	
	@PutMapping("/brinquedos/{id}")
	public Brinquedo update(@RequestBody Brinquedo brinquedo, @PathVariable Integer id) {
		Brinquedo brinquedoUpdate = brinquedoService.getByCode(id);
		brinquedoUpdate.setDescricao(brinquedo.getDescricao());
		brinquedoUpdate.setCategoria(brinquedo.getCategoria());
		brinquedoUpdate.setDetalhes(brinquedo.getDetalhes());
		brinquedoUpdate.setMarca(brinquedo.getMarca());
		brinquedoUpdate.setPreco(brinquedo.getPreco());
		
		return brinquedoService.saveBrinquedo(brinquedoUpdate);
	}
	
	@DeleteMapping("/brinquedos/{id}")
	public void delete(@PathVariable Integer id) {
		brinquedoService.delete(id);
	}
}

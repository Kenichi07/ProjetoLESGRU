package br.edu.fatecgru.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.fatecgru.model.entity.Brinquedo;
import br.edu.fatecgru.model.entity.repository.BrinquedoRepository;

@Service
public class BrinquedoService {

	@Autowired
	private BrinquedoRepository brinquedoRepository;
	
	public List<Brinquedo> listAll(){
		return brinquedoRepository.findAll();
	}
	
	public Brinquedo getByCode(int id) {
		return brinquedoRepository.findById(id).get();
	}

	public Brinquedo saveBrinquedo(Brinquedo brinquedo) {
		return brinquedoRepository.save(brinquedo);
	}

	public void delete(Integer id) {
		brinquedoRepository.deleteById(id);
	}
	
	public List<Brinquedo> listMaisBaratos(int limite) {
	    return brinquedoRepository.findAll().stream()
	        .sorted(Comparator.comparing(Brinquedo::getPreco))
	        .limit(limite)
	        .toList();
	}
}

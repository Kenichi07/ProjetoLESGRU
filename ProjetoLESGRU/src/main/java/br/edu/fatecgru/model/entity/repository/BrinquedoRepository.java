package br.edu.fatecgru.model.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.fatecgru.model.entity.Brinquedo;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Integer>{
	
	@Query("SELECT b FROM Brinquedo b ORDER BY b.preco ASC LIMIT 6")
	List<Brinquedo> findTop6ByOrderByPrecoAsc();

	List<Brinquedo> findByCategoriaIgnoreCase(String categoria);
	
}

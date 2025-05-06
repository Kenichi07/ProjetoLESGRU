package br.edu.fatecgru.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import br.edu.fatecgru.model.entity.Usuario;
import br.edu.fatecgru.model.entity.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listAll(){
		return usuarioRepository.findAll();
	}
	
	public Usuario getByCode(int id) {
		return usuarioRepository.findById(id).get();
	}

	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void delete(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario autenticar(String login, String senha) {
        return usuarioRepository.findByLoginAndSenha(login, senha).orElse(null);
    }
	
}

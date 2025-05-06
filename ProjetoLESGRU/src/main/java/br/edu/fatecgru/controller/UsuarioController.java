package br.edu.fatecgru.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecgru.model.entity.Usuario;
import br.edu.fatecgru.service.UsuarioService;
import jakarta.servlet.http.HttpSession;

//@RestController
@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
	
	@PostMapping("/login")
    public String fazerLogin(@RequestParam String login,
                             @RequestParam String senha,
                             HttpSession session,
                             Model model) {
        Usuario usuario = usuarioService.autenticar(login, senha);
        if (usuario != null) {
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:/brinquedos/list";
        } else {
            model.addAttribute("erro", "Login ou senha inválidos");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/usuario/login";
    }
	
    
}

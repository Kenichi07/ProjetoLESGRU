package br.edu.fatecgru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/catalogo")
    public String catalogo() {
        return "catalogo"; // Isso carrega catalogo.html de /templates
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "admin"; // Retorna o admin.html
    }

    @GetMapping("/equipe")
    public String equipe() {
        return "equipe"; // Retorna o equipe.html
    }
}
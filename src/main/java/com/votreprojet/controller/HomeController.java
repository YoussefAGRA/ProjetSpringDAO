package com.votreprojet.controller; // Remplacez par votre package

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Cela fait référence à un fichier index.html que nous allons créer dans les vues.
    }
}

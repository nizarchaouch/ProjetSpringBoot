package com.example.projet2.projet2.controller;

import com.example.projet2.projet2.entites.Acteur;
import com.example.projet2.projet2.service.IServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model; // Ajout de l'importation pour Model

import com.example.projet2.projet2.entites.Acteur;
import com.example.projet2.projet2.service.IServiceActeur;
import com.example.projet2.projet2.service.IServiceCategorie;

@Controller
@RequestMapping("/acteur/")
public class ActeurController {

    @Autowired
    IServiceActeur iServiceActeur;

    @GetMapping("all")
    public String ListeActeurs(Model model){
        model.addAttribute("acteurs",iServiceActeur.getAllActeurs());
        return "affiche";
    }

   /* @GetMapping("new")
    public String afficheNewForm(Model model){
        model.addAttribute("categories",iServiceCategorie.findAllCategorie());
        return "ajout";
    }

    @PostMapping("add")
    public String add(Film f) {
        iServiceFilm.createFilm(f); // Call the method on the interface
        return "redirect:/film/all";
    }


*/



}

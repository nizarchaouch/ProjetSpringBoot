package com.example.projet2.projet2.controller;

import com.example.projet2.projet2.service.IServiceActeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model; // Ajout de l'importation pour Model

import com.example.projet2.projet2.entites.Film;
import com.example.projet2.projet2.service.IServiceFilm;
import com.example.projet2.projet2.service.IServiceCategorie;

@Controller
@RequestMapping("/film/")
public class FilmController {

    @Autowired
    IServiceFilm iServiceFilm;
    @Autowired
    IServiceCategorie iServiceCategorie;
    @Autowired
    IServiceActeur iServiceActeur;

    @GetMapping("all")
    public String ListeFilms(Model model){
        model.addAttribute("films",iServiceFilm.findAllFilms());
        return "affiche";
    }

    @GetMapping("new")
    public String afficheNewForm(Model model){
        model.addAttribute("categories",iServiceCategorie.findAllCategorie());
        model.addAttribute("acteurs",iServiceActeur.getAllActeurs());
        return "ajout";
    }

    @PostMapping("add")
    public String add(Film f) {
        iServiceFilm.createFilm(f); // Call the method on the interface
        return "redirect:/film/all";
    }


    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        iServiceFilm.deleteFilm(iServiceFilm.FindFilmById(id)); // Assuming that you have a method in IServiceFilm to delete a film by ID.
        return "redirect:/film/all";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable int id, Model model){

        model.addAttribute("film",iServiceFilm.FindFilmById(id));
        model.addAttribute("categories",iServiceCategorie.findAllCategorie());

        return "edit";
    }
    @PostMapping ("update")
    public String edit(@PathVariable int id) {
        iServiceFilm.updateFilm(iServiceFilm.FindFilmById(id)); // Assuming that you have a method in IServiceFilm to delete a film by ID.
        return "redirect:/film/all";
    }

}


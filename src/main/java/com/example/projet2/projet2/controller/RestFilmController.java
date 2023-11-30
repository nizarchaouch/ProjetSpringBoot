package com.example.projet2.projet2.controller;

import com.example.projet2.projet2.service.IServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.projet2.projet2.entites.Film;
import java.util.List;

@RestController
@RequestMapping("/api/film/")
public class RestFilmController {

    @Autowired
    IServiceFilm iServiceFilm;

    @GetMapping("")
    public List<Film> all() {
        return iServiceFilm.findAllFilms(); // Appeler la méthode sur l'instance iServiceFilm
    }
    @GetMapping("{id}")
    public Film getFilmById(@PathVariable int id) {
        return iServiceFilm.FindFilmById(id); // Appeler la méthode sur l'instance iServiceFilm
    }
    @PostMapping("add")
    public Film createFilm(@RequestBody Film f) {
        return iServiceFilm.createFilm(f);
    }
    @PutMapping("update")
    public Film update(@RequestBody Film f){
        return iServiceFilm.updateFilm(f);

    }
    @DeleteMapping("delete/{id}")
    public String delete(@RequestBody Film f){
         iServiceFilm.deleteFilm(f);
         return "suppression reussite";

    }


}

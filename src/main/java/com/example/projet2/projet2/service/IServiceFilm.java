package com.example.projet2.projet2.service;
import  com.example.projet2.projet2.entites.Film;
import java.util.List;
public interface IServiceFilm {
    public Film createFilm(Film f);
    public Film FindFilmById(int id);
    public Film updateFilm(Film id);
    public List<Film> findAllFilms();
  
    public void deleteFilm(Film f);

}

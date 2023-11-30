package com.example.projet2.projet2.service;
import com.example.projet2.projet2.entites.Film;
import com.example.projet2.projet2.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ServiceFilm implements IServiceFilm {
    @Autowired
    FilmRepository filmRepository;

    @Override
    public Film createFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public Film FindFilmById(int id) {
        return filmRepository.findById(id).get();
    }
    @Override
    public Film updateFilm(Film f) {
        return filmRepository.save(f);
    }
    @Override
    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public void deleteFilm(Film f) {
        filmRepository.delete(f);
    }
}

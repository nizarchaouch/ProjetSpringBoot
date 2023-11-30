package com.example.projet2.projet2.repository;
import com.example.projet2.projet2.entites.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}

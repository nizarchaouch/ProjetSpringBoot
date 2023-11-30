package com.example.projet2.projet2.service;
import com.example.projet2.projet2.entites.Categorie;

import com.example.projet2.projet2.entites.Film;
import com.example.projet2.projet2.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Ajoutez l'annotation @Service

@Service
public class ServiceCategorie implements IServiceCategorie {
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public List<Categorie> findAllCategorie() {
        return categorieRepository.findAll();
    }
}

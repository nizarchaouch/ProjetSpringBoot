package com.example.projet2.projet2.service;
import com.example.projet2.projet2.entites.Acteur;
import com.example.projet2.projet2.entites.Film;
import com.example.projet2.projet2.repository.ActeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ServiceActeur implements IServiceActeur {
    @Autowired
    ActeurRepository acteurRepository;

    @Override

    public Acteur createActeur(Acteur a) {
        return acteurRepository.save(a);
    }

    @Override
    public List<Acteur> getAllActeurs() {
        return acteurRepository.findAll();
    }

}
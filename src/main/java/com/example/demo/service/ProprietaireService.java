package com.example.demo.service;

import com.example.demo.modele.Proprietaire;
import com.example.demo.modele.ProprietaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProprietaireService {

    @Autowired
    private ProprietaireRepo proprietaireRepo;

    public List<Proprietaire> getAllProprietaires() {
        return (List<Proprietaire>) proprietaireRepo.findAll();
    }

    public Optional<Proprietaire> getProprietaireById(Long id) {
        return proprietaireRepo.findById(id);
    }

    public Proprietaire saveProprietaire(Proprietaire proprietaire) {
        return proprietaireRepo.save(proprietaire);
    }

    public void deleteProprietaire(Long id) {
        proprietaireRepo.deleteById(id);
    }
}

package com.example.demo.service;

import com.example.demo.modele.Voiture;
import com.example.demo.modele.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepo voitureRepo;

    public List<Voiture> getAllVoitures() {
        return (List<Voiture>) voitureRepo.findAll();
    }

    public Optional<Voiture> getVoitureById(Long id) {
        return voitureRepo.findById(id);
    }

    public Voiture saveVoiture(Voiture voiture) {
        return voitureRepo.save(voiture);
    }

    public void deleteVoiture(Long id) {
        voitureRepo.deleteById(id);
    }
}

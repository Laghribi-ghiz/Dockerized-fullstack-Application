package com.example.demo.web;

import com.example.demo.modele.Voiture;
import com.example.demo.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voitures")
@CrossOrigin(origins = "http://localhost:3000") // pour React
public class VoitureController {

    @Autowired
    private VoitureService voitureService;

    @GetMapping
    public List<Voiture> getAll() {
        return voitureService.getAllVoitures();
    }

    @GetMapping("/{id}")
    public Voiture getById(@PathVariable Long id) {
        return voitureService.getVoitureById(id).orElse(null);
    }

    @PostMapping
    public Voiture create(@RequestBody Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }

    @PutMapping("/{id}")
    public Voiture update(@PathVariable Long id, @RequestBody Voiture voiture) {
        voiture.setId(id);
        return voitureService.saveVoiture(voiture);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        voitureService.deleteVoiture(id);
    }
}

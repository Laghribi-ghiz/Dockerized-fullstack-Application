package com.example.demo.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String marque;

    @NonNull
    private String modele;

    private String couleur;
    private String boiteVitesse;
    private int annee;
    private double prix;

    // Relation ManyToOne vers Proprietaire
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proprietaire_id")
    @JsonIgnore
    private Proprietaire proprietaire;


    // Constructeur complet
    public Voiture(@NonNull String marque, @NonNull String modele, String couleur, String boiteVitesse,
                   int annee, double prix, Proprietaire proprietaire) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.boiteVitesse = boiteVitesse;
        this.annee = annee;
        this.prix = prix;
        this.proprietaire = proprietaire;
    }

    public Voiture(String miolaCar, String uber, String blanche, String s, int i, int i1) {


    }
}

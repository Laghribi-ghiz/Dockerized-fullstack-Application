package com.example.demo;

import com.example.demo.modele.Proprietaire;
import com.example.demo.modele.ProprietaireRepo;
import com.example.demo.modele.Voiture;
import com.example.demo.modele.VoitureRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private VoitureRepo voitureRepo;

	@Autowired
	private ProprietaireRepo proprietaireRepo;

	@Bean

	CommandLineRunner initDatabase() {
		return args -> {

			// ➜ Création des propriétaires
			Proprietaire proprietaire1 = new Proprietaire("Ali", "Hassan");
			Proprietaire proprietaire2 = new Proprietaire("Najat", "Bani");

			proprietaireRepo.save(proprietaire1);
			proprietaireRepo.save(proprietaire2);

			// ➜ Création des voitures AVEC propriétaire
			voitureRepo.save(
					new Voiture("Toyota", "Corolla", "Grise", "A-1-9090", 2018, 95000, proprietaire1)
			);

			voitureRepo.save(
					new Voiture("Ford", "Fiesta", "Rouge", "A-2-8090", 2015, 90000, proprietaire1)
			);

			voitureRepo.save(
					new Voiture("Honda", "CRV", "Bleu", "A-3-7090", 2016, 140000, proprietaire2)
			);
		};
	}
}

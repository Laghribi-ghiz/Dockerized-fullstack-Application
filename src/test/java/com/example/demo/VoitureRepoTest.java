package com.example.demo;



import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

import com.example.demo.modele.Voiture;
import com.example.demo.modele.VoitureRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
// Test dédié uniquement à la couche JPA (Repository)
public class VoitureRepoTest {

    @Autowired
    private TestEntityManager entityManager;
    // Permet de manipuler directement les entités JPA

    @Autowired
    private VoitureRepo voitureRepo;

    @Test
   public void ajouterVoiture() {
        Voiture voiture = new Voiture(
                "MiolaCar",
                "Uber",
                "Blanche",
                "M-2020",
                2021,
                180000
        );

        entityManager.persistAndFlush(voiture);

        // Vérifier que l’ID est bien généré
        assertThat(voiture.getId()).isNotNull();
    }

    @Test
    public void supprimerVoiture() {

        entityManager.persistAndFlush(
                new Voiture("MiolaCar", "Uber", "Blanche", "M-2020", 2021, 180000)
        );
        entityManager.persistAndFlush(
                new Voiture("MiniCooper", "Uber", "Rouge", "C-2020", 2021, 180000)
        );

        voitureRepo.deleteAll();

        assertThat(voitureRepo.findAll()).isEmpty();
    }
}

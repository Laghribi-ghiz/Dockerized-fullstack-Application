package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;


import com.example.demo.web.VoitureController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootReactPart1ApplicationTests {

	@Autowired
	private VoitureController voitureController;

	@Test
	void contextLoads() {
		// on teste si le contrôleur a bien été créé par Spring
		assertThat(voitureController).isNotNull();
	}
}


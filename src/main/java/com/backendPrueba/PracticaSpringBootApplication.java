package com.backendPrueba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backendPrueba.service.IPersonaService;
import com.backendPrueba.service.PersonaServiceImpl;

@SpringBootApplication
public class PracticaSpringBootApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(PracticaSpringBootApplication.class);

	// Automaticamente el framework busca una instancia de esto
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(PracticaSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		LOG.info("Hola papu");
//		LOG.warn("Alerta");
		service.registrar("Turing");
	}
}

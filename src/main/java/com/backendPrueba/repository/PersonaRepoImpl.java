package com.backendPrueba.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.backendPrueba.PracticaSpringBootApplication;

// indica que la clase es para acceso a datos
@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(PracticaSpringBootApplication.class);
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("Se registro a "+nombre);
	}

}

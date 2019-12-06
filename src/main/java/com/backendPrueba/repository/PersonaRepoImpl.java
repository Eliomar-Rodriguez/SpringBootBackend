package com.backendPrueba.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.backendPrueba.PracticaSpringBootApplication;

// indica que la clase es para acceso a datos
@Repository
@Qualifier("Persona") //esto seria necesario si hay mas de dos instancias y el sistema cuando hace el @Autowired va a buscar la instancia va a detectar 2 o mas
//y se hace el @Autowired se debe colocar tambien  @Qualifier("Persona") para que la referencia sea directa
public class PersonaRepoImpl implements IPersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(PracticaSpringBootApplication.class);
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("Se registro a "+nombre);
	}

}

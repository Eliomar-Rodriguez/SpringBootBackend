package com.backendPrueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendPrueba.repository.IPersonaRepo;
import com.backendPrueba.repository.PersonaRepoImpl;

//para indicar que es una logica de negocio
@Service
public class PersonaServiceImpl implements IPersonaService{

	//Automaticamente el framework busca una instancia de esto
	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
	}

}
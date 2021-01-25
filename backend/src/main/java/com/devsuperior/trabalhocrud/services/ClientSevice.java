package com.devsuperior.trabalhocrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.trabalhocrud.entities.Client;
import com.devsuperior.trabalhocrud.repositories.ClientRepository;

@Service
public class ClientSevice {

	@Autowired
	private ClientRepository repository;
	public List<Client> findAll() {
		return repository.findAll();
	}

}

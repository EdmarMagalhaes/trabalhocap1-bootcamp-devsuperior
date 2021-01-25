package com.devsuperior.trabalhocrud.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.devsuperior.trabalhocrud.services.execeptions.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.trabalhocrud.dto.ClientDTO;
import com.devsuperior.trabalhocrud.entities.Client;
import com.devsuperior.trabalhocrud.repositories.ClientRepository;

@Service
public class ClientSevice {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		
	return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
		
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}

}

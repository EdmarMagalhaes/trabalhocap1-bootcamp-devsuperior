package com.devsuperior.trabalhocrud.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trabalhocrud.entities.Client;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Edmar", "277.192.208-89", 5000.00, "16/10/1979", 3));
	
		return ResponseEntity.ok().body(list);
		
	}
	

}

package com.example.demo.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.arbitre;
import com.example.demo.entities.equipe;
import com.example.demo.repositorie.equipeRepositorie;

 

@CrossOrigin(origins = "*")
@RestController
public class equipeControlleur {
	
	@Autowired equipeRepositorie er;
	
	@GetMapping("equipe")
	public List<equipe> getAllClients(){
		return er.findAll();
	}

}

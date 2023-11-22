package com.example.demo.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.arbitre;
import com.example.demo.entities.joueur;
 import com.example.demo.repositorie.joueurRepositorie;

 

@CrossOrigin(origins = "*")
@RestController
public class joueurControlleur {
	
	@Autowired joueurRepositorie jr;
	
	@GetMapping("arbitre")
	public List<joueur> getAllClients(){
		return jr.findAll();
	}

}

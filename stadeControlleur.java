package com.example.demo.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.arbitre;
import com.example.demo.entities.stade;
import com.example.demo.repositorie.stadeRepositorie;

 

@CrossOrigin(origins = "*")
@RestController
public class stadeControlleur {
	
	@Autowired stadeRepositorie sr;
	
	@GetMapping("stade")
	public List<stade> getAllClients(){
		return sr.findAll();
	}

}

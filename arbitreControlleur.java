package com.example.demo.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import   com.example.demo.service.*;

import com.example.demo.entities.*;
@CrossOrigin("*")
@RestController
public class arbitreControlleur {
	
	@Autowired
	com.example.demo.service.ArbitreService ar;
	@GetMapping("arbitrej")	
	  public List<arbitre> getAllArbitres(){
        
		return ar.getAllArbitres();
	}
	
	@PostMapping("arbitre")
	public arbitre addArbitre(@RequestBody arbitre a) {
		return ar.addArbitre(a);
	}
	
	@DeleteMapping("arbitre/{id}")
	public void deleteArbitre(@PathVariable Long id) {
		ar.deleteArbitre(id);
	}
	@PutMapping("arbitre")
	public arbitre updateArbitre(@RequestBody arbitre a) {
		return ar.updateArbitre(a);
	}

}
 
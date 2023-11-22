package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorie.arbitreRepositorie;
import com.example.demo.repositorie.*;
import com.example.demo.entities.*;


@Service
public class JoueurService {
	
	// Map<Long , Joueur> joueurs =new HashMap<>();
	  
	 @Autowired
	 joueurRepositorie jr;
	   public List<joueur> getAllJoueurs(){
		
		   return jr.findAll();
	   }
	   
	   public joueur addJoueur(joueur j) {
		
		  return (joueur) jr.save(j);
		
	   }
	   
	  public void deleteJoueur(Long id) {
		 
		  jr.deleteById(id);
	  }
	  public joueur updateJoueur(joueur j) {
		
		  return (joueur) jr.save(j);
	  }

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorie.arbitreRepositorie;
import com.example.demo.repositorie.*;
import com.example.demo.entities.*;

@Service
public class EquipeService {
	
	 @Autowired
	 equipeRepositorie er;
	   public List<equipe> getAllEquipes(){
		   return er.findAll();
	   }
	  
	   public equipe addEquipe(equipe p) {
		  return (equipe) er.save(p);
		
	   }
	   
	  public void deleteEquipe(Long id) {
		  er.deleteById(id);
	  }
	  public equipe updateEquipe(equipe p) {
		  return (equipe) er.save(p);
	  }
	  public equipe getEquipeById(Long id) {
			// 
			return er.getById(id);
		}
	  

}

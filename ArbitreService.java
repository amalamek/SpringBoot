package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorie.arbitreRepositorie;
import com.example.demo.repositorie.*;
import com.example.demo.entities.*;

@Service
public class ArbitreService {
	
	 @Autowired
	 arbitreRepositorie ar;
	   public List<arbitre> getAllArbitres(){
	
		   return ar.findAll();
	   }
	   
	   public arbitre addArbitre(arbitre a) {
		
		  return (arbitre) ar.save(a);
		
	   }
	   
	  public void deleteArbitre(Long id) {
		
		  ar.deleteById(id);
	  }
	  public arbitre updateArbitre(arbitre a) {
		
		  return (arbitre) ar.save(a);
	  }

}

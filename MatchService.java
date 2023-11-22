package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorie.arbitreRepositorie;
import com.example.demo.repositorie.*;
import com.example.demo.entities.*;


@Service
public class MatchService {
	
	@Autowired
	 matchRepositorie mt;
	   public List<matchT> getAllMatchs(){
	
		   return mt.findAll();
	   }
	   
	   public matchT addMatch(matchT m) {
		
		  return (matchT) mt.save(m);
		
	   }
	   
	  public void deleteMatch(Long id) {
		
		  mt.deleteById(id);
	  }
	  public matchT updateMatch(matchT m) {
		
		  return (matchT) mt.save(m);
	  }
}


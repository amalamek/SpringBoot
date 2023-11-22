package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositorie.arbitreRepositorie;
import com.example.demo.repositorie.*;
import com.example.demo.entities.*;
@Service
public class StadeService {
	
	@Autowired
	 stadeRepositorie st;
	   public List<stade> getAllStades(){
	
		   return st.findAll();
	   }
	   
	   public stade addStade(stade s) {
		
		  return (stade) st.save(s);
		
	   }
	   
	  public void deleteStade(Long id) {
		
		  st.deleteById(id);
	  }
	  public stade updateStade(stade s) {
		
		  return (stade) st.save(s);
	  }

}

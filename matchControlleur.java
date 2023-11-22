package com.example.demo.controlleur;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com. example.demo.service.EquipeService;
import com.example.demo.service.MatchService;
import com. example.demo.entities.*;
 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class matchControlleur {
	
	@Autowired
	MatchService mt;
	EquipeService e;
	@GetMapping("match")	
	  public List<matchT> getAllMatchs(){
		return mt.getAllMatchs();
	}
	
	
	@PostMapping("match")
	public matchT addMatch(@RequestBody matchT a) {
		return mt.addMatch(a);
	}
	
	@DeleteMapping("match/{id}")
	public void deleteMatch(@PathVariable Long id) {
		mt.deleteMatch(id);
	}
	@PutMapping("match")
	public matchT updateMatch(@RequestBody matchT a) {
		return mt.updateMatch(a);
	}
	@JsonFormat(pattern = "dd/MM/yyyy")
	 
	@GetMapping("match/date")

	public List<Long> matchsAt() {
		 List<matchT> list=mt.getAllMatchs();
		 List<Long> equipes=new ArrayList<>();
		 LocalDate date=LocalDate.parse("2021-02-28");
		 for (int i = 0; i<list.size(); i++) {
		if(list.get(i).getDate().equals(date)) {
		Long nomM=list.get(i).getIdMatch();
		equipes.add(nomM); 
		  }
		 }
		return equipes;	
	}
	
	 
	
	/*@GetMapping("match/equipes")
	public List<String> douxEquipe() {
		 List<Match> list=mt.getAllMatchs();
		 List<String> equipes=new ArrayList<>();
		 long var=3;
		for (int i = 0; i<list.size(); i++) {
		if(list.get(i).getIdMatch().equals(var)) {
		String nomM=list.get(i).getEquipes().getNomEquipe();
		equipes.add(nomM); 
		  }
		 }
		return equipes;	
	}*/

}

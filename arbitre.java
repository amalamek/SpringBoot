package com.example.demo.entities;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.entities.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class arbitre {
	@Id
	private Long idArbitre;
	private String nom;
	private String nationalite;
	 
}

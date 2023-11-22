package com.example.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

 

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
 

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class matchT {
	@Id
	private Long idMatch;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;
	@JsonFormat(pattern = "hh:mm:ss a")
	private LocalTime heure;
	
	 @ManyToOne
     @JsonBackReference(value = "arbitre")
    @JoinColumn(name="arb_id")
     private arbitre arbitre;
	 
	

}

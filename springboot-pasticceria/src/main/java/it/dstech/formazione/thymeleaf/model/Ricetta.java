package it.dstech.formazione.thymeleaf.model;

import java.time.LocalDateTime;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ricetta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@JsonFormat(pattern = "mm:ss")
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalDateTime tempo;
	private int difficolta;
	
	@ManyToMany
	private List<Ingrediente> listaIngredienti;
	private String descrizione;
	private double costo;
	@OneToOne
	private Dolce dolce;
	
	public Dolce getDolce() {
		return dolce;
	}

	public void setDolce(Dolce dolce) {
		this.dolce = dolce;
	}

	public Ricetta() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalDateTime tempo) {
		this.tempo = tempo;
	}

	public int getDifficolta() {
		return difficolta;
	}

	public void setDifficolta(int difficolta) {
		this.difficolta = difficolta;
	}

	public List<Ingrediente> getListaIngredienti() {
		return listaIngredienti;
	}

	public void setListaIngredienti(List<Ingrediente> listaIngredienti) {
		this.listaIngredienti = listaIngredienti;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	
	
	
}

package it.dstech.formazione.thymeleaf.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Dolce {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private int quantita;
	@OneToOne
	private Ricetta ricetta;
	private double costo;
	@ManyToMany
	private List<Ordinazione> Ordinazioni;
	
	public Dolce() {}


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

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}



	public double getCosto() {
		return costo;
	}

	public Ricetta getRicetta() {
		return ricetta;
	}


	public void setRicetta(Ricetta ricetta) {
		this.ricetta = ricetta;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	public List<Ordinazione> getOrdinazioni() {
		return Ordinazioni;
	}

	public void setOrdinazioni(List<Ordinazione> ordinazioni) {
		Ordinazioni = ordinazioni;
	}

	

}

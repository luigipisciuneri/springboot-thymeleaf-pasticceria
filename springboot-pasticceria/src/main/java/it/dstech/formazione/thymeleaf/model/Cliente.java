package it.dstech.formazione.thymeleaf.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String Cognome;
	@OneToMany
	private List<Ordinazione> ordinazione;
	
	public Cliente() {}

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

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public List<Ordinazione> getOrdinazione() {
		return ordinazione;
	}

	public void setOrdinazione(List<Ordinazione> ordinazione) {
		this.ordinazione = ordinazione;
	}
	
	
	
	
	

}

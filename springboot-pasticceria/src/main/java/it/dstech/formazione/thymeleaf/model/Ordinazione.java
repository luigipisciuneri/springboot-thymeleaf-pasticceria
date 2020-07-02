package it.dstech.formazione.thymeleaf.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ordinazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	@OneToOne
    private Cliente cliente;
	@OneToMany
    private List<Dolce> dolce;
    
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalDateTime dataConsegna;
	private double costo;
	private int sconto;
	
	
	
	public Ordinazione() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Dolce> getDolce() {
		return dolce;
	}

	public void setDolce(List<Dolce> dolce) {
		this.dolce = dolce;
	}

	public LocalDateTime getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(LocalDateTime dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto;
	}
	
	
	
	
	
}

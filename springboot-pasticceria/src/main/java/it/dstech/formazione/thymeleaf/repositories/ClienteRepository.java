package it.dstech.formazione.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.formazione.thymeleaf.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	

}

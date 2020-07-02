package it.dstech.formazione.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.formazione.thymeleaf.model.Ricetta;

public interface RicettaRepository extends JpaRepository<Ricetta, Long> {

}

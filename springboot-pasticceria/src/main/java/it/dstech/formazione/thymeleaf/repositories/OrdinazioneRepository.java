package it.dstech.formazione.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.formazione.thymeleaf.model.Ordinazione;

public interface OrdinazioneRepository extends JpaRepository<Ordinazione, Long> {

}

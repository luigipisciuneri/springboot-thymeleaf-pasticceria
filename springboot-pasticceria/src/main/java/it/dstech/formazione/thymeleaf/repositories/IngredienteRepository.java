package it.dstech.formazione.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.formazione.thymeleaf.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long>{

}

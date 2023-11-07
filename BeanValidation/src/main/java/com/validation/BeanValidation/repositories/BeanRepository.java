package com.validation.BeanValidation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.BeanValidation.entities.Usuario;

public interface BeanRepository extends JpaRepository<Usuario, Long>{

}

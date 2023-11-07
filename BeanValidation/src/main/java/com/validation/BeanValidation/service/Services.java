package com.validation.BeanValidation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.BeanValidation.entities.Usuario;
import com.validation.BeanValidation.repositories.BeanRepository;

@Service
public class Services {
	
	private final BeanRepository beanRepository;
 
    @Autowired
    public Services(BeanRepository beanRepository) {
        this.beanRepository = beanRepository;
    }

    public Usuario saveUsuario(Usuario usuario) {
        return beanRepository.save(usuario);
    }

    public Usuario getUsuarioById(Long id) {
        return beanRepository.findById(id).orElse(null);
    }

    public List<Usuario> getAllUsuarios() {
        return beanRepository.findAll();
    }

    public void deleteUsuario(Long id) {
    	beanRepository.deleteById(id);
    }

}

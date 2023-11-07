package com.validation.BeanValidation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.BeanValidation.entities.Usuario;
import com.validation.BeanValidation.service.Services;

@RestController
@RequestMapping("/user")
public class Controller {
	private final Services service;

    @Autowired
    public Controller(Services service) {
        this.service = service;
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return service.saveUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        return service.getUsuarioById(id);
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return service.getAllUsuarios();
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
    	service.deleteUsuario(id);
    }
}

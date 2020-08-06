package com.mastertech.carro.controller;

import com.mastertech.carro.model.Carro;
import com.mastertech.carro.model.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class CarroController {

    @GetMapping("/{modelo}")
    public Carro getCarro(@PathVariable String modelo, @AuthenticationPrincipal Usuario usuario){
        Carro carro = new Carro();
        carro.setDono(usuario.getNome());
        carro.setModelo(modelo);

        return carro;
    }
}

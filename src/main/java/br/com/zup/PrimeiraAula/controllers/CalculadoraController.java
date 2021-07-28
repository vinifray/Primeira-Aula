package br.com.zup.PrimeiraAula.controllers;

import br.com.zup.PrimeiraAula.dtos.SomaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @PostMapping("/soma")
    public int soma(@RequestBody SomaDTO somaDTO){
        return somaDTO.getPrimeiroNumero() + somaDTO.getSegundoNumero();
    }
}

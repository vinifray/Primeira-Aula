package br.com.zup.PrimeiraAula.controllers;

import br.com.zup.PrimeiraAula.dtos.RespostaDTO;
import br.com.zup.PrimeiraAula.dtos.SomaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @PostMapping("/soma")
    public RespostaDTO soma(@RequestBody SomaDTO somaDTO){
        int resultado = somaDTO.getPrimeiroNumero() + somaDTO.getSegundoNumero();
        RespostaDTO respostaDTO = new RespostaDTO(resultado);
        return respostaDTO;
    }

}

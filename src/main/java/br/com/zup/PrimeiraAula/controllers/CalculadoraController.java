package br.com.zup.PrimeiraAula.controllers;

import br.com.zup.PrimeiraAula.dtos.RespostaDTO;
import br.com.zup.PrimeiraAula.dtos.SomaDTO;
import br.com.zup.PrimeiraAula.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @PostMapping("/soma")
    public RespostaDTO retornarResultadoDaSoma(@RequestBody SomaDTO somaDTO){
        int resultado = calculadoraService.soma(somaDTO.getPrimeiroNumero(), somaDTO.getSegundoNumero());
        RespostaDTO respostaDTO = new RespostaDTO(resultado);
        return respostaDTO;
    }
    /*
    Metodo quando o controlador é um @Controller simples.

    Neste caso devemos usar o ResponseEntity para transformar a classe em json.

    @PostMapping("/soma")
    public ResponseEntity<RespostaDTO> retornarResultadoDaSoma(@RequestBody SomaDTO somaDTO){
        int resultado = calculadoraService.soma(somaDTO.getPrimeiroNumero(), somaDTO.getSegundoNumero());
        RespostaDTO respostaDTO = new RespostaDTO(resultado);
        return ResponseEntity.ok().body(respostaDTO);
    }

     */

}

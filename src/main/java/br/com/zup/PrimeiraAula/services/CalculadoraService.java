package br.com.zup.PrimeiraAula.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int soma(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
}

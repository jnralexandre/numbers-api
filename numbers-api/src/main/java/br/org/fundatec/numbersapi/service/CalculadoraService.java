package br.org.fundatec.numbersapi.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Double somarValores(Double primeiroValor, Double segundoValor) {

        Double resultadoSoma = (primeiroValor + segundoValor);
        return resultadoSoma;
    }

    public Double subtrairValores(Double primeiroValor, Double segundoValor) {

        Double resultadoSubtracao = (primeiroValor - segundoValor);
        return resultadoSubtracao;
    }

    public Double multiplicarValores(Double primeiroValor, Double segundoValor) {

        Double resultadoMultiplicacao = (primeiroValor * segundoValor);
        return resultadoMultiplicacao;
    }

    public Double dividirValores(Double primeiroValor, Double segundoValor) {

        Double resultadoDivisao = (primeiroValor / segundoValor);
        return resultadoDivisao;
    }

    public Double calcularRaizQuadrada(Double valor) {
        return Math.sqrt(valor);
    }

    public Double calcularRaizCubica(Double valor) {
        return Math.cbrt(valor);
    }

}

package br.org.fundatec.numbersapi.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;

    @Before
    public void init() {
        this.calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveSomarDoisValoresEResultarEm50() {
        Double resultadoEsperado = 50.0;
        Double resultadoSoma = calculadoraService.somarValores(30.0, 20.0);

        assertEquals(resultadoEsperado, resultadoSoma);
    }

    @Test
    public void deveSubtrairDoisValoresEResultarEm50() {
        Double resultadoEsperado = 50.0;
        Double resultadoSubtracao = calculadoraService.subtrairValores(100.0, 50.0);

        assertEquals(resultadoEsperado, resultadoSubtracao);
    }

    @Test
    public void deveMultiplicarDoisValoresEResultarEm50() {
        Double resultadoEsperado = 50.0;
        Double resultadoMultiplicacao = calculadoraService.multiplicarValores(25.0, 2.0);

        assertEquals(resultadoEsperado, resultadoMultiplicacao);
    }

    @Test
    public void deveDividirDoisValoresEResultarEm50() {
        Double resultadoEsperado = 50.0;
        Double resultadoDivisao = calculadoraService.dividirValores(100.0, 2.0);

        assertEquals(resultadoEsperado, resultadoDivisao);
    }

    @Test
    public void deveCalcularRaizQuadradaEResultarEm9() {
        Double resultadoEsperado = 9.0;
        Double resultadoRaizQuadrada = calculadoraService.calcularRaizQuadrada(81.0);

        assertEquals(resultadoEsperado, resultadoRaizQuadrada);
    }

    @Test
    public void deveCalcularRaizCubicaEResultarEm3() {
        Double resultadoEsperado = 3.0;
        Double resultadoRaizQuadrada = calculadoraService.calcularRaizCubica(27.0);

        assertEquals(resultadoEsperado, resultadoRaizQuadrada);
    }
}

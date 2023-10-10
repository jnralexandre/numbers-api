package br.org.fundatec.numbersapi.controller;

import br.org.fundatec.numbersapi.service.NumeroParOuImparService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/parOuImpar")
public class NumeroParOuImparController {

    private NumeroParOuImparService numeroParOuImparService;

    public NumeroParOuImparController(NumeroParOuImparService numeroParOuImparService) {
        this.numeroParOuImparService = numeroParOuImparService;
    }

    @GetMapping("/{numero}")
    public ResponseEntity<String> verificarNumeroParOuImpar(@PathVariable("numero") int numero) {

        Boolean retornoNumeroParOuImpar = numeroParOuImparService.verificarSeNumeroPar(numero);

        String resultado = null;
        if (retornoNumeroParOuImpar == true) {
            resultado = "O número " + numero + " é par.";
        } else {
            resultado = "O número " + numero + " é ímpar.";
        }

        return ResponseEntity.ok(resultado);
    }

}

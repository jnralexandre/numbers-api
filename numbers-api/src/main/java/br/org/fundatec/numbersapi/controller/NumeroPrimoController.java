package br.org.fundatec.numbersapi.controller;

import br.org.fundatec.numbersapi.service.NumeroPrimoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/numeroPrimo")
public class NumeroPrimoController {

    private NumeroPrimoService numeroPrimoService;

    public NumeroPrimoController(NumeroPrimoService numeroPrimoService) {
        this.numeroPrimoService = numeroPrimoService;
    }

    @GetMapping("/{numero}")
    public ResponseEntity<String> verificarNumeroParOuImpar(@PathVariable("numero") int numero) {

        Boolean retornoNumeroPrimo = numeroPrimoService.verificarSeNumeroPrimo(numero);

        String resultado = null;

        if (retornoNumeroPrimo == true) {
            resultado = "O número " + numero + " é primo.";
        } else {
            resultado = "O número " + numero + " não é primo.";
        }

        return ResponseEntity.ok(resultado);
    }

}
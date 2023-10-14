package br.org.fundatec.numbersapi.controller;

import br.org.fundatec.numbersapi.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/calculadora")
public class CalculadoraController {

    private CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/somar/{primeiroValor}/{segundoValor}")
    public ResponseEntity<String> somarValores(@PathVariable("primeiroValor") Double primeiroValor,
                                               @PathVariable("segundoValor") Double segundoValor) {

        Double resultadoSoma = calculadoraService.somarValores(primeiroValor, segundoValor);
        return ResponseEntity.ok("O resultado da soma é: " + resultadoSoma);
    }

    @GetMapping("/subtrair/{primeiroValor}/{segundoValor}")
    public ResponseEntity<String> subtrairValores(@PathVariable("primeiroValor") Double primeiroValor,
                                                  @PathVariable("segundoValor") Double segundoValor) {

        Double resultadoSubtracao = calculadoraService.subtrairValores(primeiroValor, segundoValor);
        return ResponseEntity.ok("O resultado da subtração é: " + resultadoSubtracao);
    }

    @GetMapping("/multiplicar/{primeiroValor}/{segundoValor}")
    public ResponseEntity<String> multiplicarValores(@PathVariable("primeiroValor") Double primeiroValor,
                                                     @PathVariable("segundoValor") Double segundoValor) {

        Double resultadoMultiplicacao = calculadoraService.multiplicarValores(primeiroValor, segundoValor);
        return ResponseEntity.ok("O resultado da multiplicação é: " + resultadoMultiplicacao);
    }

    @GetMapping("/dividir/{primeiroValor}/{segundoValor}")
    public ResponseEntity<String> dividirNumeros(@PathVariable("primeiroValor") Double primeiroValor,
                                                 @PathVariable("segundoValor") Double segundoValor) {

        Double resultadoDivisao = calculadoraService.dividirValores(primeiroValor, segundoValor);
        if (segundoValor == 0) {
            return ResponseEntity.ok("Não é possível uma divisão por 0.");
        } else {
            return ResponseEntity.ok("O resultado da divisão é: " + resultadoDivisao);
        }
    }

    @GetMapping("/raizQuadrada/{valor}")
    public ResponseEntity<String> calcularRaizQuadrada(@PathVariable("valor") Double valor) {

        Double resultadoRaizQuadrada = calculadoraService.calcularRaizQuadrada(valor);
        return ResponseEntity.ok("O resultado da raiz quadrada é: " + resultadoRaizQuadrada);
    }

    @GetMapping("/raizCubica/{valor}")
    public ResponseEntity<String> calcularRaizCubica(@PathVariable("valor") Double valor) {

        Double resultadoRaizCubica = calculadoraService.calcularRaizCubica(valor);
        return ResponseEntity.ok("O resultado da raiz cubica é: " + resultadoRaizCubica);
    }

}

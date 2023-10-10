package br.org.fundatec.numbersapi.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroPrimoService {

    public Boolean verificarSeNumeroPrimo(int numero) {
        Boolean retornoNumeroPrimo = null;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}

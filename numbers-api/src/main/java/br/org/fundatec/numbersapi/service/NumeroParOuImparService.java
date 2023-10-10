package br.org.fundatec.numbersapi.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroParOuImparService {

    public Boolean verificarSeNumeroPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

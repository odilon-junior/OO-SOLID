package br.com.capitulo1.services;

import br.com.capitulo1.models.Funcionario;

/**
 * Created by odilon on 13/03/16.
 */
public class CalcularDezOuVintePorcento implements RegraDeCalculo {

    private final double TETO_SALARIAL = 2300.00;

    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalario() < TETO_SALARIAL) {
            return funcionario.getSalario() * 0.90;
        } else {
            return funcionario.getSalario() * 0.80;
        }
    }
}

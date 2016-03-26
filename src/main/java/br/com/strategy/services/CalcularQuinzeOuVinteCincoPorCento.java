package br.com.strategy.services;

import br.com.strategy.models.Funcionario;

/**
 * Created by odilon on 13/03/16.
 */
public class CalcularQuinzeOuVinteCincoPorCento implements RegraDeCalculo {

    private final double TETO_SALARIAL = 4000.00;

    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalario() > TETO_SALARIAL) {
            return funcionario.getSalario() * 0.15;
        } else {
            return funcionario.getSalario() * 0.25;
        }
    }
}

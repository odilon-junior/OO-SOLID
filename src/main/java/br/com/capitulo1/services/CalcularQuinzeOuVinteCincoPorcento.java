package br.com.capitulo1.services;

import br.com.capitulo1.models.Funcionario;

/**
 * Created by odilon on 13/03/16.
 */
public class CalcularQuinzeOuVinteCincoPorcento implements RegraDeCalculo {

    private final double TETO_SALARIAL = 4000.00;

    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalario() > TETO_SALARIAL) {
            return funcionario.getSalario() * 0.85;
        } else {
            return funcionario.getSalario() * 0.75;
        }
    }
}

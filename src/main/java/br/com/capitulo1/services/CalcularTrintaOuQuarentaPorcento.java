package br.com.capitulo1.services;

import br.com.capitulo1.models.Funcionario;

/**
 * Created by odilon on 13/03/16.
 */
public class CalcularTrintaOuQuarentaPorcento implements RegraDeCalculo {

    private final double TETO_SALARIAL = 3000.00;

    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalario() > TETO_SALARIAL) {
            return funcionario.getSalario() * 0.30;
        } else {
            return funcionario.getSalario() * 0.60;
        }
    }
}

package br.com.capitulo1.models;

import br.com.capitulo1.services.RegraDeCalculo;
import br.com.capitulo1.services.CalcularDezOuVintePorCento;
import br.com.capitulo1.services.CalcularQuinzeOuVinteCincoPorCento;
import br.com.capitulo1.services.CalcularTrintaOuQuarentaPorCento;

/**
 * Created by odilon on 13/03/16.
 */
public enum Cargo {

    PROGRAMADOR(new CalcularDezOuVintePorCento()),
    DBA(new CalcularQuinzeOuVinteCincoPorCento()),
    TESTER(new CalcularTrintaOuQuarentaPorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regraDeCalculo) {
        this.regra = regraDeCalculo;
    }

    public RegraDeCalculo getRegra() {
        return this.regra;
    }
}

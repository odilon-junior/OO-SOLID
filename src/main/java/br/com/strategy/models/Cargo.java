package br.com.strategy.models;

import br.com.strategy.services.RegraDeCalculo;
import br.com.strategy.services.CalcularDezOuVintePorCento;
import br.com.strategy.services.CalcularQuinzeOuVinteCincoPorCento;
import br.com.strategy.services.CalcularTrintaOuQuarentaPorCento;

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

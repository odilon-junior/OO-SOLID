package br.com.capitulo1.models;

import br.com.capitulo1.services.RegraDeCalculo;
import br.com.capitulo1.services.CalcularDezOuVintePorcento;
import br.com.capitulo1.services.CalcularQuinzeOuVinteCincoPorcento;
import br.com.capitulo1.services.CalcularTrintaOuQuarentaPorcento;

/**
 * Created by odilon on 13/03/16.
 */
public enum Cargo {

    PROGRAMADOR(new CalcularDezOuVintePorcento()),
    DBA(new CalcularQuinzeOuVinteCincoPorcento()),
    TESTER(new CalcularTrintaOuQuarentaPorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regraDeCalculo) {
        this.regra = regraDeCalculo;
    }

    public RegraDeCalculo getRegra() {
        return this.regra;
    }
}

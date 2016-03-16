package br.com.capitulo1;

import br.com.capitulo1.models.Cargo;
import br.com.capitulo1.models.Funcionario;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by odilon on 13/03/16.
 */
public class CalculoSalarioTest {

    Funcionario funcionario;

    private final double DELTA = 0.0;

    @Before
    public void inicializa() {
        funcionario = new Funcionario();
    }

    @Test
    public void deveCalcularSalarioProgramdorComAumentoVintePorcento() {
        funcionario.setCargo(Cargo.PROGRAMADOR);
        funcionario.setSalario(1000.00);

        final double VALOR_ESPERADO = 200;
        final double valorCalculado = funcionario.getAumentoSalario();

        assertEquals(VALOR_ESPERADO, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularSalarioProgramdorComAumentoDezPorcento() {
        funcionario.setCargo(Cargo.PROGRAMADOR);
        funcionario.setSalario(4000);

        final double VALOR_ESPERADO = 400;
        final double valorCalculado = funcionario.getAumentoSalario();

        assertEquals(VALOR_ESPERADO, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularSalarioDBAComAumentoQuinzePorcento() {
        funcionario.setCargo(Cargo.DBA);
        funcionario.setSalario(5000);

        final double VALOR_ESPERADO = 750;
        final double valorCalculado = funcionario.getAumentoSalario();

        assertEquals(VALOR_ESPERADO, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularSalarioDBAComAumentoVinteCincoPorcento() {
        funcionario.setCargo(Cargo.DBA);
        funcionario.setSalario(1000);

        final double VALOR_ESPERADO = 250;
        final double valorCalculado = funcionario.getAumentoSalario();

        assertEquals(VALOR_ESPERADO, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularSalarioTesterComAumentoTrintaPorcento() {
        funcionario.setCargo(Cargo.TESTER);
        funcionario.setSalario(4000);

        final double VALOR_ESPERADO = 1200;
        final double valorCalculado = funcionario.getAumentoSalario();

        assertEquals(VALOR_ESPERADO, valorCalculado, DELTA);
    }

    @Test
    public void deveCalcularSalarioTesterComAumentoQuarentaPorcento() {
        funcionario.setCargo(Cargo.TESTER);
        funcionario.setSalario(2000);

        final double VALOR_ESPERADO = 800;
        final double valorCalculado = funcionario.getAumentoSalario();

        assertEquals(VALOR_ESPERADO, valorCalculado, DELTA);
    }
}

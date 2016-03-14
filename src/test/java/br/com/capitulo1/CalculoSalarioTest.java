package br.com.capitulo1;

import br.com.capitulo1.models.Cargo;
import br.com.capitulo1.models.Funcionario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by odilon on 13/03/16.
 */
public class CalculoSalarioTest {

    Funcionario funcionario;

    @Before
    public void inicializa() {
        funcionario = new Funcionario();
    }

    @Test
    public void deveCalcularSalarioComAumentoVintePorcento() {
        funcionario.setCargo(Cargo.PROGRAMADOR);
        funcionario.setSalario(1000.00);

        final double VALOR_ESPERADO = 200;
        final double valor_atual = funcionario.novoSalario();

        Assert.assertEquals(VALOR_ESPERADO, valor_atual);
    }
}

package br.com.capitulo2;

import br.com.capitulo2.models.Fatura;
import br.com.capitulo2.models.NFe;
import br.com.capitulo2.services.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

/**
 * Created by odilon on 15/03/16.
 */
public class GeraNotaFiscalTest {

    @Test
    public void deveInvocarAcoesPosGerarNFe() {
        AcaoPosGerarNotaFiscal enviarEmailMock = Mockito.mock(EnviarEmail.class);
        AcaoPosGerarNotaFiscal enviarSapMock = Mockito.mock(EnviarSap.class);
        AcaoPosGerarNotaFiscal salvarDadosMock = Mockito.mock(SalvarDados.class);

        List<AcaoPosGerarNotaFiscal> acoes = Arrays.asList(enviarEmailMock,
                enviarSapMock,
                salvarDadosMock);

        Fatura fatura = new Fatura();
        GeradorNotaFiscal geradorNotaFiscal = new GeradorNotaFiscal(acoes);

        NFe nfe = geradorNotaFiscal.gerar(fatura);

        Mockito.verify(enviarEmailMock).executar(nfe);
        Mockito.verify(enviarSapMock).executar(nfe);
        Mockito.verify(salvarDadosMock).executar(nfe);
    }
}

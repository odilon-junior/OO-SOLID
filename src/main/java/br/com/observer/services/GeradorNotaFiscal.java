package br.com.observer.services;

import br.com.observer.models.Fatura;
import br.com.observer.models.NFe;

import java.util.List;

/**
 * Created by odilon on 15/03/16.
 */
public class GeradorNotaFiscal {

    private List<AcaoPosGerarNotaFiscal> acoes;

    public GeradorNotaFiscal(List<AcaoPosGerarNotaFiscal> acoes) {
        this.acoes = acoes;
    }

    public NFe gerar(Fatura fatura) {

        NFe nfe = new NFe(fatura);

        for (AcaoPosGerarNotaFiscal acao : acoes) {
            acao.executar(nfe);
        }
        return nfe;
    }
}

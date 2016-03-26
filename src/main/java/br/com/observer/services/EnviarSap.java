package br.com.observer.services;

import br.com.observer.models.NFe;

/**
 * Created by odilon on 15/03/16.
 */
public class EnviarSap implements AcaoPosGerarNotaFiscal {
    public void executar(NFe nfe) {
        System.out.println("Enviando ao sap");
    }
}

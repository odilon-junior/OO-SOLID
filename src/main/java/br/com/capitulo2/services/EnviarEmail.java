package br.com.capitulo2.services;

import br.com.capitulo2.models.NFe;

/**
 * Created by odilon on 15/03/16.
 */
public class EnviarEmail implements AcaoPosGerarNotaFiscal {
    public void executar(NFe nfe) {
        System.out.println("Enviando email");
    }
}
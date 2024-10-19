package com.mycompany.exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmtpTest {
  @Test
  public void deveEnviarNotaFiscalParaOBancoDeDados() {
    NotaFiscal notaFiscal = new NotaFiscal();
    notaFiscal.setNomeDoCliente("Nome do Cliente");
    notaFiscal.setValorDaNota(1000);
    notaFiscal.setTipoDoServico("Outro");

    Smtp smtp = new Smtp();
    boolean retorno = smtp.envia(notaFiscal);

    assertEquals(true, retorno);
  }
}

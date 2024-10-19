package com.mycompany.exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NotaFiscalDaoTest {
  @Test
  public void deveEnviarNotaFiscalParaOBancoDeDados() {
    NotaFiscal notaFiscal = new NotaFiscal();
    notaFiscal.setNomeDoCliente("Nome do Cliente");
    notaFiscal.setValorDaNota(1000);
    notaFiscal.setTipoDoServico("Outro");

    NotaFiscalDao notaFiscalDao = new NotaFiscalDao();
    boolean retorno = notaFiscalDao.salva(notaFiscal);

    assertEquals(true, retorno);
  }
}

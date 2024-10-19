package com.mycompany.exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NotaFiscalTest {

  public NotaFiscalTest() {
  }

  @Test
  public void deveCriarNotaFiscalParaServicoDeConsultoria() {
    NotaFiscal notaFiscal = new NotaFiscal();
    notaFiscal.setNomeDoCliente("Nome do Cliente");
    notaFiscal.setValorDaNota(1000.00);
    notaFiscal.setTipoDoServico("Consultoria");
    double valorDoImposto = notaFiscal.calcularValorDoImposto();

    assertEquals(250.00, valorDoImposto);
  }

  @Test
  public void deveCriarNotaFiscalParaServicoDeTreinamento() {
    NotaFiscal notaFiscal = new NotaFiscal();
    notaFiscal.setNomeDoCliente("Nome do Cliente");
    notaFiscal.setValorDaNota(1000.00);
    notaFiscal.setTipoDoServico("Treinamento");
    double valorDoImposto = notaFiscal.calcularValorDoImposto();

    assertEquals(150.00, valorDoImposto);
  }

  @Test
  public void deveCriarNotaFiscalParaOutrosServicos() {
    NotaFiscal notaFiscal = new NotaFiscal();
    notaFiscal.setNomeDoCliente("Nome do Cliente");
    notaFiscal.setValorDaNota(1000);
    notaFiscal.setTipoDoServico("Outro");
    double valorDoImposto = notaFiscal.calcularValorDoImposto();

    assertEquals(60.00, valorDoImposto);
  }

}

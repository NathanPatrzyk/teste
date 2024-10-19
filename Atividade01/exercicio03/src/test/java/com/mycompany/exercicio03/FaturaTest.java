package com.mycompany.exercicio03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FaturaTest {

  @Test
  public void deveProcessar3BoletosComFaturaMarcadaComoPagaEValoresDosBoletosIguaisAoValorDaParcela() {
    Pagamento pagamento1 = new Pagamento();
    pagamento1.setData("17/10/2024");
    pagamento1.setValorPago(500);
    pagamento1.setTipo("BOLETO");

    Boleto boleto1 = new Boleto();
    boleto1.setCodigo(987001);
    boleto1.setData("17/10/2024");
    boleto1.setValorPago(500);
    boleto1.setPagamento(pagamento1);

    Pagamento pagamento2 = new Pagamento();
    pagamento2.setData("17/10/2024");
    pagamento2.setValorPago(400);
    pagamento2.setTipo("BOLETO");

    Boleto boleto2 = new Boleto();
    boleto2.setCodigo(987002);
    boleto2.setData("17/10/2024");
    boleto2.setValorPago(400);
    boleto2.setPagamento(pagamento2);

    Pagamento pagamento3 = new Pagamento();
    pagamento3.setData("17/10/2024");
    pagamento3.setValorPago(600);
    pagamento3.setTipo("BOLETO");

    Boleto boleto3 = new Boleto();
    boleto3.setCodigo(987003);
    boleto3.setData("17/10/2024");
    boleto3.setValorPago(600);
    boleto3.setPagamento(pagamento3);

    Fatura fatura = new Fatura();
    fatura.setNomeDoCliente("Nome do Cliente");
    fatura.setData("17/10/2024");
    fatura.setValorTotal(1500);

    fatura.adicionarBoleto(boleto1);
    fatura.adicionarBoleto(boleto2);
    fatura.adicionarBoleto(boleto3);

    assertEquals("PAGA", fatura.mostrarStatusDaFatura());
  }

  @Test
  public void deveProcessar3BoletosComFaturaMarcadaComoPagaEValoresDosBoletosAcimaDoValorDaParcela() {
    Pagamento pagamento1 = new Pagamento();
    pagamento1.setData("17/10/2024");
    pagamento1.setValorPago(1000);
    pagamento1.setTipo("BOLETO");

    Boleto boleto1 = new Boleto();
    boleto1.setCodigo(987001);
    boleto1.setData("17/10/2024");
    boleto1.setValorPago(1000);
    boleto1.setPagamento(pagamento1);

    Pagamento pagamento2 = new Pagamento();
    pagamento2.setData("17/10/2024");
    pagamento2.setValorPago(500);
    pagamento2.setTipo("BOLETO");

    Boleto boleto2 = new Boleto();
    boleto2.setCodigo(987002);
    boleto2.setData("17/10/2024");
    boleto2.setValorPago(500);
    boleto1.setPagamento(pagamento2);

    Pagamento pagamento3 = new Pagamento();
    pagamento3.setData("17/10/2024");
    pagamento3.setValorPago(250);
    pagamento3.setTipo("BOLETO");

    Boleto boleto3 = new Boleto();
    boleto3.setCodigo(987003);
    boleto3.setData("17/10/2024");
    boleto3.setValorPago(250);
    boleto1.setPagamento(pagamento3);

    Fatura fatura = new Fatura();
    fatura.setNomeDoCliente("Nome do Cliente");
    fatura.setData("17/10/2024");
    fatura.setValorTotal(1500);

    fatura.adicionarBoleto(boleto1);
    fatura.adicionarBoleto(boleto2);
    fatura.adicionarBoleto(boleto3);

    assertEquals("PAGA", fatura.mostrarStatusDaFatura());
  }

  @Test
  public void deveProcessar2BoletosComFaturaMarcadaComoNaoPagaEValoresDosBoletosAbaixoDoValorDaParcela() {
    Pagamento pagamento1 = new Pagamento();
    pagamento1.setData("17/10/2024");
    pagamento1.setValorPago(500);
    pagamento1.setTipo("BOLETO");

    Boleto boleto1 = new Boleto();
    boleto1.setCodigo(987001);
    boleto1.setData("17/10/2024");
    boleto1.setValorPago(500);
    boleto1.setPagamento(pagamento1);

    Pagamento pagamento2 = new Pagamento();
    pagamento2.setData("17/10/2024");
    pagamento2.setValorPago(400);
    pagamento2.setTipo("BOLETO");

    Boleto boleto2 = new Boleto();
    boleto2.setCodigo(987002);
    boleto2.setData("17/10/2024");
    boleto2.setValorPago(400);
    boleto1.setPagamento(pagamento2);

    Fatura fatura = new Fatura();
    fatura.setNomeDoCliente("Nome do Cliente");
    fatura.setData("17/10/2024");
    fatura.setValorTotal(2000);

    fatura.adicionarBoleto(boleto1);
    fatura.adicionarBoleto(boleto2);

    assertEquals("NÃO PAGA", fatura.mostrarStatusDaFatura());
  }
}

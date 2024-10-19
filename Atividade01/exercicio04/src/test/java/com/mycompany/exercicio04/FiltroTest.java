package com.mycompany.exercicio04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

public class FiltroTest {

  @Test
  public void deveFiltrarAsFaturasCorretamente() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Cliente cliente1 = new Cliente();
    cliente1.setNome("Nome do Cliente");
    cliente1.setDataDeInclusao(sdf.parse("10/10/2024"));
    cliente1.setEstado("SP");

    Cliente cliente2 = new Cliente();
    cliente2.setNome("Nome do Cliente");
    cliente2.setDataDeInclusao(sdf.parse("10/01/2023"));
    cliente1.setEstado("PR");

    Fatura fatura1 = new Fatura();
    fatura1.setCodigo(987001);
    fatura1.setValor(1500);
    fatura1.setData(sdf.parse("18/10/2024"));
    fatura1.setCliente(cliente1);

    Fatura fatura2 = new Fatura();
    fatura2.setCodigo(987002);
    fatura2.setValor(2500);
    fatura2.setData(sdf.parse("18/10/2024"));
    fatura2.setCliente(cliente2);

    Fatura fatura3 = new Fatura();
    fatura3.setCodigo(987003);
    fatura3.setValor(3000);
    fatura3.setData(sdf.parse("18/10/2024"));
    fatura3.setCliente(cliente1);

    Fatura fatura4 = new Fatura();
    fatura4.setCodigo(987002);
    fatura4.setValor(2250);
    fatura4.setData(sdf.parse("10/08/2024"));
    fatura4.setCliente(cliente2);

    Fatura fatura5 = new Fatura();
    fatura5.setCodigo(987002);
    fatura5.setValor(2750);
    fatura5.setData(sdf.parse("10/08/2024"));
    fatura5.setCliente(cliente1);

    Fatura fatura6 = new Fatura();
    fatura6.setCodigo(987003);
    fatura6.setValor(2800);
    fatura6.setData(sdf.parse("18/10/2024"));
    fatura6.setCliente(cliente2);

    Fatura fatura7 = new Fatura();
    fatura7.setCodigo(987003);
    fatura7.setValor(2800);
    fatura7.setData(sdf.parse("18/10/2024"));
    fatura7.setCliente(cliente1);

    Fatura fatura8 = new Fatura();
    fatura8.setCodigo(987003);
    fatura8.setValor(5000);
    fatura8.setData(sdf.parse("18/10/2024"));
    fatura8.setCliente(cliente2);

    Filtro filtro = new Filtro();

    filtro.adicionarFatura(fatura1);
    filtro.adicionarFatura(fatura2);
    filtro.adicionarFatura(fatura3);
    filtro.adicionarFatura(fatura4);
    filtro.adicionarFatura(fatura5);
    filtro.adicionarFatura(fatura6);
    filtro.adicionarFatura(fatura7);
    filtro.adicionarFatura(fatura8);

    filtro.filtrar();

    assertEquals(4, filtro.quantidadeDeFaturas());
  }
}
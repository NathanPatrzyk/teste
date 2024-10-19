package com.mycompany.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
  private String nomeDoCliente;
  private String data;
  private double valorTotal;
  private List<Boleto> boletos;

  public Fatura() {
    this.boletos = new ArrayList<Boleto>();
  }

  public String mostrarStatusDaFatura() {
    double soma = 0.0;
    for (int i = 0; i < boletos.size(); i++) {
      soma += boletos.get(i).getValorPago();
    }

    if (soma >= valorTotal) {
      return "PAGA";
    } else {
      return "NÃO PAGA";
    }
  }

  public boolean adicionarBoleto(Boleto boleto) {
    this.boletos.add(boleto);

    return true;
  }

  public boolean removerBoleto(int codigo) {
    this.boletos.remove(codigo);

    return true;
  }

  public String getNomeDoCliente() {
    return nomeDoCliente;
  }

  public void setNomeDoCliente(String nomeDoCliente) {
    this.nomeDoCliente = nomeDoCliente;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }
}

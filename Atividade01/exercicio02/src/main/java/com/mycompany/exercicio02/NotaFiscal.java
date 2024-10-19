package com.mycompany.exercicio02;

public class NotaFiscal {
  private String nomeDoCliente;
  private double valorDaNota;
  private double valorDoImposto;
  private String tipoDoServico;

  public String getNomeDoCliente() {
    return nomeDoCliente;
  }

  public void setNomeDoCliente(String nomeDoCliente) {
    this.nomeDoCliente = nomeDoCliente;
  }

  public double getValorDaNota() {
    return valorDaNota;
  }

  public void setValorDaNota(double valorDaNota) {
    this.valorDaNota = valorDaNota;
  }

  public double getValorDoImposto() {
    return valorDoImposto;
  }

  public void setValorDoImposto(double valorDoImposto) {
    this.valorDoImposto = valorDoImposto;
  }

  public double calcularValorDoImposto() {
    double valorDoImposto = 0;

    if (tipoDoServico == "Consultoria") {
      valorDoImposto = this.valorDaNota * 0.25;
    } else if (tipoDoServico == "Treinamento") {
      valorDoImposto = this.valorDaNota * 0.15;
    } else {
      valorDoImposto = this.valorDaNota * 0.06;
    }

    return valorDoImposto;
  }

  public String getTipoDoServico() {
    return tipoDoServico;
  }

  public void setTipoDoServico(String tipoDoServico) {
    this.tipoDoServico = tipoDoServico;
  }
}

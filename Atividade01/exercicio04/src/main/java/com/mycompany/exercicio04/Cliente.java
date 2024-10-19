package com.mycompany.exercicio04;

import java.util.Date;

public class Cliente {
  private String nome;
  private Date dataDeInclusao;
  private String estado;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getDataDeInclusao() {
    return dataDeInclusao;
  }

  public void setDataDeInclusao(Date dataDeInclusao) {
    this.dataDeInclusao = dataDeInclusao;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}

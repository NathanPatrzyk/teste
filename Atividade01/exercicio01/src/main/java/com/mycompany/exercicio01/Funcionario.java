package com.mycompany.exercicio01;

public class Funcionario {
  private String nome;
  private String email;
  private double salarioBase;
  private String cargo;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double calcularSalarioFinal() {
    double salarioFinal = 0;

    if (cargo == "Desenvolvedor") {
      if (this.salarioBase >= 3000) {
        salarioFinal = this.salarioBase * 0.8;
      } else if (this.salarioBase < 3000) {
        salarioFinal = this.salarioBase * 0.9;
      }
    } else if (cargo == "DBA" || cargo == "Testador") {
      if (this.salarioBase >= 2000) {
        salarioFinal = this.salarioBase * 0.75;
      } else if (this.salarioBase < 2000) {
        salarioFinal = this.salarioBase * 0.85;
      }
    } else if (cargo == "Gerente") {
      if (this.salarioBase >= 5000) {
        salarioFinal = this.salarioBase * 0.7;
      } else if (this.salarioBase < 5000) {
        salarioFinal = this.salarioBase * 0.8;
      }
    }

    return salarioFinal;
  }

}

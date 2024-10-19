package com.mycompany.exercicio01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

  public FuncionarioTest() {
  }

  @Test
  public void deveCalcularOSalarioDoDesenvolvedorComSalarioBaseMenorQue3000() {
    Funcionario desenvolvedor = new Funcionario();
    desenvolvedor.setNome("Desenvolvedor");
    desenvolvedor.setEmail("desenvolvedor@email.com");
    desenvolvedor.setSalarioBase(2000.00);
    desenvolvedor.setCargo("Desenvolvedor");

    double salarioFinal = desenvolvedor.calcularSalarioFinal();
    assertEquals(1800.00, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoDesenvolvedorComSalarioBaseMaiorOuIgualA3000() {
    Funcionario desenvolvedor = new Funcionario();
    desenvolvedor.setNome("Desenvolvedor");
    desenvolvedor.setEmail("desenvolvedor@email.com");
    desenvolvedor.setSalarioBase(5000.00);
    desenvolvedor.setCargo("Desenvolvedor");

    double salarioFinal = desenvolvedor.calcularSalarioFinal();
    assertEquals(4000.00, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoDBAComSalarioBaseMenorQue2000() {
    Funcionario dba = new Funcionario();
    dba.setNome("DBA");
    dba.setEmail("dba@email.com");
    dba.setSalarioBase(1500.00);
    dba.setCargo("DBA");

    double salarioFinal = dba.calcularSalarioFinal();
    assertEquals(1275.00, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoDBAComSalarioBaseMaiorOuIgualA2000() {
    Funcionario dba = new Funcionario();
    dba.setNome("DBA");
    dba.setEmail("dba@email.com");
    dba.setSalarioBase(2500.00);
    dba.setCargo("DBA");

    double salarioFinal = dba.calcularSalarioFinal();
    assertEquals(1875.00, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoTestadorComSalarioBaseMenorQue2000() {
    Funcionario testador = new Funcionario();
    testador.setNome("Testador");
    testador.setEmail("testador@email.com");
    testador.setSalarioBase(550.00);
    testador.setCargo("Testador");

    double salarioFinal = testador.calcularSalarioFinal();
    assertEquals(467.50, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoTestadorComSalarioBaseMaiorOuIgualA2000() {
    Funcionario testador = new Funcionario();
    testador.setNome("Testador");
    testador.setEmail("testador@email.com");
    testador.setSalarioBase(2800.00);
    testador.setCargo("Testador");

    double salarioFinal = testador.calcularSalarioFinal();
    assertEquals(2100.00, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoGerenteComSalarioBaseMenorQue5000() {
    Funcionario gerente = new Funcionario();
    gerente.setNome("Gerente");
    gerente.setEmail("gerente@email.com");
    gerente.setSalarioBase(2500.00);
    gerente.setCargo("Gerente");

    double salarioFinal = gerente.calcularSalarioFinal();
    assertEquals(2000.00, salarioFinal);
  }

  @Test
  public void deveCalcularOSalarioDoGerenteComSalarioBaseMaiorOuIgualA5000() {
    Funcionario gerente = new Funcionario();
    gerente.setNome("Gerente");
    gerente.setEmail("gerente@email.com");
    gerente.setSalarioBase(7000.00);
    gerente.setCargo("Gerente");

    double salarioFinal = gerente.calcularSalarioFinal();
    assertEquals(4900.00, salarioFinal);
  }

}
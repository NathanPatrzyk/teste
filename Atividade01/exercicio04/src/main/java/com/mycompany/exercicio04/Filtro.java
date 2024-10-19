package com.mycompany.exercicio04;

import java.util.Calendar;

import java.util.ArrayList;
import java.util.List;

public class Filtro {
  private List<Fatura> faturas;

  public Filtro() {
    this.faturas = new ArrayList<Fatura>();
  }

  public void filtrar() {
    Calendar umMesAtras = Calendar.getInstance();
    umMesAtras.add(Calendar.MONTH, -1);

    Calendar doisMessesAtras = Calendar.getInstance();
    doisMessesAtras.add(Calendar.MONTH, -2);

    this.faturas.removeIf(fatura -> fatura.getValor() < 2000);

    this.faturas.removeIf(fatura -> (fatura.getValor() >= 2000 && fatura.getValor() <= 2500)
        && (fatura.getData().before(umMesAtras.getTime())));

    this.faturas.removeIf(fatura -> (fatura.getValor() >= 2500 && fatura.getValor() <= 3000)
        && (fatura.getCliente().getDataDeInclusao().before(umMesAtras.getTime())));

    this.faturas.removeIf(fatura -> (fatura.getValor() > 4000)
        && ((fatura.getCliente().getEstado() == "PR")
            || (fatura.getCliente().getEstado() == "SC")
            || (fatura.getCliente().getEstado() == "RS")));
  }

  public int quantidadeDeFaturas() {
    return this.faturas.size();
  }

  public boolean adicionarFatura(Fatura fatura) {
    this.faturas.add(fatura);

    return true;
  }

  public boolean removerFatura(int codigo) {
    this.faturas.remove(codigo);

    return true;
  }
}

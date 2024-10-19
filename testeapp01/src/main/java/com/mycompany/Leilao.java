package com.mycompany;

import java.util.List;
import java.util.ArrayList;

public class Leilao {
    private String descricao;
    private List<Lance> lances;

    public Leilao(String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<>();
    }

    public void propoe(Lance lance) {
        lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }

    public String getDescricao() {
        return descricao;
    }
}

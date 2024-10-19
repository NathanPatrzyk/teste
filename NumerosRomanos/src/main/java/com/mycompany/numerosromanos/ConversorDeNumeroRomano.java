package com.mycompany.numerosromanos;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

    private static Map<String, Integer> tabela = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public int converte(String numeroEmRomano) {
        int acumulador = 0;
        int ultimoVizinhoDaDireita = 0;
        
        for (int i = numeroEmRomano.length()-1; i>=0; i--) {
            int atual = tabela.get(String.valueOf(numeroEmRomano.charAt(i)));
            
            int multiplicador = 1;
            if (atual < ultimoVizinhoDaDireita)
                multiplicador = -1;
                        
            acumulador += tabela.get(String.valueOf(numeroEmRomano.charAt(i))) * multiplicador;
            
            ultimoVizinhoDaDireita = atual;
        }

        return acumulador;
    }

}

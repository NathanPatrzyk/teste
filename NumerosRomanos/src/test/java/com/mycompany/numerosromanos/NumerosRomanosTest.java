package com.mycompany.numerosromanos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumerosRomanosTest {

    public NumerosRomanosTest() {
    }

    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("I");
        assertEquals(1, numero);
    }
    
    @Test
    public void deveEntenderOSimboloV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("V");
        assertEquals(5, numero);
    }
    
    @Test
    public void deveEntenderDoisSimbolosComoII() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("II");
        assertEquals(2, numero);
    }
    
    @Test
    public void deveEntenderDoisSimbolosComoXX() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("XX");
        assertEquals(20, numero);
    }
    
    @Test
    public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("XXII");
        assertEquals(22, numero);
    }
    
    @Test
    public void deveEntenderNumerosComoIX() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("IX");
        assertEquals(9, numero);
    }
    
      @Test
    public void deveEntenderNumerosComplexosComoXXIV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

        int numero = romano.converte("XXIV");
        assertEquals(24, numero);
    }

}

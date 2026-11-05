package javaessencial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContarVogaisTest {

    private final ContarVogais contarVogais = new ContarVogais();

    @Test
    @DisplayName("Conta vogais de um texto")
    void deveContarVogaisDoTexto(){
        int contador = contarVogais.contar("AEIOU");

        assertEquals(5, contador);
    }

    @ParameterizedTest(name = "\"{0}\" não tem vogais")
    @ValueSource(strings = {"xyz", "123", "!@#", "   "})
    @DisplayName("Retorna zero quando não há vogais")
    void deveRetornarZeroSemVogais(String texto) {
        assertEquals(0, contarVogais.contar(texto));
    }

}


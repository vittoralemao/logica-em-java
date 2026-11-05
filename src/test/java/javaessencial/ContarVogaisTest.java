package javaessencial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContarVogaisTest {

    private final ContarVogais contarVogais = new ContarVogais();

    @ParameterizedTest(name = "{0} tem {1} vogais")
    @CsvSource({
            "Java, 2",
            "AEIOU, 5",
            "'Oi, tudo bem', 5",
            "xyz, 0",
            "'', 0"
    })
    @DisplayName("Conta vogais ignorando maiúsculas e minúsculas")
    void deveContarVogais(String texto, int esperado) {
        assertEquals(esperado, contarVogais.contar(texto));
        assertEquals(esperado, contarVogais.contarOtimizado(texto));
    }

    @ParameterizedTest(name = "{0} não tem vogais")
    @ValueSource(strings = {"xyz", "123", "!@#", "   "})
    @DisplayName("Retorna zero quando não há vogais")
    void deveRetornarZeroSemVogais(String texto) {
        assertEquals(0, contarVogais.contar(texto));
        assertEquals(0, contarVogais.contarOtimizado(texto));
    }

}


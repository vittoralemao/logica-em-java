package javaessencial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @ParameterizedTest(name = "{0} invertido é {1}")
    @CsvSource({
            "hello, olleh",
            "Hannah, hannaH",
            "a, a",
            "ab, ba"
    })
    @DisplayName("Inverte o array de caracteres in-place")
    void deveInverterString(String entrada, String esperado) {
        char[] array = entrada.toCharArray();

        reverseString.reverseString(array);

        assertArrayEquals(esperado.toCharArray(), array);
    }
}

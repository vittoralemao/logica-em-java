package javaessencial;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @ParameterizedTest(name = "{0} é {1} em números inteiros")
    @CsvSource({
            "III, 3",
            "LVIII, 58",
            "MCMXCIV, 1994",
            "I, 1",
            "M, 1000"
    })
    void deveTransformarAlgarismoEmInteiro(String algarismo, int esperado) {
        assertEquals(esperado, romanToInteger.romanToInt(algarismo));
    }

    @ParameterizedTest(name = "{0} é {1} em números inteiros")
    @CsvSource({
            "IV, 4",
            "IX, 9",
            "XL, 40",
            "XC, 90",
            "CD, 400",
            "CM, 900"
    })
    void deveTransformarAlgarismoEmInteiroSubtraindo(String algarismo, int esperado) {
        assertEquals(esperado, romanToInteger.romanToInt(algarismo));
    }
}

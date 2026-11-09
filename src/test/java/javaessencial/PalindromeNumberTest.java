package javaessencial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @ParameterizedTest(name = "{0} é palindromo? {1}")
    @CsvSource({
            "2147483647, false",
            "12321, true",
            "121, true",
            "-121, false",
            "120, false",
            "10, false",
            "0, true"
    })
    @DisplayName("Descobre se o número é palindromo")
    void deveIndicarNumeroPalindromo(int numero, boolean esperado) {
        assertEquals(esperado, palindromeNumber.isPalindrome(numero));
        assertEquals(esperado, palindromeNumber.isPalindromeOtimizado(numero));
    }
}

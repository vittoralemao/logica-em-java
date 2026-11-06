package javaessencial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {
    private final ReverseWords reverseWords = new ReverseWords();

    @ParameterizedTest(name = "{0} invertido é {1}")
    @CsvSource({
            "Let's take LeetCode contest, s'teL ekat edoCteeL tsetnoc",
            "Mr Ding, rM gniD",
            "Java, avaJ",
            "a, a",
            "Vitor_Hugo, oguH_rotiV",
            "'a  b', 'a  b'",
            "'', ''"
    })
    @DisplayName("Inverte cada palavra mantendo a ordem")
    void deveInverterTexto(String texto, String esperado) {
        assertEquals(esperado, reverseWords.reverseWords(texto));
        assertEquals(esperado, reverseWords.reverseWordsOtimizado(texto));
    }

    @Test
    @DisplayName("O split descarta o espaço do final")
    void deveDescartarEspacoDoFinal() {
        assertEquals("ba", reverseWords.reverseWords("ab "));
        assertEquals("ba", reverseWords.reverseWordsOtimizado("ab "));
    }


}

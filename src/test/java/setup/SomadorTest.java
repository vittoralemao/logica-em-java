package setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomadorTest {

    private final Somador somador = new Somador();

    @Test
    @DisplayName("Soma dois números positivos")
    void deveSomarDoisNumerosPositivos() {
        int resultado = somador.somar(5, 5);

        assertEquals(10, resultado);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 0, 0",
            "-4, 4, 0",
            "-2, -3, -5"
    })
    @DisplayName("Soma casos de borda")
    void deveSomarCasosDeBorda(int a, int b, int esperado){
        assertEquals(esperado, somador.somar(a, b));
    }
}

package javaessencial;

/*
 * Problema: Palindrome Number (LeetCode 9) - Fácil
 * Padrão: Manipulação de dígitos (% e /)
 * Data: 2026-11-09 | Precisou de dica: sim
 * Abordagem: negativo nunca é palíndromo; percorro cada dígito com % 10 e / 10,
 *            monto o número invertido e comparo com o original.
 * Complexidade: O(log n) tempo, O(1) espaço (o laço roda uma vez por dígito)
 * Otimizado: inverte só a metade e compara com a frente → O(log n) tempo, O(1) espaço,
 *            com metade das voltas e sem risco de overflow
 * Aprendizado: dividir por 10 a cada passo gera O(log n); inverter um int pode
 *              estourar, por isso o invertido usa long.
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        long invertido = 0;

        while (x > 0) {
            invertido = invertido * 10 + x % 10;
            x = x / 10;
        }

        return invertido == original;
    }

    public boolean isPalindromeOtimizado(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int metadeInvertida = 0;

        while (x > metadeInvertida) {
            metadeInvertida = metadeInvertida * 10 + x % 10;
            x = x / 10;
        }

        return x == metadeInvertida || x == metadeInvertida / 10;
    }

}

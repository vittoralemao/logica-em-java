package javaessencial;

/*
 * Problema: Roman to Integer (LeetCode 13) - Fácil
 * Padrão: Tabela de consulta (Map) + comparação com o próximo
 * Data: 2026-11-10 | Precisou de dica: sim (vídeo)
 * Abordagem: guardo o valor de cada símbolo num Map; percorro a String e, se o
 *            valor atual for menor que o próximo, subtraio; senão, somo.
 * Complexidade: O(n) tempo, O(1) espaço (o Map tem sempre 7 entradas)
 * Aprendizado: a condição i + 1 < s.length() vem primeiro no && (curto-circuito)
 *              para não acessar um índice inexistente; tabela fixa vira constante.
 */

import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> VALORES = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000);

    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int atual = VALORES.get(s.charAt(i));

            if (i + 1 < s.length() && atual < VALORES.get(s.charAt(i + 1))) {
                total -= atual;
            } else {
                total += atual;
            }
        }

        return total;
    }
}

package javaessencial;

/*
 * Problema: Reverse String (LeetCode 344) - Fácil
 * Padrão: Dois ponteiros
 * Data: 2026-11-04 | Precisou de dica: sim
 * Abordagem: um ponteiro no início (esquerda) e outro no fim (direita);
 *            troco as letras das duas posições usando uma variável temporária
 *            e aproximo os ponteiros até eles se encontrarem no meio.
 * Complexidade: O(n) tempo, O(1) espaço
 * Aprendizado: índice é o endereço da gaveta; s[índice] é a letra dentro dela.
 */

public class ReverseString {

    public void reverseString(char[] s) {

        int esquerda = 0;
        int direita = s.length - 1;

        while (esquerda < direita) {
            char temp = s[esquerda];
            s[esquerda] = s[direita];
            s[direita] = temp;

            esquerda++;
            direita--;
        }
    }
}

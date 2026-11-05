package javaessencial;

/*
 * Problema: Contar Vogais (exercício próprio) - Fácil
 * Padrão: Percorrer string e contar
 * Data: 2026-11-04 | Precisou de dica: sim
 * Abordagem: converto o texto para minúsculo, percorro cada letra e
 *            comparo com as vogais; se for vogal, somo no contador.
 * Complexidade: O(n) tempo, O(n) espaço (toLowerCase e toCharArray criam cópias)
 * Otimizado: charAt + indexOf → O(n) tempo, O(1) espaço
 * Aprendizado: resolve o problema inteiro; o teste só simula o uso real.
 */

public class ContarVogais {

    public int contar(String texto) {
        String textoMinusculo = texto.toLowerCase();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;

        for (char letra : textoMinusculo.toCharArray()) {
            for (char vogal : vogais) {
                if (letra == vogal) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public int contarOtimizado(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));

            if ("aeiou".indexOf(letra) != -1) {
                contador++;
            }
        }

        return contador;
    }

}

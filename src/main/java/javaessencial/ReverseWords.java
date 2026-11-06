package javaessencial;

import java.util.ArrayList;
import java.util.List;

/*
 * Problema: Reverse Words in a String III (LeetCode 557) - Fácil
 * Padrão: Percorrer string + StringBuilder
 * Data: 2026-11-06 | Precisou de dica: não
 * Abordagem: separo a frase em palavras com split, inverto cada uma com
 *            StringBuilder.reverse e junto de volta com um espaço entre elas.
 * Complexidade: O(n) tempo, O(n) espaço (lista intermediária + String final)
 * Otimizado: monta direto num StringBuilder, sem a lista → O(n) tempo, O(n) espaço,
 *            com uma cópia a menos do texto
 * Aprendizado: o split descarta as partes vazias do FINAL ("ab " vira ["ab"]);
 *              split(" ", -1) mantém. String.join só coloca o separador entre os itens.
 */
public class ReverseWords {

    public String reverseWords(String s){
        String[] palavras = s.split(" ");
        List<String> palavrasInvertidas = new ArrayList<>();

        for (String palavra : palavras) {
            palavrasInvertidas.add(new StringBuilder(palavra).reverse().toString());
        }

        return String.join(" ", palavrasInvertidas);
    }

    public String reverseWordsOtimizado(String s) {
        String[] palavras = s.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palavras.length; i++){
            StringBuilder invertida = new StringBuilder(palavras[i]).reverse();
            resultado.append(invertida);

            if (i < palavras.length - 1) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }

}

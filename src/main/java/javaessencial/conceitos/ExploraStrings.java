package javaessencial.conceitos;

public class ExploraStrings {
    static void main(String[] args) {
        String palavra = "Java 25!";

        System.out.println(palavra.length()); // 8
        System.out.println(palavra.charAt(0)); // J
        System.out.println(palavra.charAt(palavra.length() - 1)); // !

        // Insere as letras e digitos em um Array.
        for (char c : palavra.toCharArray()) {

            // Se for letra exibe em MAIUSCULA.
            if (Character.isLetter(c)) {
                System.out.println(Character.toUpperCase(c));
            }
        }
        System.out.println();

        char digito = '7';
        int valor = digito - '0';
        System.out.println(valor + 1); // 8

        char letra = 'c'; // [3]
        int posicao = letra - 'a'; // [1]
        System.out.println(posicao); // [3] - [1] = [2]

        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b); // false - Espaço diferente na memória.
        System.out.println(a.equals(b)); // true - Comparação entre as duas variáveis.
    }
}

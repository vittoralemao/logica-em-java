package javaessencial.conceitos;

public class ExploraStringBuilder {

    static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append(i); // Adiciona numero[i]
            if (i < 5) {
                sb.append("-"); // Adiciona entre os numeros "-"
            }
        }
        System.out.println(sb.toString());

        StringBuilder palavra = new StringBuilder("Java");
        palavra.reverse(); // Inverte o texto
        System.out.println(palavra);

        String frase = "Eu gosto de java";
        String[] palavras = frase.split(" "); // Recorta a frase pelo espaço entre as palavras
        System.out.println(palavras[3]); // Java
        System.out.println(palavras.length); // 4
        System.out.println(String.join("_", palavras)); // Adiciona caracter entre as palavras

        int numero = Integer.parseInt("42"); // Transforma string em inteiro
        System.out.println(numero + 8); // Adiciona número

        String texto = String.valueOf(2026);
        System.out.println(texto.length());

        char[] letras = {'o','l','a'};
        System.out.println(new String(letras)); // Converte array(char) em string = "ola"

    }
}

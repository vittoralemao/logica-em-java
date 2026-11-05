package javaessencial.conceitos;

public class ExploraMemoria {
    static void main(String[] args) {
        int a = 10;
        int b = a; // copia o VALOR
        b = 20;
        System.out.println("a = " + a); // a = 10

        int[] x = {1, 2, 3};
        int[] y = x; // copia o ENDEREÇO
        y[0] = 99;
        System.out.println("x[0] = " + x[0]); // x[0] = 99

        int[] z = {99, 2, 3};
        System.out.println(x == y); // true (mesmo endereço)
        System.out.println(x == z); // false (endereços diferentes)

        char[] original = {'o', 'i'};
        char[] copia = original; // mesmo ENDEREÇO
        copia[1] = 'a'; // muda o morador da casa COMPARTILHADA
        System.out.println(original[1]); // a

        int[] numeros = {5};
        int valor = numeros[0]; // [0] abre a gaveta: copia o VALOR
        valor = 7; // muda só a variável valor
        System.out.println(numeros[0]);

        String s1 = "Java";
        String s2 = s1;
        s2 = s2 + "!"; // String imutável: cria uma casa NOVA
        System.out.println(s2); // Java
    }
}

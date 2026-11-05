package javaessencial.conceitos;

public class ExploraParametros {
    static void dobrar(int n) {
        n = n * 2;
    }

    static void dobrarPrimeiro(int[] arr) {
        arr[0] = arr[0] * 2;
    }

    static void substituir(int[] arr) {
        arr = new int[]{50, 50};
    }

    static void exclamar(String s) {
        s = s + "!";
    }

    static int dobrarERetornar(int n) {
        return n * 2;
    }

    static void main(String[] args) {
        int idade = 10;
        dobrar(idade); // n recebe cópia do VALOR; o 20 morre com o frame
        System.out.println(idade); // 10

        int[] lista = {3, 4};
        dobrarPrimeiro(lista); // aponta para o mesmo ENDEREÇO e muda o MORADOR da casa compartilhada
        System.out.println(lista[0]); // 6

        substituir(lista); // arr aponta para uma casa NOVA; lista continua na antiga
        System.out.println(lista[0]); // 6

        String nome = "Vitor";
        exclamar(nome); // s + "!" cria casa NOVA só para o s
        System.out.println(nome); // Vítor

        idade = dobrarERetornar(idade); // valor PROCESSADO e GUARDADO
        System.out.println(idade); // 20
    }
}

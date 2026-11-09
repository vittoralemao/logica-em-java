package javaessencial.conceitos;

public class ExploraNumeros {
    static void main(String[] args) {
        System.out.println(7 / 2); // 3
        System.out.println(7 % 2); // 1
        System.out.println(1234 % 10); // 4
        System.out.println(1234 / 10); // 123

        // Calcula soma dos digitos
        int n = 1234;
        int soma = 0;
        while (n > 0) {
            soma += n % 10;
            n = n / 10;
        }
        System.out.println(soma);

        int original = 1234;
        int invertido = 0;
        while (original > 0) {
            invertido = invertido * 10 + original % 10;
            original = original / 10;
        }
        System.out.println(invertido);

        int maximo = Integer.MAX_VALUE;
        System.out.println(maximo + 1);

        long seguro = (long) maximo + 1;
        System.out.println(seguro);

        try {
            Math.addExact(maximo, 1);
        } catch (ArithmeticException e) {
            System.out.println("Overflow detectado: " + e.getMessage());
        }

    }
}

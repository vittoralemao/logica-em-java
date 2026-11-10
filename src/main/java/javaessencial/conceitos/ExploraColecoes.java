package javaessencial.conceitos;

import java.util.*;

public class ExploraColecoes {

    static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana");
        System.out.println(nomes);
        System.out.println(nomes.get(1));
        System.out.println(nomes.size());

        Set<String> unicos = new HashSet<>(nomes);
        System.out.println(unicos.size());
        System.out.println(unicos.add("Bruno"));

        Map<String, Integer> idades = new HashMap<>();
        idades.put("Ana", 21);
        idades.put("Bruno", 30);
        idades.put("Ana", 22);
        System.out.println(idades.get("Ana"));
        System.out.println(idades.get("Carlos"));
        System.out.println(idades.getOrDefault("Carlos", 0));

        Map<Character, Integer> contagem = new HashMap<>();
                for (char c : "banana".toCharArray()) {
                    contagem.merge(c, 1, Integer::sum);
                }
        System.out.println(contagem);

        Map<Character, Integer> valores = Map.of('A', 1, 'B', 2, 'C', 3);
        int total = 0;
        for (char c : "CAB".toCharArray()) {
            total += valores.get(c);
        }
        System.out.println(total);
    }
}

# Lógica em Java

![Java](https://img.shields.io/badge/Java-25-orange)
![JUnit](https://img.shields.io/badge/JUnit-6-green)
![Maven](https://img.shields.io/badge/Maven-build-blue)

Estudo de lógica de programação e resolução de problemas em Java, com foco em entrevistas técnicas.
Este repositório registra minha evolução: do Java básico até problemas avançados de estruturas de dados e algoritmos.

## Objetivo

Resolver problemas no estilo de testes técnicos, reconhecendo padrões de resolução
(hashing, dois ponteiros, busca binária, grafos, programação dinâmica...) e explicando
a complexidade de cada solução.

## Como rodar

Pré-requisitos: Java 25 e Maven.

```bash
mvn test
```

Cada solução tem testes em JUnit que comprovam seu funcionamento, incluindo casos de borda.

## Estrutura

```
src/main/java/<padrão>/              → soluções
src/main/java/<padrão>/conceitos/    → explorações de conceitos (sem testes)
src/test/java/<padrão>/              → testes
```

Cada pacote corresponde a um padrão de resolução. Todo arquivo de solução começa com um
cabeçalho com: problema, padrão, data, se precisou de dica, abordagem, complexidade e aprendizado.

## Método

1. Entender o problema e listar casos de borda
2. Propor a força bruta e sua complexidade
3. Otimizar e implementar sem consulta
4. Testar com JUnit
5. Comparar com outras soluções e registrar o aprendizado
6. Revisar o problema após 7 e 30 dias (repetição espaçada)

## Progresso por fase

| Fase | Padrão | Pacote | Resolvidos | Status |
| --- | --- | --- | --- | --- |
| 0 | Setup do projeto | `setup` | - | ✅ Concluída |
| 1 | Java essencial | `javaessencial` | 2 | 🟡 Em andamento |
| 2 | Big-O, arrays e strings | `arraysstrings` | 0 | ⬜ Não iniciada |
| 3 | Hashing | `hashing` | 0 | ⬜ Não iniciada |
| 4 | Dois ponteiros e janela deslizante | `doisponteiros` | 0 | ⬜ Não iniciada |
| 5 | Pilha, fila e soma de prefixos | `pilha` | 0 | ⬜ Não iniciada |
| 6 | Recursão, ordenação e busca binária | `buscabinaria` | 0 | ⬜ Não iniciada |
| 7 | Listas ligadas | `listasligadas` | 0 | ⬜ Não iniciada |
| 8 | Árvores binárias e BST | `arvores` | 0 | ⬜ Não iniciada |
| 9 | Heap, intervalos e gulosos | `heap` | 0 | ⬜ Não iniciada |
| 10 | Grafos | `grafos` | 0 | ⬜ Não iniciada |
| 11 | Backtracking | `backtracking` | 0 | ⬜ Não iniciada |
| 12 | Programação dinâmica | `programacaodinamica` | 0 | ⬜ Não iniciada |

## Evolução

<!-- Adicione cada novo problema no TOPO da tabela -->

| Data | Problema | Padrão | Nível | Dica? | Revisões |
| --- | --- | --- | --- | --- | --- |
| 2026-11-04 | [Reverse String](src/main/java/javaessencial/ReverseString.java) | Dois ponteiros | Fácil | Sim | - |
| 2026-11-04 | [Contar Vogais](src/main/java/javaessencial/ContarVogais.java) | Percorrer string | Fácil | Sim | - |

## Simulados

<!-- 2 problemas cronometrados (1 fácil + 1 médio), a partir da Fase 6 -->

| Data | Problemas | Tempo total | Resolvidos | O que travou |
| --- | --- | --- | --- | --- |
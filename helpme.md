# 🆘 Help Me — Guia de bolso

Consulta rápida para o dia a dia do repositório **Lógica em Java**.

---

## 1. 🏷️ Tipos de commit (Conventional Commits)

**Formato:** `tipo(escopo): descrição`

- **tipo** → o que foi feito (tabela abaixo)
- **escopo** → onde foi feito (opcional; aqui, o nome do pacote)
- **descrição** → verbo no presente, em minúsculas, sem ponto final, até ~72 caracteres

| Tipo | Quando usar | Exemplo |
| :--- | :--- | :--- |
| `feat` | Nova solução de problema | `feat(hashing): resolve Two Sum com HashMap O(n)` |
| `fix` | Corrigiu uma solução que estava errada | `fix(pilha): trata string vazia em Valid Parentheses` |
| `refactor` | Melhorou uma solução que já funcionava | `refactor(hashing): otimiza Two Sum de O(n²) para O(n)` |
| `test` | Adicionou ou ajustou testes | `test(arraysstrings): adiciona casos de borda em Move Zeroes` |
| `docs` | Mexeu só em documentação (README, helpme) | `docs: atualiza tabela de evolução` |
| `chore` | Configuração e manutenção do projeto | `chore: atualiza versão do JUnit` |
| `style` | Só formatação, sem mudar lógica | `style(grafos): ajusta indentação em Number of Islands` |

> 💡 **Regra de ouro:** um commit = uma mudança. Resolveu um problema? Um commit só para ele.

---

## 2. 🔁 Fluxo do dia a dia

Depois de resolver cada problema:

```bash
git status
git add .
git commit -m "feat(pacote): resolve Nome do Problema"
git push
```

---

## 3. 💻 Comandos Git mais usados

### Dia a dia

| Comando | O que faz |
| :--- | :--- |
| `git status` | Mostra o que mudou e o que está preparado para o commit |
| `git add .` | Prepara **todos** os arquivos alterados |
| `git add caminho/Arquivo.java` | Prepara **só um** arquivo |
| `git commit -m "mensagem"` | Cria o commit com a mensagem |
| `git push` | Envia os commits para o GitHub |
| `git pull` | Traz as atualizações do GitHub para a sua máquina |
| `git log --oneline` | Mostra o histórico resumido, um commit por linha |
| `git diff` | Mostra as mudanças linha a linha (antes do `add`) |

### Desfazer coisas

| Comando | O que faz | Cuidado |
| :--- | :--- | :--- |
| `git restore Arquivo.java` | Descarta as mudanças **não preparadas** do arquivo | ⚠️ As mudanças são perdidas |
| `git restore --staged Arquivo.java` | Tira o arquivo do `add`, mas mantém as mudanças | Seguro |
| `git commit --amend -m "nova mensagem"` | Corrige a mensagem do **último** commit | ⚠️ Só antes do `push` |

### Só na primeira vez (projeto novo)

| Comando | O que faz |
| :--- | :--- |
| `git init -b main` | Transforma a pasta em repositório, com o branch `main` |
| `git remote add origin URL` | Conecta ao repositório do GitHub |
| `git push -u origin main` | Primeiro envio; depois disso, basta `git push` |

---

## 4. 🧪 Comandos Maven

| Comando | O que faz |
| :--- | :--- |
| `mvn test` | Compila e roda **todos** os testes |
| `mvn test -Dtest=TwoSumTest` | Roda **só uma** classe de teste |
| `mvn clean test` | Apaga a pasta `target/` e roda tudo do zero (use quando algo estiver "estranho") |
# 📝 Gerenciador de Tarefas

Aplicação de linha de comando (CLI) feita em Java para gerenciar tarefas do dia a dia. As tarefas são salvas em um arquivo `.txt` e recarregadas automaticamente ao abrir o programa.

---

## ✨ Funcionalidades

- ✅ Adicionar tarefas com título, descrição e **prioridade** (Alta, Média ou Baixa)
- ✏️ Editar tarefas existentes (título, descrição e prioridade)
- 📋 Listar todas as tarefas
- ☑️ Concluir uma tarefa pelo ID
- 🗑️ Limpar tarefas concluídas
- 💾 Salvar tarefas em arquivo `.txt`
- 📂 Carregar tarefas automaticamente ao iniciar

---

## 🚀 Como rodar o projeto

### Pré-requisitos

- Java 8 ou superior instalado
- IntelliJ IDEA (ou qualquer IDE Java)

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/HudsonAlvesGracino/task-manager-cli.git
```
2. Abra o projeto no IntelliJ IDEA
3. Execute a classe `Main.java`

---

## 🖥️ Como usar

Ao rodar o programa, um menu aparece no console:

```
=== GERENCIADOR DE TAREFAS ===
1 - Adicionar tarefa
2 - Listar tarefas
3 - Concluir tarefa
4 - Editar tarefa
5 - Limpar tarefas concluidas
6 - Salvar e sair
```

Digite o número da opção desejada e siga as instruções.

- Ao **adicionar** uma tarefa, você informa título, descrição e prioridade (`Alta`, `Media` ou `Baixa`).
- Ao **editar** uma tarefa, você informa o ID e os novos valores de título, descrição e prioridade.
- Ao escolher a opção **6**, as tarefas são salvas no arquivo `tarefas.txt` e o programa encerra.

---

## 📁 Estrutura do projeto

```
task-manager-cli/
├── src/
│   ├── Main.java          # Ponto de entrada, menu principal
│   ├── Task.java          # Modelo da tarefa
│   ├── TaskManager.java   # Gerencia a lista de tarefas
│   ├── FileStorage.java   # Salva e carrega tarefas em arquivo
│   └── Prioridade.java    # Enum com os níveis de prioridade
└── tarefas.txt            # Gerado automaticamente ao salvar
```

### Responsabilidade de cada classe

| Classe | Responsabilidade |
|---|---|
| `Main` | Controla o fluxo e o menu do programa |
| `Task` | Representa uma tarefa (id, título, descrição, status, prioridade) |
| `TaskManager` | Adiciona, lista, conclui, edita e limpa tarefas |
| `FileStorage` | Salva e carrega tarefas no arquivo `.txt` |
| `Prioridade` | Enum com os valores `ALTA`, `MEDIA` e `BAIXA` |

---

## 💾 Persistência de dados

As tarefas são salvas no arquivo `tarefas.txt` na raiz do projeto. Exemplo de conteúdo:

```
ID 1 | [] Estudar Java | Aprender orientação a objetos | [ALTA]
ID 2 | [X] Fazer café | Café coado bem forte | [BAIXA]
```

- `[]` → tarefa pendente
- `[X]` → tarefa concluída
- `[ALTA]` / `[MEDIA]` / `[BAIXA]` → nível de prioridade da tarefa

---

## 🛠️ Tecnologias

- Java
- `BufferedWriter` / `BufferedReader` para leitura e escrita de arquivos
- `Scanner` para entrada do usuário no console
- `Enum` para representar os níveis de prioridade

---

## 📌 Melhorias futuras

- [ ] Filtrar tarefas por status ou prioridade
- [ ] Interface gráfica

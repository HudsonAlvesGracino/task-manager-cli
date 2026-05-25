# 📝 Gerenciador de Tarefas
 
Aplicação de linha de comando (CLI) feita em Java para gerenciar tarefas do dia a dia. As tarefas são salvas em um arquivo `.txt` e recarregadas automaticamente ao abrir o programa.
 
---
 
## ✨ Funcionalidades
 
- ✅ Adicionar tarefas com título e descrição
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
   git clone https://github.com/seu-usuario/gerenciador-de-tarefas.git
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
4 - Limpar tarefas concluidas
5 - Salvar e sair
```
 
Digite o número da opção desejada e siga as instruções. Ao escolher **opção 5**, as tarefas são salvas no arquivo `tarefas.txt` e o programa encerra.
 
---
 
## 📁 Estrutura do projeto
 
```
gerenciador-de-tarefas/
├── src/
│   ├── Main.java          # Ponto de entrada, menu principal
│   ├── Task.java          # Modelo da tarefa
│   ├── TaskManager.java   # Gerencia a lista de tarefas
│   └── FileStorage.java   # Salva e carrega tarefas em arquivo
└── tarefas.txt            # Gerado automaticamente ao salvar
```
 
### Responsabilidade de cada classe
 
| Classe | Responsabilidade |
|---|---|
| `Main` | Controla o fluxo e o menu do programa |
| `Task` | Representa uma tarefa (id, título, descrição, status) |
| `TaskManager` | Adiciona, lista, conclui e limpa tarefas |
| `FileStorage` | Salva e carrega tarefas no arquivo `.txt` |
 
---
 
## 💾 Persistência de dados
 
As tarefas são salvas no arquivo `tarefas.txt` na raiz do projeto. Exemplo de conteúdo:
 
```
ID 1 | [] Estudar Java | Aprender orientação a objetos
ID 2 | [X] Fazer café | Café coado bem forte
```
 
- `[]` → tarefa pendente  
- `[X]` → tarefa concluída
---
 
## 🛠️ Tecnologias
 
- Java
- `BufferedWriter` / `BufferedReader` para leitura e escrita de arquivos
- `Scanner` para entrada do usuário no console
---
 
## 📌 Melhorias futuras
 
- [ ] Editar tarefas existentes
- [ ] Filtrar tarefas por status
- [ ] Definir prioridade para cada tarefa
- [ ] Interface gráfica
 

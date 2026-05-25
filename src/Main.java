// Classe main

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean parar = true;
        int idParaConcluir;

        List<Task> tarefasSalvas = FileStorage.carregarTarefas();

        for (Task t : tarefasSalvas)
            taskManager.addTasks(t);

        while (parar) {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Limpar tarefas concluidas");
            System.out.println("5 - Salvar e sair");
            System.out.println("Escolha uma opção:");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Escreva o titulo da sua tarefa");
                    String titulo = scanner.nextLine();
                    System.out.println("Escreva a descrição do seu projeto");
                    String descricao = scanner.nextLine();
                    List<Task> atuais = taskManager.getTasks();
                    int proximoId;
                    if (atuais.isEmpty()){
                        proximoId = 1;
                    }else {
                        Task ultimaTarefa = atuais.get(atuais.size() - 1);
                        proximoId = ultimaTarefa.getId() + 1;
                    }
                    Task novaTarefa = new Task(proximoId, titulo, descricao);
                    taskManager.addTasks(novaTarefa);
                    System.out.println("[Sucesso] Sua tarefa foi adicionada com sucesso\n");
                    break;
                case 2:
                    List<Task> tarefaSalva = taskManager.getTasks();
                    System.out.println("\n== SUAS TAREFAS ==");
                    for (Task t : tarefaSalva){
                        System.out.println(t);
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID da tarefa que voce quer concluir");
                    idParaConcluir = scanner.nextInt();
                    scanner.nextLine();
                    taskManager.concluirTarefa(idParaConcluir);
                    System.out.println("[Sucesso] a tarefa foi concluida com sucesso\n");
                    break;

                case 4:
                    taskManager.limparConcluidas();
                    System.out.println("[Sucesso] voce limpou as tarefas concluidas\n");
                    break;

                case 5:
                    parar = false;
                    FileStorage.salvarTarefas(taskManager.getTasks());
                    System.out.println("Salvando dados e finalizando sistema...");
                    break;
            }
        }
    }
}

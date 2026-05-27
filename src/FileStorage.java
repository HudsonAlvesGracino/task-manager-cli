// classe FileStorage

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorage {
    public static void salvarTarefas(List<Task> tasks){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tarefas.txt"))) {
            for (Task t : tasks) {
                writer.write(t.toString());
                writer.newLine();
            }
        }catch (IOException e) {
            System.out.println("[Erro] Não foi possível salvar o arquivo: " + e.getMessage());
    }
}
    public static List<Task> carregarTarefas(){
        List<Task> tarefasCarregadas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("tarefas.txt"))) {
            String linha;
            while ((linha = reader.readLine())!= null){
                String[] partes = linha.split("\\|");
                int id = Integer.parseInt(partes[0].replace("ID ", "").trim());
                String titulo = partes[1].replace("[] ", "").replace("[X] ", "").trim();
                String descricao = partes[2].trim();
                String prioridade = partes[3].replace("[", "").replace("]", "").trim();
                Task tarefa = new Task(Prioridade.valueOf(prioridade), id, titulo, descricao);
                if (linha.contains("[X]")){
                    tarefa.setEstaCompleto(true);
                }

                tarefasCarregadas.add(tarefa);
            }
        }catch (IOException e){
            System.out.println("Nenhum arquivo foi encontrado. Iniciando sistema vazio.");
        }
        return tarefasCarregadas;
    }
}

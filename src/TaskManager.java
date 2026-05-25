//classe TaskManager

import java.util.ArrayList;
import java.util.List;


public class TaskManager {
    private List<Task> myTasks;

    public TaskManager() {
        this.myTasks = new ArrayList<>();
    }

    public void addTasks(Task tarefaRecebida) {
        this.myTasks.add(tarefaRecebida);
    }

    public List<Task> getTasks() {
        return this.myTasks;
    }

    public void concluirTarefa(int idProcurado) {
        for (Task t : myTasks) {
            if (t.getId() == idProcurado) {
                t.setEstaCompleto(true);

            }
        }
    }
    public void limparConcluidas() {
        this.myTasks.removeIf(t -> t.isEstaCompleto());
    }
}

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

    public void editarTarefa(int ID, String novoTitulo, String novaDescricao, Prioridade novaPrioridade) {
        for (Task t : myTasks) {
            if (t.getId() == ID) {
                t.setTitulo(novoTitulo);
                t.setDescricao(novaDescricao);
                t.setPrioridade(novaPrioridade);
            }
        }
    }

    public void concluirTarefa(int idProcurado) {
        for (Task t : myTasks) {
            if (t.getId() == idProcurado) {
                t.setEstaCompleto(true);

            }
        }
    }

    public List<Task> filtroPorConcluida() {
        List<Task> filtroPorConcluida = new ArrayList<>();
        for (Task t: myTasks){
            if (t.isEstaCompleto()){
                filtroPorConcluida().add(t);
            }
        }
        return filtroPorConcluida;
    }

    public List<Task> filtroPorPrioridade(Prioridade prioridade) {
        List<Task> filtroPorPrioridade = new ArrayList<>();
        for (Task t: myTasks){
            if (t.getPrioridade().equals(prioridade)){
                filtroPorPrioridade.add(t);
            }
        }
        return filtroPorPrioridade;
    }

    public void limparConcluidas() {
        this.myTasks.removeIf(t -> t.isEstaCompleto());
    }
}

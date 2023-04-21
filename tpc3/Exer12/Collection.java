import java.time.LocalDate;
import java.util.ArrayList;

public class Collection {
    private ArrayList<Tarefa> tarefas;

    public Collection() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void modificarTarefa(Tarefa tarefaAntiga, Tarefa tarefaNova) {
        int index = tarefas.indexOf(tarefaAntiga);
        tarefas.set(index, tarefaNova);
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public ArrayList<Tarefa> getTarefasDoDia(int year, int month, int day) {
        ArrayList<Tarefa> tarefasDoDia = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.ocorreEm(year, month, day)) {
                tarefasDoDia.add(tarefa);
            }
        }
        return tarefasDoDia;
    }
}

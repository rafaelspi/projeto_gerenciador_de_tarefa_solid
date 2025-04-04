import java.util.ArrayList;
import java.util.List;

class TarefaRepositorio implements ITarefaRepositorio {
    private final List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
    }

    @Override
    public Tarefa obterTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            return tarefas.get(indice);
        }
        throw new IndexOutOfBoundsException("Índice inválido.");
    }

    @Override
    public List<Tarefa> listarTarefas() {
        return new ArrayList<>(tarefas);
    }
}

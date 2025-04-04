import java.util.List;

interface ITarefaRepositorio {
    void adicionarTarefa(Tarefa tarefa);
    void removerTarefa(int indice);
    Tarefa obterTarefa(int indice);
    List<Tarefa> listarTarefas();
}
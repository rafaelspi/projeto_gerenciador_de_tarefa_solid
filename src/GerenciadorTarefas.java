import java.util.List;

class GerenciadorTarefas {
    private final ITarefaRepositorio repositorio;

    public GerenciadorTarefas(ITarefaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarTarefa(String descricao) {
        repositorio.adicionarTarefa(new Tarefa(descricao));
    }

    public void removerTarefa(int indice) {
        repositorio.removerTarefa(indice);
    }

    public void marcarTarefaComoConcluida(int indice) {
        Tarefa tarefa = repositorio.obterTarefa(indice);
        tarefa.marcarComoConcluida();
    }

    public List<Tarefa> listarTarefas() {
        return repositorio.listarTarefas();
    }
}
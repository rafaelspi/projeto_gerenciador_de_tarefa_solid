import java.util.Scanner;
import java.util.List;

class InterfaceUsuario {
    private final Scanner scanner;
    private final GerenciadorTarefas gerenciador;

    public InterfaceUsuario(Scanner scanner, GerenciadorTarefas gerenciador) {
        this.scanner = scanner;
        this.gerenciador = gerenciador;
    }

    public void executar() {
        int opcao = 0;
        while (opcao != 5) {
            exibirMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                processarOpcao(opcao);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\nGerenciador de Tarefas");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Remover tarefa");
        System.out.println("3. Marcar tarefa como concluída");
        System.out.println("4. Listar tarefas");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                System.out.print("Digite a descrição da tarefa: ");
                String descricao = scanner.nextLine();
                gerenciador.adicionarTarefa(descricao);
                System.out.println("Tarefa adicionada com sucesso!");
                break;
            case 2:
                System.out.print("Digite o índice da tarefa a ser removida: ");
                int indiceRemover = scanner.nextInt();
                gerenciador.removerTarefa(indiceRemover);
                System.out.println("Tarefa removida com sucesso!");
                break;
            case 3:
                System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                int indiceConcluir = scanner.nextInt();
                gerenciador.marcarTarefaComoConcluida(indiceConcluir);
                System.out.println("Tarefa marcada como concluída!");
                break;
            case 4:
                List<Tarefa> tarefas = gerenciador.listarTarefas();
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa encontrada.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ". " + tarefas.get(i));
                    }
                }
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}

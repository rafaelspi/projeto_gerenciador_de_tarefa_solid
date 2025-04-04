
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            TarefaRepositorio repositorio = new TarefaRepositorio();
            GerenciadorTarefas gerenciador = new GerenciadorTarefas(repositorio);
            InterfaceUsuario ui = new InterfaceUsuario(scanner, gerenciador);
            ui.executar();
    }
}
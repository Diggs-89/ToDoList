package Lista;
import java.util.Scanner;
public class Tarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[10];
        int num = 0;
        while (num != 5) {
            System.out.println("\n-----Lista de tarefas-----");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    System.out.println("Opção escolhida: Adicionar tarefa.");
                    int banana1 = -1;
                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] == null) {
                            banana1 = i;
                            break;
                        }
                    }
                    if (banana1 == -1) {
                        System.out.println("A lista de tarefas está cheia!");
                    } else {
                        System.out.print("Digite a tarefa: ");
                        tarefas[banana1] = scanner.nextLine();
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Opção escolhida: Listar tarefas.");
                    
                case 3:
                    System.out.println("Opção escolhida: Concluir tarefa.");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Excluir tarefa.");
                    break;
                case 5:
                    System.out.println("Saindo do sistema. Adeus!");
                    System.exit(0);
                    break;
            }
        }
    }
}

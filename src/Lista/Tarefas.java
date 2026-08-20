package Lista;
import java.util.Scanner;
public class Tarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] atividades = new String[10];
        boolean[] prontas = new boolean[10];
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
                    for (int i = 0; i < atividades.length; i++) {
                        if (atividades[i] == null) {
                            banana1 = i;
                            break;
                        }
                    }                   
                    if (banana1 == -1) {
                        System.out.println("A lista de tarefas está cheia!");
                    } else {
                        System.out.print("Digite a tarefa: ");
                        atividades[banana1] = scanner.nextLine();
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("\nOpção escolhida: Listar tarefas.");
                    boolean temTarefa = false;                   
                    for (int i = 0; i < atividades.length; i++) {
                        if (atividades[i] != null) {
                            temTarefa = true;
                            String status = prontas[i] ? "[X]" : "[]";
                            System.out.println(i + " - " + atividades[i] + " " + status);
                        }
                    }                    
                    if (!temTarefa) {System.out.println("Nenhuma tarefa cadastrada no momento.");
                    }
                    break;
                case 3:
                    System.out.println("\nOpção escolhida: Concluir tarefa.");
                    System.out.print("Digite o número da tarefa que deseja concluir: ");
                    int Concluir = scanner.nextInt();
                    scanner.nextLine();
                    if (Concluir >= 0 && Concluir < atividades.length && atividades[Concluir] != null) {
                        prontas[Concluir] = true;
                        System.out.println("Tarefa \"" + atividades[Concluir] + "\" marcada como concluída!");
                    } else {
                        System.out.println("Número de tarefa inválido!");
                    }
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

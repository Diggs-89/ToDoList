package Lista;
import java.util.Scanner;
public class ToDoListProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
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
                    System.out.println("\nOpção escolhida: Listar tarefas.");
                    boolean existetarefa = false;                   
                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] != null) {
                            existetarefa = true;
                            String status = concluidas[i] ? "[X]" : "[]";
                            System.out.println(i + " - " + tarefas[i] + " " + status);
                        }
                    }                    
                    if (!existetarefa) {System.out.println("Nenhuma tarefa cadastrada no momento.");
                    }
                    break;
                case 3:
                    System.out.println("\nOpção escolhida: Concluir tarefa.");
                    System.out.print("Digite o número da tarefa que deseja concluir: ");
                    int indiceConcluir = scanner.nextInt();
                    scanner.nextLine();
                    if (indiceConcluir >= 0 && indiceConcluir < tarefas.length && tarefas[indiceConcluir] != null) {
                        concluidas[indiceConcluir] = true;
                        System.out.println("Tarefa concluida com sucesso");
                    } else {
                        System.out.println("Número de tarefa inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o numero da tarefa que deseja excluir");
                    int numeroexcluir = scanner.nextInt();
                    int indicexcluir = numeroexcluir - 1;
                    if(indicexcluir >= 0 && indicexcluir < tarefas.length && tarefas [indicexcluir] != null){
                       tarefas[indicexcluir] = null;
                       concluidas[indicexcluir] = false;
                       System.out.println("Tarefa excluida com sucesso!");
                    }else{
                        System.out.println("Tarefa invalida!");
                    }break;
                case 5:
                    System.out.println("Programa encerrado até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao Invalida!")
                    ;break;
            }
        }
    }
}
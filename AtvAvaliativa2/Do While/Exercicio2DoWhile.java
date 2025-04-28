import java.util.Scanner;


public class Exercicio2DoWhile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Ação de ADICIONAR executada!");
        } else if (opcao == 2) {
            System.out.println("Ação de REMOVER executada!");
        } else if (opcao == 3) {
            System.out.println("Saindo do programa...");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }

    } while (opcao != 3);{
        
    }
            
        }
}



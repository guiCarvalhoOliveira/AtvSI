import java.util.Scanner;

public class Exercicio4DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;
        int quantidadeNotas = 0;
        String continuar;

        do {
            System.out.print("Digite uma nota (de 0 a 10): ");
            double nota = scanner.nextDouble();

            
            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            scanner.nextLine(); 
            continuar = scanner.nextLine();

        } while (continuar.compareTo("s") == 0);

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.printf("\nMédia das notas inseridas: ", media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}
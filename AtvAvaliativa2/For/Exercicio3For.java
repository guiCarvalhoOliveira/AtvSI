import java.util.Scanner;

public class Exercicio3For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma de todos os elementos do vetor é: " + soma);

        scanner.close();
    }
}

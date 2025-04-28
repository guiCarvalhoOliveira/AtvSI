import java.util.Random;
import java.util.Scanner;

public class Exercicio3DoWhile {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = random.nextInt(20) + 1; 
        int palpite;
        int tentativas = 0;

        System.out.println( "Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número de 1 a 20.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativa(s)!");
            }

        } while (palpite != numeroSecreto);

        sc.close();
    }
    }


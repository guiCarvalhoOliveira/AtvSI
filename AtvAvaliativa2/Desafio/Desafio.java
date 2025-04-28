import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o valor do investimento inicial (P): ");
            double investimentoInicial = sc.nextDouble();

            System.out.print("Digite a taxa de juros anual (r) em %: ");
            double taxaJuros = sc.nextDouble();

            System.out.print("Digite o período de investimento (t) em anos: ");
            int periodo = sc.nextInt();

            sc.nextLine();

            System.out.print("Digite o tipo de capitalização (simples ou composta): ");
            String tipoCapitalizacao = sc.nextLine();

            double montante = 0;
            if (tipoCapitalizacao.equalsIgnoreCase("simples")) {
                montante = investimentoInicial * (1 + (taxaJuros / 100) * periodo);
            } else if (tipoCapitalizacao.equalsIgnoreCase("composta")) {
                montante = investimentoInicial * Math.pow(1 + (taxaJuros / 100), periodo);
            } else {
                System.out.println("Tipo de capitalização inválido. Escolha 'simples' ou 'composta'.");
            }
            if (tipoCapitalizacao.equalsIgnoreCase("simples") || tipoCapitalizacao.equalsIgnoreCase("composta")) {
                System.out.printf("O montante ao final do período será: R$ %.2f%n", montante);
            }

            System.out.print("\nDeseja realizar outro cálculo? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa encerrado. Obrigado!");
        sc.close();
    }
}


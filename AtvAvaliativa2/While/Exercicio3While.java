import java.util.Scanner;

public class Exercicio3While {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a senha correta(apenas numeros): ");
        int tentativa = sc.nextInt();
        int i = 1234;
        while(tentativa!=i){
System.out.print("Senha incorreta, tente novamente: ");
tentativa=sc.nextInt();
        }
        System.out.print("Acesso concedido");
        sc.close();
    }
}

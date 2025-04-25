import java.util.Scanner;

public class Exercicio2While {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i;
        int soma =0;
System.out.print("Insira um numero positivo para somar: ");
i=sc.nextInt();
        while(i>=0){
soma+=i;
System.out.print("Insira um numero positivo para somar: ");
i=sc.nextInt();
        }
        System.out.print("A soma dos numeros positivos é de: " + soma);
    sc.close();
   
    }
}

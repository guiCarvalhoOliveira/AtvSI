import java.util.Scanner;

public class Exercicio2For {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long fatorial=1;
        System.out.print("Insira um numero positivo: ");
        int numero=sc.nextInt();
        for(int i = 1;i<=numero;i++){
System.out.println(i+ "!" + " = " + fatorial);
fatorial*=i;
        }
    

    }
}

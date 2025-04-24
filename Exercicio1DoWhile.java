
import java.util.Scanner;

public class Exercicio1DoWhile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
           System.out.print ("Digite um numero entre 1 e 100: ");
           numero=sc.nextInt();
        }while(numero<1 || numero>100);{
System.out.print("O numero validado foi: " + numero);

        }
        
        sc.close();
    }
}

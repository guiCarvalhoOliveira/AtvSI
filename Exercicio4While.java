public class Exercicio4While {
    public static void main(String[] args) throws Exception {
        int numero1=0;
        int numero2=1;
        int soma=0;
        while(soma<10){
System.out.print(numero1);
if (soma<9) {
    System.out.print(", "); 
}else{
    System.out.println();
}
int proximoNumero = numero1 + numero2;
numero1=numero2;
numero2=proximoNumero;
soma++;
        }
    }
}

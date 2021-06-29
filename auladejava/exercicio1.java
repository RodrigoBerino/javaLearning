import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
    //leitor
    Scanner scan = new Scanner(System.in);   
    //inicio do programa
    System.out.println("Questao 1, produtos: ");
    System.out.println("Digite o primeiro numero: ");
    int primeiroNumero = scan.nextInt();
    System.out.println("Digite o segundo numero: ");
    int segundoNumero = scan.nextInt();
    System.out.println("Digite o terceiro numero: ");
    int terceiroNumero = scan.nextInt();
    int produto = (primeiroNumero*segundoNumero*terceiroNumero);
    System.out.println("O produto de "+primeiroNumero+" x "+segundoNumero+" x "+terceiroNumero+" eh: "+produto);
    System.out.println("Fim do programa!");
    }
}

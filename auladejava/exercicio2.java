import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    //leitor
    System.out.println("Questao 2, valor de x: ");
    Scanner scan = new Scanner(System.in);
    System.out.println("Seja ax^2+7=0, digite o numero de a: ");
    int numeroA = scan.nextInt();
    int potenciaDeA = (numeroA * numeroA);
    long valorEquacao = Math.round ((-7)/potenciaDeA);
    System.out.println("A equação será: "+potenciaDeA+"x^2+7=0");
    System.out.println("O valor da equacao eh: "+valorEquacao);
    System.out.println("Fim do programa!");
    }
}

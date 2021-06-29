import java.util.Scanner;
public class lerUmValor {
    public static void main(String[] args) {
     //classe de scaner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIgite sua altura: ");
        double primeiroNumero = scan.nextDouble();
        System.out.println("DIgite seu peso: ");
        double segundoNumero = scan.nextDouble();
        double soma = (primeiroNumero * primeiroNumero) / segundoNumero;
        System.out.println(+soma);

    }
        
    }

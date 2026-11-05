import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double input = leitor.nextDouble();
        int valor = (int) Math.round(input * 100);

        int notas100 = valor / 10000;
        valor = valor % 10000;
        int notas50 = valor / 5000;
        valor = valor % 5000;
        int notas20 = valor / 2000;
        valor = valor % 2000;
        int notas10 = valor / 1000;
        valor = valor % 1000;
        int notas5 = valor / 500;
        valor = valor % 500;
        int notas2 = valor / 200;
        valor = valor % 200;

        int moedas1 = valor / 100;
        valor = valor % 100;
        int moedas2 = valor / 50;
        valor = valor % 50;
        int moedas3 = valor / 25;
        valor = valor % 25;
        int moedas4 = valor / 10;
        valor = valor % 10;
        int moedas5 = valor / 5;
        valor %= 5;
        int moedas6 = valor;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas2 + " moeda(s) de R$ 0.50");
        System.out.println(moedas3 + " moeda(s) de R$ 0.25");
        System.out.println(moedas4 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas6 + " moeda(s) de R$ 0.01");
        
    }
 
}

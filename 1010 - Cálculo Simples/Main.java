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
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        
        int codigo1 = leitor.nextInt();
        int peças1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
        
        int codigo2 = leitor.nextInt();
        int peças2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();
        
        double total1 = valor1 * peças1;
        double total2 = valor2 * peças2;
        
        double total3 = total1 + total2;
        
        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f\n", total3);
 
        
    }
 
}

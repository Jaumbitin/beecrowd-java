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
    
        int codigo = leitor.nextInt();
        int quantidade = leitor.nextInt();
        
        double[] precos = {0.00, 4.00, 4.50, 5.00, 2.00, 1.50};
        double total = precos[codigo] * quantidade;
        
        
        System.out.printf(Locale.US, "Total: R$ %.2f\n", total);
    }
 
}

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
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        
        double media = ((a * 3.5) + (b * 7.5)) / 11;
        //double media = div / 2;
        
        System.out.printf(Locale.US, "MEDIA = %.5f\n", media);
 
    }
 
}

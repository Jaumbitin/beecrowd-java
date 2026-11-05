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
        
        double raio = leitor.nextDouble();
        
        double volume = (4.0/3) * 3.14159 * (raio * raio * raio);
        
        System.out.printf(Locale.US, "VOLUME = %.3f\n", volume);
    }
 
}

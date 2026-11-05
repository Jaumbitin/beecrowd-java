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
        double c = leitor.nextDouble();
        
        double triangulo = (a * c) / 2;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        
        System.out.printf(Locale.US, "TRIANGULO: %.3f\n", triangulo);
        System.out.printf(Locale.US, "CIRCULO: %.3f\n", circulo);
        System.out.printf(Locale.US, "TRAPEZIO: %.3f\n", trapezio);
        System.out.printf(Locale.US, "QUADRADO: %.3f\n", quadrado);
        System.out.printf(Locale.US, "RETANGULO: %.3f\n", retangulo);
        
 
    }
 
}

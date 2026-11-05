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
        
        int numero = leitor.nextInt();
        int hora_trabalhada = leitor.nextInt();
        double recebe_hora = leitor.nextDouble();
        
        double salario = hora_trabalhada * recebe_hora;
        
        System.out.println("NUMBER = " + numero);
        System.out.printf(Locale.US, "SALARY = U$ %.2f\n", salario);
 
    }
 
}

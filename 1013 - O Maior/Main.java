import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        
        int maiorab = (a + b + Math.abs(a - b)) / 2;
        int maiorab2 = (maiorab + c + Math.abs(maiorab - c)) / 2;
        
        System.out.println(maiorab2 + " eh o maior");
        
 
        
 
    }
 
}

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
        
        int valor = leitor.nextInt();
        System.out.println(valor);
        
        int notas100 = valor / 100;
        valor = valor % 100;
        int notas50 = valor / 50;
        valor = valor % 50;
        int notas20 = valor / 20;
        valor = valor % 20;
        int notas10 = valor / 10;
        valor = valor % 10;
        int notas5 = valor / 5;
        valor = valor % 5;
        int notas2 = valor / 2;
        valor = valor % 2;
        int notas1 = valor / 1;
        
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
        
    
    }
 
}

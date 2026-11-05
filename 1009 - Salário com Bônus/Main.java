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
        
        String vendedor = leitor.next();
        Double salario = leitor.nextDouble();
        Double vendas = leitor.nextDouble();
        
        Double comissao = vendas * 0.15;
        
        Double total = salario + comissao;
        
        System.out.printf(Locale.US, "TOTAL = R$ %.2f\n", total);
 
        
 
    }
 
}

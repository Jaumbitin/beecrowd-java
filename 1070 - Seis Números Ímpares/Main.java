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

        if (valor % 2 == 0) {
            valor += 1;
        }

        for (int i = 1; i <= 6; i++) {
            if (valor % 2 != 0) {

                System.out.println(valor);
                valor += 2;

            }
        }


        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}

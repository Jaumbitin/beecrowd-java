import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ;

        for (int linha = 0; linha < n; linha++) {
            String texto = reader.readLine();
            StringBuilder primeiraPassada = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char caractere = texto.charAt(i);

                if (caractere >= 'a' && caractere <= 'z') {
                    caractere = (char) (caractere + 3);;
                }
                else if (caractere >= 'A' && caractere <= 'Z') {
                    caractere = (char) (caractere + 3);;
                }
                primeiraPassada.append(caractere);
            }
            primeiraPassada.reverse();
            int metade = primeiraPassada.length() / 2;
            for (int i = metade; i < primeiraPassada.length(); i++) {
                char caractere = primeiraPassada.charAt(i);
                caractere = (char) (caractere - 1);
                primeiraPassada.setCharAt(i, caractere);
            }
            System.out.println(primeiraPassada);
        }


        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}

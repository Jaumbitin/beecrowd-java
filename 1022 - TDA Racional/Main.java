import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int expressions = Integer.parseInt(reader.readLine().trim());
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < expressions; i++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());

            long numerator1 = Long.parseLong(tokens.nextToken());
            tokens.nextToken();
            long denominator1 = Long.parseLong(tokens.nextToken());
            char operator = tokens.nextToken().charAt(0);
            long numerator2 = Long.parseLong(tokens.nextToken());
            tokens.nextToken();
            long denominator2 = Long.parseLong(tokens.nextToken());

            long resultNumerator;
            long resultDenominator;

            switch (operator) {
                case '+':
                    resultNumerator = numerator1 * denominator2
                            + numerator2 * denominator1;
                    resultDenominator = denominator1 * denominator2;
                    break;
                case '-':
                    resultNumerator = numerator1 * denominator2
                            - numerator2 * denominator1;
                    resultDenominator = denominator1 * denominator2;
                    break;
                case '*':
                    resultNumerator = numerator1 * numerator2;
                    resultDenominator = denominator1 * denominator2;
                    break;
                case '/':
                    resultNumerator = numerator1 * denominator2;
                    resultDenominator = denominator1 * numerator2;
                    break;
                default:
                    throw new IllegalArgumentException("Operador invalido: " + operator);
            }

            output.append(resultNumerator)
                    .append('/')
                    .append(resultDenominator)
                    .append(" = ");

            long divisor = gcd(resultNumerator, resultDenominator);
            output.append(resultNumerator / divisor)
                    .append('/')
                    .append(resultDenominator / divisor)
                    .append('\n');
        }

        System.out.print(output);
    }

    private static long gcd(long first, long second) {
        first = Math.abs(first);
        second = Math.abs(second);

        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }
}

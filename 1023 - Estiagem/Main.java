import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // Inicializa leitura e escrita de alta performance
        FastReader in = new FastReader(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n;
        int cidade = 1;
        
        while (true) {
            n = in.nextInt();
            
            // Fim da entrada
            if (n == 0 || n == -1) break; 
            
            // Imprime linha em branco apenas ENTRE os casos de teste
            if (cidade > 1) {
                bw.write("\n");
            }
            
            bw.write("Cidade# " + cidade + ":\n");
            cidade++;
            
            // Como o consumo max é 200, podemos agrupar tudo em um array de 201 posições
            // Isso evita a necessidade de usar algoritmos de ordenação caros
            int[] consumos = new int[201];
            long totalPessoas = 0;
            long totalConsumo = 0;
            
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                
                // O problema pede consumo por pessoa arredondado para baixo (divisão inteira padrão do Java)
                int avgC = y / x; 
                consumos[avgC] += x;
                
                totalPessoas += x;
                totalConsumo += y;
            }
            
            // Monta a linha com o padrão: pessoas-consumo
            boolean first = true;
            for (int i = 0; i <= 200; i++) {
                if (consumos[i] > 0) {
                    if (!first) {
                        bw.write(" ");
                    }
                    bw.write(consumos[i] + "-" + i);
                    first = false;
                }
            }
            bw.write("\n");
            
            // Lógica para cortar na segunda casa decimal sem fazer nenhum arredondamento.
            // O uso de matemática inteira (long) impede falhas de ponto flutuante do 'double'
            long mediaTruncada = (totalConsumo * 100L) / totalPessoas;
            long inteira = mediaTruncada / 100;
            long decimal = mediaTruncada % 100;
            
            bw.write("Consumo medio: " + inteira + ".");
            if (decimal < 10) {
                bw.write("0"); // Formata manualmente o zero à esquerda, se necessário
            }
            bw.write(decimal + " m3.\n");
        }
        
        // Descarrega tudo do buffer para a saída final
        bw.flush();
    }
    
    /**
     * Classe utilitária para leitura super rápida de bytes.
     * Substitui o Scanner para evitar Time Limit Exceeded (TLE).
     */
    static class FastReader {
        InputStream in;
        byte[] buf = new byte[1 << 16];
        int head, tail;
        
        FastReader(InputStream in) {
            this.in = in;
        }
        
        int nextInt() throws IOException {
            int c = read();
            while (c <= 32) {
                if (c == -1) return -1;
                c = read();
            }
            int res = 0;
            while (c > 32) {
                if (c >= '0' && c <= '9') {
                    res = res * 10 + c - '0';
                }
                c = read();
            }
            return res;
        }
        
        int read() throws IOException {
            if (head >= tail) {
                head = 0;
                tail = in.read(buf, 0, buf.length);
                if (tail <= 0) return -1;
            }
            return buf[head++];
        }
    }
}


/**
 * Algoritmos
 */
public class Algoritmos {

    private int iteracaoMatchingSimples;
    private int iteracaoMatchingRabin;

    public int getIteracaoMatchingRabin() {
        return iteracaoMatchingRabin;
    }

    public int getIteracaoMatchingSimples() {
        return iteracaoMatchingSimples;
    }

    // Pattern Matching Simples

    public int procurarPadroesTexto(String texto, String padrao) {

        int x = padrao.length(); // m
        int y = texto.length(); // n

        for (int i = 0; i <= y - x; i++) {
            iteracaoMatchingSimples++;
            int j;
            for (j = 0; j < x; j++) {
                iteracaoMatchingSimples++;
                if (texto.charAt(i + j) != padrao.charAt(j)) {
                    break;
                }
            }
            if (j == x) {
                return i;
            }
        }
        return -1;
    }

    // Pattern Matching Rabin-Karp

    public int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        long patHash = hash(pat, M);

        for (int i = 0; i <= N - M; i++) {
            iteracaoMatchingRabin++;
            long txtHash = hash(txt.substring(i, i + M), M);
            if (patHash == txtHash)
                return i;
        }
        return N;
    }

    public long hash(String s, int M) {
        int R = 26;
        int Q = 2147483647;
        long h = 0;

        for (int j = 0; j < M; j++)
            h = (h * R + s.charAt(j)) % Q;
        return h;
    }

    // Pattern Matching Knuth-Morris-Pratt

    public void KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        // cria lps[] que vai guardar o maior
        // valor prefixo sufixo para o padrão
        int lps[] = new int[M];
        int j = 0; // index for pat[]

        // Calcula lps[]
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern " + "at index " + (i - j));
                j = lps[j - 1];
            }

            // mismatch após j matches
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                // Não faz match dos caracteres lps[0..lps[j-1]],
                // não é necesssário, eles combinarão
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    public void computeLPSArray(String pat, int M, int lps[]) {
        // tamanho do maior prefixo sufixo anterior
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // loop calcula lps[i] for i = 1 to M-1
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else // (pat[i] != pat[len])
            {
                if (len != 0) {
                    len = lps[len - 1];
                } else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
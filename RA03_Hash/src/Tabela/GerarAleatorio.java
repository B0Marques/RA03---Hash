package Tabela;

import java.util.Random;

public class GerarAleatorio {
    private static long seed = 12345;
    private static Random random = new Random(seed);

    public static int gerar() {
        int numAleatorio = random.nextInt();
        return numAleatorio;
    }
}

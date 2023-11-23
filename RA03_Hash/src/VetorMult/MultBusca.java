package VetorMult;

import Tabela.GerarAleatorio;
import Tabela.TabelaHash;
import VetorDiv.TabelaDiv;

public class MultBusca {
    public static void main(String[] args) {
        TabelaHash[][] tabelas = TabelaDiv.maindiv(args);
        int[] qtdDados = {50000, 100000, 250000, 500000, 1000000};

        int[] valoresBusca = new int[5];
        for (int i = 0; i < 5; i++) {
            valoresBusca[i] = GerarAleatorio.gerar();
        }

        for (int j = 0; j < 5; j++) {
            long totalComparacoes = 0;
            long totalTempoExecucao = 0;

            for (int i = 0; i < 5; i++) {
                for (int valor : valoresBusca) {
                    long start = System.nanoTime();
                    long comparacoes = tabelas[j][i].busca(valor, 2);
                    long end = System.nanoTime();

                    totalComparacoes += comparacoes;
                    totalTempoExecucao += (end - start);
                }

                long mediaComparacoes = totalComparacoes / 5;
                long mediaTempoExecucao = totalTempoExecucao / 5;

                System.out.println("Média de comparações na busca (Multiplicação) na tabela de tamanho " + tabelas[j][i].getTamanho() +
                        " e quantidade de dados " + qtdDados[i] + ": " + mediaComparacoes);
                System.out.println("Média de tempo de execução: " + mediaTempoExecucao);
            }
        }
    }
}

package VetorDiv;
import Tabela.*;


public class TabelaDiv {
    public static TabelaHash[][] maindiv(String[] args) {
        int[] tamTabela = {250, 500, 1000, 5000, 10000};
        int[] qtdDados = {50000, 100000, 250000, 500000, 1000000};

        TabelaHash[][] tabelas = new TabelaHash[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                long start = System.currentTimeMillis();
                TabelaHash tabela = new TabelaHash(tamTabela[i]);

                for (int k = 0; k < qtdDados[j]; k++) {
                    int numAleatorio = GerarAleatorio.gerar();
                    tabela.inserir(numAleatorio, 1);
                }

                tabelas[i][j] = tabela;

                long end = System.currentTimeMillis();

                long colisoes = tabelas[i][j].contaColisao();
                System.out.println("Tamanho (Divisão): " + tamTabela[i] + " Quantidade de dados: " + qtdDados[j]);
                System.out.println("Colisões: " + colisoes);
                System.out.println("Tempo de execução: " + (end - start));
            }
        }
        return tabelas;
    }
}

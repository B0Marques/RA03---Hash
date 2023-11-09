package VetorDiv;
import Tabela.*;


public class TabelaDiv {
    public static TabelaHash[] maindiv(String[] args) {
        int[] tamTabela = {200, 400, 600, 800, 1000};
        int[] qtdDados = {10000, 20000, 30000, 40000, 50000};

        TabelaHash[] tabelas = new TabelaHash[5];

        for (int tam : tamTabela) {
            for (int dado : qtdDados) {
                long start = System.currentTimeMillis();
                TabelaHash tabela = new TabelaHash(tam);

                for (int i = 0; i < dado; i++) {
                    int numAleatorio = GerarAleatorio.gerar();
                   tabela.inserir(numAleatorio, 1);
                }
                for (int j = 0; j < (tamTabela.length); j++) {
                    if (tamTabela[j] == tam ) {
                        tabelas[j] = tabela;
                        break;
                    }
                }
                long end = System.currentTimeMillis();

                long colisoes = tabela.contaColisao();
                System.out.println("Tamanho (Divisão): " + tam + " Quantidade de dados: " + dado);
                System.out.println("Colisões: " + colisoes);
                System.out.println("Tempo de execução: "+ (end - start));
            }

        }
        return tabelas;
    }
}

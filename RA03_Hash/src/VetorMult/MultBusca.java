package VetorMult;

import Tabela.GerarAleatorio;
import Tabela.TabelaHash;

public class MultBusca {
    public static void main(String[] args) {
        TabelaHash[] tabelas = TabelaMult.mainmult(args);
        for (int i = 0; i < tabelas.length; i++) {
            long start = System.currentTimeMillis();
            long comparacoes = tabelas[i].busca(GerarAleatorio.gerar(), 2);
            long end = System.currentTimeMillis();

            System.out.println("Número de comparações na busca (Multiplicação) na tabela de tamanho " + tabelas[i].getTamanho() + ": "+comparacoes);
            System.out.println("Tempo de execução: "+(end - start));
        }
    }
}

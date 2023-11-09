package VetorDob;

import Tabela.GerarAleatorio;
import Tabela.TabelaHash;


public class DobBusca {
    public static void main(String[] args) {
        TabelaHash[] tabelas = TabelaDob.maindob(args);
        for (int i = 0; i < tabelas.length; i++) {
            long start = System.currentTimeMillis();
            long comparacoes = tabelas[i].busca(GerarAleatorio.gerar(), 3);
            long end = System.currentTimeMillis();

            System.out.println("Número de comparações na busca (Dobramento) na tabela de tamanho " + tabelas[i].getTamanho() + ": "+comparacoes);
            System.out.println("Tempo de execução: "+(end - start));
        }
    }
}

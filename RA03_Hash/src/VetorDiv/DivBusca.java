package VetorDiv;
import Tabela.*;

public class DivBusca {
    public static void main(String[] args) {
        TabelaHash[] tabelas = TabelaDiv.maindiv(args);
        for (int i = 0; i < tabelas.length; i++) {
            long start = System.currentTimeMillis();
            long comparacoes = tabelas[i].busca(GerarAleatorio.gerar(), 1);
            long end = System.currentTimeMillis();
            System.out.println("Número de comparações na busca (Divisão) na tabela de tamanho " + tabelas[i].getTamanho() + ": "+comparacoes);
            System.out.println("Tempo de execução: "+(end - start));
        }

    }
}

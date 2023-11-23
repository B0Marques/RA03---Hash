package Tabela;
public class TabelaHash {
    private int tamanho;
    private Lista[] tabela;

    public TabelaHash(int tam) {
        tamanho = tam;
        tabela = new Lista[tam];
    }

    public void inserir(int dado, int funcao) {
        switch (funcao) {
            case 1:
                int index1 = hashDivisao(dado);
                 if (tabela[index1] == null) {
                     tabela[index1] = new Lista();
                     tabela[index1].inserir(dado);
                 } else {
                     tabela[index1].inserir(dado);
                 }
                 break;
            case 2:
                int index2 = hashMultiplicacao(dado);
                if (tabela[index2] == null) {
                    tabela[index2] = new Lista();
                    tabela[index2].inserir(dado);
                } else {
                    tabela[index2].inserir(dado);
                }
                break;

            case 3:
                int index3 = hashDobramento(dado);
                if (tabela[index3] == null) {
                    tabela[index3] = new Lista();
                    tabela[index3].inserir(dado);
                } else {
                    tabela[index3].inserir(dado);
                }
                break;
        }


    }

    public int busca(int key, int funcao) {
        int comparacao = 0;
        switch (funcao) {
            case 1:
                int index1 = hashDivisao(key);
                Node atual1 = tabela[index1].getInicio();
                while (atual1 != null) {
                    comparacao++;
                    if (atual1.getDado() == key) {
                        return comparacao;
                    }
                    atual1 = atual1.getProx();
                }
                break;

            case 2:
                int index2 = hashMultiplicacao(key);
                Node atual2 = tabela[index2].getInicio();
                while (atual2 != null) {
                    comparacao++;
                    if (atual2.getDado() == key) {
                        return comparacao;
                    }
                    atual2 = atual2.getProx();
                }
                break;

            case 3:
                int index3 = hashDobramento(key);
                Node atual3 = tabela[index3].getInicio();
                while (atual3 != null) {
                    comparacao++;
                    if (atual3.getDado() == key) {
                        return comparacao;
                    }
                    atual3 = atual3.getProx();
                }
                break;
        }

        return comparacao;
    }

    public int contaColisao() {
        int colisao = 0;
        for (int i = 0; i < tamanho; i++) {
            if (tabela[i] != null) {
                Node atual = tabela[i].getInicio();
                while (atual != null && atual.getProx() != null) {
                    colisao++;
                    atual = atual.getProx();
                }
            }
        }
        return colisao;
    }

    private int hashDivisao(int dado) {
        int index = dado % tamanho;
        if (index < 0) {
            index += tamanho;
        }
        return index;
    }

    private int hashMultiplicacao(int dado){
        double A = 0.61803398875;
        double produto = A * dado;
        double parte = produto - Math.floor(produto);;
        int index = (int) (tamanho * parte);
        return index;
    }

    private int hashDobramento(int dado) {
        int index = 0;
        while (dado > 0) {
            index += dado %1000;
            dado /= 1000;
        }
        return index % tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}

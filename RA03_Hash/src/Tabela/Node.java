package Tabela;
public class Node {
    private int dado;
    private Node prox;

    public Node(int dado) {
        this.dado = dado;
        this.prox = null;
    }

    public int getDado() {
        return dado;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}

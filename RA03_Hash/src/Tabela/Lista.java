package Tabela;
public class Lista {
    private Node inicio;


    public Lista () {}

    public void inserir(int dado) {
        Node node = new Node(dado);
        if (inicio == null) {
            inicio = node;
        }
        else if (dado < inicio.getDado()){
            node.setProx(inicio);
            setInicio(node);
        }
        else {
            Node atual = inicio;
            while (atual.getProx() !=null && atual.getProx().getDado() < dado) {
                atual = atual.getProx();
            }
            node.setProx(atual.getProx());
            atual.setProx(node);
        }
    }

    public Node getInicio() {
        return inicio;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }
}

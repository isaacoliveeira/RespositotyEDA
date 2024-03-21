public class Nodo {
    private int valor;
    private Nodo proximoElemento;

    public Nodo(int valor, Nodo proximoElemento) {
        this.valor = valor;
        this.proximoElemento = proximoElemento;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(Nodo proximoElemento) {
        this.proximoElemento = proximoElemento;
    }

    @Override
    public String toString() {
        return "Node{" +
                "valor=" + valor +
                ", proximoElemento: " + proximoElemento +
                "}";
    }
}

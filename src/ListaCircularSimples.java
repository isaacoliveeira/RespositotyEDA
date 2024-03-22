package src;

import src.Nodo;

public class ListaCircularSimples {

    private Nodo head;
    private int size;

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = 0;
    }

    public void add(int valor) {
        Nodo elemento = new Nodo(valor, null);
        if (size == 0) {
            this.head = elemento;
        } else {
            this.head.setProximoElemento(elemento);
        }
        size++;
    }

    public void addIndex(int valor, int index) {
        Nodo elemento = new Nodo(valor, null);
        if ( index == 0) {
            elemento.setProximoElemento(head);
            this.head = elemento;
        } else {
            Nodo elementoAnterior = new Nodo(valor, null);
            for (int i = 0; i < index; i++) {
                elementoAnterior = elementoAnterior.getProximoElemento();
            }
            elemento.setProximoElemento(elementoAnterior.getProximoElemento());
            elementoAnterior.setProximoElemento(elemento);
        }
        size++;
    }

    public void remove(int valor) {

    }

    public Nodo get(int index) {
        Nodo atual = this.head;
        for ( int i = 0; i < index; i++) {
            atual = atual.getProximoElemento();
        }
        return atual;
    }
}


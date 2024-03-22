package src;

import src.ListaCircularDupla;

public class MainListaCircular {
    public static void main(String[] args) {

        ListaCircularDupla listaCircularDupla = new ListaCircularDupla();
        listaCircularDupla.add(8);
        listaCircularDupla.add(3);
        listaCircularDupla.add(5);
        listaCircularDupla.add(7);
        listaCircularDupla.addIndex(14,2);
        listaCircularDupla.remover(3);


        System.out.println("Tamanho: " + listaCircularDupla.getsize());
        System.out.println("O primerio elemento é: " + listaCircularDupla.gethead().getValor());
        System.out.println("O último elemento é: " + listaCircularDupla.gettail().getValor());
        System.out.println("O próximo elemento do último é: " + listaCircularDupla.gettail().getProximoElemento().getValor());
        System.out.println("O elemento anterior do primeiro é: " + listaCircularDupla.gethead().getAnteriorElemento().getValor());
        System.out.println("O próximo elemento do primeiro é: " + listaCircularDupla.gethead().getProximoElemento().getValor());
        System.out.println(listaCircularDupla.get(0).getValor());
        System.out.println(listaCircularDupla.get(1).getValor());
        System.out.println(listaCircularDupla.get(2).getValor());
        System.out.println(listaCircularDupla.get(3).getValor());
        System.out.println(listaCircularDupla.get(4).getValor());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.LC;

/**
 *
 * @author juan
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
        ListaCircular lista1 = new ListaCircular();
    
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);
        Item item4 = new Item(4);
        Item item5 = new Item(5);
        Item item6 = new Item(6);
        Item item7 = new Item(7);
        Item item8 = new Item(8);
        Item item9 = new Item(9);
        Item item10 = new Item(10);
        
        System.out.println(":::::::::: Lista 1 ::::::::::");
        if(lista1.esVacia())
            System.out.println("lista vacia");
        else
            System.out.println("lista no esta vacia");
        System.out.println("Cantidad de items en nuestra lista: " + lista1.cantidad());
        System.out.println("Agregarmos objetos a nuestra lista: ");
        lista1.insertar(item1);
        lista1.insertar(item2);
        lista1.verLista();
        System.out.println("El valor ubicado en la ventana es: " +lista1.valor().getDato());
        lista1.insertar(item3);
        lista1.insertar(item4);
System.out.println("Cantidad de items en nuestra lista: " + lista1.cantidad());        
        lista1.verLista();
        System.out.println("Borramos.");
        lista1.borrar();
        System.out.println("Cantidad de items en nuestra lista: " + lista1.cantidad());
        lista1.verLista();
        lista1.borrar();
        System.out.println("Cantidad de items en nuestra lista: " + lista1.cantidad());
        lista1.verLista();
          if(lista1.esVacia())
            System.out.println("lista vacia");
        else
            System.out.println("lista no esta vacia");
          System.out.println("El valor ubicado en la ventana es: " +lista1.valor().getDato());
          lista1.insertar(item9);
          lista1.insertar(item8);
          lista1.insertar(item7);
          System.out.println("Cantidad de items en nuestra lista: " + lista1.cantidad());
          lista1.verLista();
          System.out.println("Rotamos la lista.");
          lista1.rotar();
          lista1.verLista();
    }
}

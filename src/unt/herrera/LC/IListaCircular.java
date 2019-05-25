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
public interface IListaCircular 
{
    public boolean esVacia();
    
    public void insertar(Item unItem);
    
    public void borrar();
    
    public Item valor();
    
    public void rotar();
    
    public void verLista();
    
    public int cantidad();
    
}

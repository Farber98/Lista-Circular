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
public class ListaCircular implements IListaCircular
{
    
    private Item lc;
    private int cantidad =0;

    public ListaCircular() 
    {
        this.lc = null;
    }
    
    

    @Override
    public boolean esVacia() 
    {
        if(lc == null)
            return true;
        else
            return false;
    }

    @Override
    public void insertar(Item unItem) 
    {
        if(esVacia())      
        {
            this.lc=unItem;
            unItem.setSiguiente(unItem);
        }
        else           
        {
            unItem.setSiguiente(lc.getSiguiente());
            lc.setSiguiente(unItem);   //No entiendo.
        }
        cantidad++;
    }

    @Override
    public void borrar() 
    {
        if(!esVacia())
        {
            Item aux = this.lc;
            aux.setSiguiente(this.lc.getSiguiente().getSiguiente());        //Bien?
            this.lc = aux;
            cantidad--;
        }
            
    }

    @Override
    public Item valor() 
    {
        return this.lc.getSiguiente();
    }

    @Override
    public void rotar() 
    {
        this.lc = this.lc.getSiguiente();
    }

    @Override
    public int cantidad() {
        return cantidad;
    }

    
    
    @Override
    public void verLista() 
    {
        Item aux = this.lc;
        int c = 0;
        do
        {
            
            if(c==1)        //Identifico la ventana.
            {
                System.out.print("{"+aux.getDato()+"} -- >");
            }
            else
            {
                System.out.print("["+aux.getDato()+"] -- >");
            }
            aux = aux.getSiguiente();
            c++;
        }while(aux != this.lc);
        System.out.println("");
    }
    
}

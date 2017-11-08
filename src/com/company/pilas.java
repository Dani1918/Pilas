package com.company;

/**
 * Created by edd on 08/11/2017.
 */
public class pilas{
    private Nodo  top ;
    public  pilas(){
        top = null;
    }
    public  boolean vacia (){
        return (top == null);
    }
    public  void push(int valor){
        Nodo nuevoNodo;
        if (vacia() )
            top = new Nodo(valor);
        else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    public void peek(){
        Nodo temp = top;
        if ( temp!=null){
            System.out.println("La pila es: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("Pila Vacia.");
    }
    public void cima(){
        if (!vacia())
            System.out.println("Cima: "+top.getValor());
        else
            System.out.println("La pila esta vacia");
    }
    public void pop(){
         if (!vacia()){
            System.out.println("Dato Extraido: " +top.getValor());
            top=top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }

}

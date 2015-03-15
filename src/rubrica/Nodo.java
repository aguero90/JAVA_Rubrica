/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

/**
 *
 * @author Alessandro
 */
public class Nodo {
    
    private String nome;
    private String numero;
    private Nodo next;
    
    public Nodo(){
        
        this.nome = "";
        this.numero = "";
        this.next = null;
    }
    
    public Nodo(String nome, String numero){
        
        this.nome = nome;
        this.numero = numero;
        this.next = null;
    }
    
    public Nodo(String nome, String numero, Nodo next){
        
        this.nome = nome;
        this.numero = numero;
        this.next = next;
    }
    
    public Nodo(Nodo next){
        
        this.nome = "";
        this.numero = "";
        this.next = next;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public Nodo getNext(){
        return this.next;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    
    public String toString(){
        String s;
        s = this.nome + " " + this.numero;
        return s;
    }
    
}


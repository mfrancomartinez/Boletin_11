/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_11;

/**
 *
 * @author Marcos
 */
public class Adestrador extends Seleccion {
    private int idFederacion;
    
    public Adestrador(int id, String nome, String apelido,String idade , int idFederacion) {
        super(id, nome, apelido, idade);
        this.idFederacion=idFederacion;
    }
    
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    }
    
    @Override public void viaxar(){
        
        System.out.println("Viaxa o adestrador.");
    }
}
    


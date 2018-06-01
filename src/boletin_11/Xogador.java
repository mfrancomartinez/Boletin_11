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
public class Xogador extends Seleccion{
    
    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, String idade) {
        super(id, nome, apelido, idade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    } 

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
      
    
    public void xogarPartido(){
        
    }
    public void entrenar(){
        
    }
    @Override public void viaxar(){
        
        System.out.println("Viaxa o xogador.");
    }
}

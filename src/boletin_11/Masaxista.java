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
public class Masaxista extends Seleccion{
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(int id, String nome, String apelido, String idade, String titulacion, int anosExperiencia) {
        super(id, nome, apelido, idade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    public void darMasaxes(){
        
    }
    
    @Override public void viaxar(){
        
        System.out.println("Viaxa o masaxista.");
    }
}

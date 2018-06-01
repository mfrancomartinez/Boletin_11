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
public class Boletin_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Xogador xog = new Xogador(7, "Delantero", 7, "Marcos","Franco","21");
     Masaxista max = new Masaxista(7, "Marcos", "Franco", "21", "Sen titulacion",5);
     Adestrador ad = new Adestrador(7, "Marcos", "Franco", "21", 7);     
     Seleccion sec = new Seleccion(7, "Marcos", "Franco", "21");
     xog.concentrarse();
     ad.concentrarse();
     max.concentrarse();
     xog.viaxar();
     ad.viaxar();
     max.viaxar();      
     sec.viaxar(); //Sólo se puede llamar desde la superclase.
        
    }
    
}

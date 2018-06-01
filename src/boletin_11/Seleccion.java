/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_11;

import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Seleccion {
    protected int id;
    protected String nome;
    protected String apelido;
    protected String idade;

    public Seleccion(int id, String nome, String apelido, String idade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getIdade() {
        return idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
public void concentrarse(){
    System.out.println("Concentrase a seleccion");
}   
public void viaxar(){
    System.out.println("Viaxa a selección");
}
    
}

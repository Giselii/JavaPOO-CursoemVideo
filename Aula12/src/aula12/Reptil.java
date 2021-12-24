/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author julim
 */
public class Reptil extends Animal{
    private String corEscama;
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo insetos");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}

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
public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolhas(){
        System.out.println("Soltando bolhas...O.o..OOo.OO");
    }
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comento substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Emitindo sons de peixe");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}

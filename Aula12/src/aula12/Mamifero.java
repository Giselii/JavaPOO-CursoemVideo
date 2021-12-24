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
public class Mamifero extends Animal {
    private String corPelo; //Herança para diferença
    
    @Override
    public void locomover(){
        System.out.println("Correndo");//Quando eu tenho método abstrato eu sou obrigada a desenvolvê-lo na subclasse
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}

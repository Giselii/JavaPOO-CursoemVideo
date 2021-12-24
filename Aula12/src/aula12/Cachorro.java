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
public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Enterrando o osso");  
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo ração de cachorro");  
    } 
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
}

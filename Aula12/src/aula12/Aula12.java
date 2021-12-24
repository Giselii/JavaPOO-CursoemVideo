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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String tracejado ="========================================";
        
        Mamifero m =new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();
        Cobra cobra = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara arara = new Arara();      
        
        
        k.setCorPelo("caramelo");
        k.setIdade(3);
        k.setMembros(4);
        k.setPeso(12);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println(k.toString());
        
        System.out.println(tracejado);
        c.setCorPelo("Marrom");
        c.setIdade(4);
        c.setMembros(4);
        c.setPeso(23);
        c.alimentar();
        c.locomover();
        c.emitirSom();
        c.usarBolsa();
        System.out.println(c.toString());
        
        System.out.println(tracejado);
        a.alimentar();
        a.locomover();
        a.emitirSom();
        
      
        
        
       
        
    }
    
}

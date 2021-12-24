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
public class Canguru extends Mamifero {
    public void usarBolsa(){
        System.out.println("Usando a bolsa");  
    }
    @Override
    public void locomover(){//Esse método é sobreposto de um método que já havia sido sobreposto. É um terceiro nível de HERANÇA
        System.out.println("Saltando longe e alto!");
    }
}

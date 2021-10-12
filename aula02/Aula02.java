/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author julim
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Caneta c1 =new Caneta();//Instancie uma caneta. Criei uma caneta
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.tampar();
       
       c1.status();
       c1.rabiscar();
       
        System.out.println("");
       Caneta c2 = new Caneta();
       c2.modelo = "Hostnet";
       c2.cor = "Preta";
       c2.destampar();
       c2.status();
       c2.rabiscar();
    
       
  
    }
    
}

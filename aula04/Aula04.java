/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author julim
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f); //Criei um objeto caneta com um construtor, já passando os parâmetros
        
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f); //Criando outra caneta. Só preciso usar uma linha
        
        /*c1.setModelo("BIC");//Aqui eu usei o método acessor
        c1.modelo = "BIC";//Aqui eu acessei diretamente o atributo. Só consigo pq é público
        
        c1.setPonta(0.5f);
        c1.status();
        
        System.out.println("Tenho uma caneta " +c1.getModelo() + " de ponta " + c1.getPonta());//Também posso fazer isso*/
        c1.status();
        c2.status();
  
    }
    
}

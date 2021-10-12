/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula02mesa;

/**
 *
 * @author julim
 */
public class Mesa {
    String formato;
    String cor;
    float altura;
    boolean desocupada;
    int lugares;
    
    
    void status(){
        System.out.println("O formato da mesa é " + this.formato);
        System.out.println("A cor é: " + this.cor);
        System.out.println("A altura é: " + this.altura);
        System.out.println("Está desocupada? " +this.desocupada);
        System.out.println("Número de lugares: " + this.lugares);
    
    }
    
    void sentar(){
    if (this.desocupada == true){
        System.out.println("Pode se sentar! Está vazia");
    }else{
            System.out.println("A mesa está ocupada. Por favor, encontre outo lugar");}
    }
    
  void desocupar(){
    this.desocupada = true;
}
  void ocupar(){
  this.desocupada = false;
  }
  
   
}

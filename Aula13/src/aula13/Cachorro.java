/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author julim
 */
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){//Mesma assinatura da mãe     //
                                                          //
        System.out.println("Au! au! au!");                //
    }                                                     //
    public void reagir(String frase){
        if(frase == "Toma comida" || frase == "Olá"){
            System.out.println("Abanar e latir");
        }else{
                    System.out.println("Rosnar");
                    }
        
    }
    public void reagir(int hora, int minuto){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
                                                          //Todos esses métodos estão na mesma classe, por isso é sobrecarga
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
    public void reagir(int idade, float peso){              //
        if(idade < 5){
           
        if(peso < 10){
            System.out.println("Abanar");
        }else{
            System.out.println("Latir");
        }
        }else{
            if(peso <10){
                System.out.println("Rosnar "); 
            }else{
                System.out.println("Ignorar");
            }
        }
    }
   
}

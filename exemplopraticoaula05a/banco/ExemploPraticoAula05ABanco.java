/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopraticoaula05a.banco;

/**
 *
 * @author julim
 */
public class ExemploPraticoAula05ABanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Conta conta1 = new Conta("45679033", "Poupança", 50.00f);
        conta1.depositar();
        conta1.sacar();
        conta1.status();
       
    }
    
}

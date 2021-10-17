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
       
        Conta conta1 = new Conta();
        conta1.setNumConta("1111");
        conta1.setDono("Jubileu");
        conta1.abrir("CC");
        
        Conta conta2 = new Conta();
        conta2.setNumConta("2222");
        conta2.setDono("Creuza");
        conta2.abrir("CP");
        
        conta1.depositar(100);
        conta2.depositar(500);
        
        conta2.sacar(100);
        conta1.sacar(150);
        conta1.fechar();
        conta2.sacar(50);//testando modificar direto no arquivo do GITHUB
      
        
        conta1.estadoAtual();
        conta2.estadoAtual();
        
        
        
        
        
        
        
        //conta1.status();
        
        
        //conta1.depositar();
        //conta1.sacar();
        //conta1.status();
       
    }
    
}

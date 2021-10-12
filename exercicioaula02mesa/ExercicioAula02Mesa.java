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
public class ExercicioAula02Mesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa();
        mesa1.formato = "Quadrada";
        mesa1.altura = 0.80f;
        mesa1.cor = "branca";
        mesa1.desocupada = true;
        mesa1.lugares = 4;
        
        mesa1.ocupar(); // Ocupo a mesa
        mesa1.status();
        System.out.println("");
        mesa1.sentar();
    }
    
}

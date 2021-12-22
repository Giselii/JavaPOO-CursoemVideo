/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author julim
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());// Se refere à herança pobre. herança de implementação
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade(); //Esse método pagarMensalidade é diferente do da classe Aluno (a1), pois ele está sobrescrito
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Maria");
        t1.setCurso("Engenharia de Software");
        t1.setIdade(23);
        t1.setMatricula(1113);
        t1.setRegistroProfissional(5555);
        t1.setSexo("F");
        t1.praticar();
        t1.pagarMensalidade();
        t1.fazerAniversario();
        
        Professor p1 = new Professor();
        p1.setNome("Daniel");
        p1.setEspecialidade("Direito constitucional");
        p1.setIdade(48);
        p1.setSalario(5000.68f);
        p1.setSexo("M");
        p1.receberAumento();
        p1.fazerAniversario();
    }
   
    
}

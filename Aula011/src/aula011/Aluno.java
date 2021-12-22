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
public class Aluno extends Pessoa { //Herança para diferença. Aluno é uma especialização de Pessoa
    private int matricula;
    private String curso;
    public void pagarMensalidade(){ //Pagamento do aluno não está sendo sobreposto
        System.out.println("Pagando mensalidade do aluno " +this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

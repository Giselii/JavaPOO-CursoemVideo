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
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }
    
    public void fazerAniversario(){
        System.out.println(this.getNome() + " tinha " + this.getIdade() + " anos de idade e agora está com " + (this.getIdade()+1) + " Parabéns, " + this.getNome());
       
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
    
}

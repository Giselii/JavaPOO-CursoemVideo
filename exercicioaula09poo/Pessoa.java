/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula09poo;

/**
 *
 * @author julim
 */
public class Pessoa {
    private String Nome;
    private int Idade;
    private String sexo;

    public Pessoa(String Nome, int Idade, String sexo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void fazerAniversario(){
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author julim
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    
    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal"+ this.getClass()+" {" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + '}';
    }
}

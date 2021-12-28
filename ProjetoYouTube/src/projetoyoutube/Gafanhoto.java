/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author julim
 */
public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;//O login verde é o atributo definido nesta mesma classe e o login preto é o parâmetro desse construtor
        this.totAssistido = 0;
    }

    @Override
    public void ganharExp() {
       
    }

    
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}

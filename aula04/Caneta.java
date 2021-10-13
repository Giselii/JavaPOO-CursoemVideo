/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author julim
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

   /* public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }*/ //Aqui fiz usando o CTRL + I e criei os Getter e Setters
    

    
    public Caneta(String m, String c, float p){//Esse é o Método Construtor, tem o mesmo nome da classe
        this.modelo = m; // Aqui também posso fazer com o método Set
        this.cor = c;
        this.ponta = p;
        this.tampar();
 
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p ;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Modelo: " + this.getModelo());// também funciona igual
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Ponta: " + this.getPonta());// Mesma coisa do de cima, também funciona dessa maneira
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }}


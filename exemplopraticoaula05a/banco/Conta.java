/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopraticoaula05a.banco;
import java.util.Scanner;
/**
 *
 * @author julim
 */


public class Conta {
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public String getnumConta(){
        return this.numConta;
    }
    public void setNumConta(String numC){
        this.numConta = numC;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tip){
        this.tipo = tip;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float sal){
        this.saldo = sal;
    }
    public boolean getStatus(boolean stat){
        return this.status = stat;
    }
    
    public void abrir(){
        this.status = true;
    }
    
    public void fechar(){
        this.status = false;
    }
    Scanner ler = new Scanner(System.in);

    public void depositar(){
        System.out.println("Valor do depósito: ");
        float valorDeposito = ler.nextFloat();
        saldo = saldo + valorDeposito;
        
    } 
    
    public void sacar(){
        System.out.println("Valor do saque: ");
        float valorSaque = ler.nextFloat();
        saldo = saldo - valorSaque;
    }
    
    public Conta(String numC, String tip, float sal){
        this.numConta = numC;
        this.tipo = tip;
        this.saldo = sal;
        this.abrir();
    }
    
    public void status(){
        System.out.println("DADOS DA CONTA:");
        System.out.println("Número da Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getnumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus(status));
    }
    
}

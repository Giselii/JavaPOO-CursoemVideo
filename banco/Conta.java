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
    String linha = "-----------------------------";
    
    public void estadoAtual(){
        System.out.println(linha);
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println(linha);
    }
    
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
    public String getDono(){
        return this.dono;
    }
    public void setDono(String don){
        this.dono = don;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float sal){
        this.saldo = sal;
    }
    public boolean setStatus(boolean stat){
        return this.status = stat;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void abrir(String tip){
        this.setTipo(tip);
        this.setStatus(true);
        if (tip == "CC") {
            this.setSaldo(50);
            
        } else if(tip == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fechar(){
        if (this.getSaldo() > 0){
            System.out.println("Não é possível encerrar a conta. Ainda há saldo disponível");
        }else if(this.getSaldo() < 0 ){
            System.out.println("Não é possível encerrar a conta. Débito pendente");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } 
        this.status = false;
    }
    //Scanner ler = new Scanner(System.in);
    public void depositar(float valorDeposito){
        if(this.getStatus()){
        //System.out.println("Valor do depósito: ");
        //float valorDeposito = ler.nextFloat();
        this.setSaldo(this.getSaldo()+ valorDeposito);
        System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar. Conta fechada!");
        }
    } 
    public void sacar(float valorSaque){
        //System.out.println("Valor do saque: ");
        //float valorSaque = ler.nextFloat();
        if(this.getStatus()){
            if (this.getSaldo() >= valorSaque){
            this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Sque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
        System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
      int v = 0;
      if (this.getTipo() == "CC"){
        v = 12;
      }else if (this.getTipo() == "CP"){
            v = 20;
      }
      if (this.getStatus()){
          this.setSaldo(this.getSaldo() - v);
          System.out.println("Mensalidade paga com sucesso por " + this.getDono());
      }else{
          System.out.println("Impossível pagar. Conta fechada");
      }    
    }
    public Conta(){ //Metodo Construtor
        this.saldo = 0;
        this.status = false;
        //this.abrir();
    }
    public void status(){
        System.out.println("DADOS DA CONTA:");
        System.out.println("Número da Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getnumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}

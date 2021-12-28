/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

public class Visualizacao {
    private Gafanhoto espectador;//Agregação = Eu consigo ligar a instância de um objeto como um atributo. 
                                  //Eu tenho o atributo espectador e o atributo filme, e eles são instãncias de outras classes
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); //Espectador assistiu mais um vídeo
        this.filme.setViews(this.filme.getViews() + 1); //Mais uma visialização do vídeo
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
       int tot = 0;
       if(porc <= 20){
           tot = 3;
       }else if(porc <= 50){
           tot= 5;
       }else if(porc <= 90){
           tot = 8;
       }else{
           tot = 10;
       }
       this.filme.setAvaliacao(tot);
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}

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
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO"); //Chamo construtor da classe e passo o título
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML 5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 24, "F", "creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);//Jubilei assiste HTML5  ~~~~~~  Agregação = Eu consigo ligar a instância de um objeto como um atributo
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);//Jubileu assiste PHO
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
      
        
       
    }
    
}

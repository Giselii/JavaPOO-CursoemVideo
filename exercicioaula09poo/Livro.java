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
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        if(this.getPagAtual() > 0){
        this.setAberto(true);}
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    public String detalhes() { //Inbseri o 'toString() e renomeei para 'detalhes'
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor + 
                ",\n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual + 
                ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + 
                ",\n idade = " + leitor.getIdade() + ",\n Sexo = " + leitor.getSexo()+'}';
    }
    
 
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
        
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas()){
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
        this.setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);}
        //OU this.pagAtual++
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 1){
            this.setPagAtual(this.getPagAtual() - 1);}
        //OU this.pagAtual--
    }
}

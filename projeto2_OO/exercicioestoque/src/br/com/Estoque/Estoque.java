package br.com.Estoque;

import javax.lang.model.util.ElementScanner6;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque (String nome, int qtdAtual, int qtdMinima){
        super();
        nome = nome;
        this.qtdAtual  = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    public void darBaixa(int qtde){
            if(this.qtdAtual >= qtde){  
                this.qtdAtual = this.qtdAtual - qtde;
             }Else{
                System.out.println("Impossível dar baixa no estoque");
             }
            

    }
    public String mostra(){
        return "Nome do produto: " + this.nome + " quantidade minima em estoque= " + this.qtdMinima + "quantidade atual em estoque =  " + this.qtdAtual ;
    }
        
    
    


    }
    boolean precisaRepor(){
        if(this.qtdAtual <= this.qtdMinima){
           return true;
        } else{ 
            return false;
        }
     

    }
}

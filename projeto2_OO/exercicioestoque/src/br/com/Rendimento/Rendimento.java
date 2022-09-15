package br.com.Rendimento;



public class Rendimento {

    private double investInicial;
    private int tempo;
    private double taxa;
    private double rendimento;

    public Rendimento(double investInicial, int tempo, double taxa) {
        this.investInicial = investInicial;
        this.tempo = tempo;
        this.taxa = taxa;
        
    }

    public double getInvestInicial() {
        return investInicial;
    }

    public void setInvestInicial(double investInicial) {
        this.investInicial = investInicial;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
      
    public  void calcular(){
       this.rendimento =  this.investInicial * Math.pow((1 + (this.taxa/100)),this.tempo);
    }

    public String mostrar(){
       return("O rendimento total da aplicação é = " + this.rendimento);

    }

    
}

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
       double totalRendimento = getInvestInicial();
       
       for(int i = 0; i < getTempo();i++){
        totalRendimento += (totalRendimento*this.taxa)/100;
        System.out.printf("\nMês %d - rendimento/mês %.2f", (i + 1),totalRendimento);
       }
    }

    

    
}

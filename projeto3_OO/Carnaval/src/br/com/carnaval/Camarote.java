package br.com.carnaval;

public class Camarote extends Ingresso {
    private String localCamarote;
    private double valorAdcional;
    public Camarote(double valorIngresso, String localCamarote, double valorAdcional) {
        super(valorIngresso);
        this.localCamarote = localCamarote;
        this.valorAdcional = valorAdcional;
    }
    
    public String getLocalCamarote() {
        return localCamarote;
    }
    public void setLocalCamarote(String localCamarote) {
        this.localCamarote = localCamarote;
    }
    public double getValorAdcional() {
        return valorAdcional;
    }
    public void setValorAdcional(double valorAdcional) {
        this.valorAdcional = valorAdcional;
    }

    public String printIngressoCamarote(){
        return "\nCamarote: " + (getValorIngresso() + getValorAdcional()) + "\n" + localCamarote; 
    }

} 
package br.com.carnaval;

public class IngressoVip extends Ingresso {
    private double valorAdcional;

    public IngressoVip(double valorIngresso, double valorAdcional) {
        super(valorIngresso);
        this.valorAdcional = valorAdcional;
    }

    public double getValorAdcional() {
        return valorAdcional;
    }

    public void setValorAdcional(double valorAdcional) {
        this.valorAdcional = valorAdcional;
    }

    public String printIngressoVip(){
        return "\nIngresso Vip" + "\n" +(getValorIngresso() + getValorAdcional()); 
    }
    
}

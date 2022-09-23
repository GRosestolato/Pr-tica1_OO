package br.com.carnaval;

public class IngressoNormal extends Ingresso {

    public IngressoNormal(double valorIngresso) {
        super(valorIngresso);
    }
    public String printIngressoNormal(){
        return "\nIngresso Normal !" + "\n" + getValorIngresso();
    }
}

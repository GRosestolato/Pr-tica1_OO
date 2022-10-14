package br.com.poligonos;

public class Quadrado extends PoligonosRegular{

    public Quadrado(int numLados, float tamLado) {
        super(numLados, tamLado);
    }

    public float calcularArea(){
        return (getTamLado()*getTamLado()) ;
    }
    
}

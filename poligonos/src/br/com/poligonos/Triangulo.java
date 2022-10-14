package br.com.poligonos;

public class Triangulo extends PoligonosRegular{
    
    public Triangulo(int numLados, float tamLado) {
        super(numLados, tamLado);
    }


    public float calcularArea(){
        return ((getTamLado()*getTamLado())/2) ;
    }
}

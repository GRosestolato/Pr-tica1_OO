package br.com.poligonos;



public  abstract class PoligonosRegular {
    private int  numLados;
    private float tamLado;


    public PoligonosRegular(int numLados, float tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }
    public int getNumLados() {
        return numLados;
    }
    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    public float getTamLado() {
        return tamLado;
    }
    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }
    
    public float calcularPerimetro (){

        return numLados*tamLado;
    }
    public abstract float calcularArea();

       
     

}

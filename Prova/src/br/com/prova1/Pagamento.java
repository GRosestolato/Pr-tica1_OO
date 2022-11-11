package br.com.prova1;

public class Pagamento {
    float calculaSalario;
    String mostraProfessor;

    public Pagamento(float calculaSalario, String mostraProfessor) {
        this.calculaSalario = calculaSalario;
        this.mostraProfessor = mostraProfessor;
    }

    public float getCalculaSalario() {
        return calculaSalario;
    }

    public void setCalculaSalario(float calculaSalario) {
        this.calculaSalario = calculaSalario;
    }

    public String getMostraProfessor() {
        return mostraProfessor;
    }

    public void setMostraProfessor(String mostraProfessor) {
        this.mostraProfessor = mostraProfessor;
    }
    
}



package br.com.e3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        int numero, volume, tiragem;
        String dataEdicao;

        string tituloRevista;
        long issn;
        String peridiocidade;

        String titulo, resumo, autores;


        tituloRevista= JOptionPane.showInputDialog("Titulo da Revista");
        issn=Long.parseLong(JOptionPane.showInputDialog("ISSN"));
        peridiocidade= JOptionPane.showInputDialog(	"Periodicidade");

        numero=Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        volume=Integer.parseInt(JOptionPane.showInputDialog("Volume"));
        tiragem=Integer.parseInt(JOptionPane.showInputDialog("Tiragem"));
        dataEdicao=JOptionPane.showInputDialog("Data da Edição");

        Edicao ed1 = new Edicao(numero, volume, dataEdicao, tiragem);
        RevistaCientifica revista1 = new RevistaCientifica(titulo, issn, peridiocidade, ed1);

        for
        
    }
}

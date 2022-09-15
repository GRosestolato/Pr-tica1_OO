package br.com.Estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Caneta" , 100 , 25);
        System.out.println(estoque.getNome() + " - Estoque atual:" + estoque.getQtdAtual() + " - Estoque minimo: " + estoque.getQtdMinima());

        estoque.setNome("Caneta Verde");

        Estoque estoque2 = new Estoque();
        estoque2.setNome("vermelho");
        estoque2.setQtdAtual(120);
        estoque2.setQtdMinima(30);

        System.out.println(estoque2.getNome()" Estoque atual = " +  estoque2.getQtdAtual() + " Estoque minímo" + estoque2.getQtdMinima() );

        estoque.darBaixa(60);
        System.out.println(estoque.mostra());
    }
}

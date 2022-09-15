package br.com.Rendimento;

import java.util.Scanner;1

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double investInicial;
        int tempo;
        double taxa;
      

        System.out.println("Digite o valor de investimento inicial? ");
        investInicial = ler.nextDouble();
        System.out.println("Digite o valor de taxa: ");
        taxa = ler.nextDouble();
        System.out.println("Digite o tempo em meses: ");
        tempo = ler.nextInt();      
        
        Rendimento rendimento = new Rendimento(investInicial, tempo, taxa);
        rendimento.calcular();
        System.out.println(rendimento.mostrar());
    }
}

package br.com.Rendimento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double investInicial;
        int tempo;
        double taxa;
      

        System.out.println("Digite o valor de investimento inicial? ");
        investInicial = ler.nextDouble();
        System.out.println("Digite o valor de taxa mensal: ");
        taxa = ler.nextDouble();
        System.out.println("Digite o tempo em meses: ");
        tempo = ler.nextInt();      
        
        Rendimento rendimento = new Rendimento(investInicial, tempo, taxa);
        rendimento.calcular();
       
    }
}


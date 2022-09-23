package br.com.carnaval;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        double valor, valorTaxa;
        int opcao;
        do
        {
            opcao=Integer.parseInt( JOptionPane.showInputDialog("<1> Ingresso normal\n<2> Ingresso Vipe\n<3> Ingresso Camarote\n <4> Sair"));
            switch (opcao)
                {
                    case 1:

                         valor=Double.parseDouble (JOptionPane.showInputDialog("Valor do ingresso: "));
                         IngressoNormal normal = new IngressoNormal(valor);
                         JOptionPane.showMessageDialog(null, normal.printIngressoNormal()," Mensagem", JOptionPane.INFORMATION_MESSAGE);
                         
                    break;

                    case 2:

                        valor=Double.parseDouble (JOptionPane.showInputDialog("Valor do ingresso: "));
                        valorTaxa=Double.parseDouble (JOptionPane.showInputDialog("Valor da Taxa"));
                        IngressoVip vip = new IngressoVip(valor,valorTaxa);
                        JOptionPane.showMessageDialog(null, vip.printIngressoVip() ," Mensagem", JOptionPane.INFORMATION_MESSAGE);

                    break;

                    case 3:

                        valor=Double.parseDouble (JOptionPane.showInputDialog("Valor do ingresso: "));
                        valorTaxa=Double.parseDouble (JOptionPane.showInputDialog("Valor da Taxa"));
                        String local = (JOptionPane.showInputDialog("Digite o local do camarote"));
                        Camarote ingressoCamarote = new Camarote(valor,local,valorTaxa);
                        JOptionPane.showMessageDialog(null, ingressoCamarote.printIngressoCamarote() ," Mensagem", JOptionPane.INFORMATION_MESSAGE);

                    break;

                    case 4:

                    break;
                
             }          
        }
        while(opcao !=4);
    }
}

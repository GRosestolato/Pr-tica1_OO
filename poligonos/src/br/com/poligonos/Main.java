package br.com.poligonos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4);
        Quadrado  quadrado = new Quadrado(4, 4);

        JOptionPane.showMessageDialog(null, triangulo.calcularArea(),"Area do Triângulo",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, triangulo.calcularPerimetro(),"Area do Triângulo",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, quadrado.calcularArea(),"Area do Quadrado",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, quadrado.calcularArea(),"Area do Quadrado",JOptionPane.INFORMATION_MESSAGE);
        }
        
       
    }


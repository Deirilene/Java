package pkg0816_proj03_classes;

import javax.swing.JOptionPane;

public class AreaTriangulo {

    public static void main(String[] args) {
        Dimensao triangulo= new Dimensao();
        
        triangulo.altura =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da altura: ","Área do triângulo ",JOptionPane.QUESTION_MESSAGE));
        triangulo.base =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base: ","Área do triângulo ",JOptionPane.QUESTION_MESSAGE));
        
        //Para identificar que é um triângulo
        triangulo.tipo = "T";
        
        //Faz o metodo do objeto triangulo  instância da classe dimensao
        JOptionPane.showMessageDialog(null,"A área do triângulo é de "+triangulo.area(), "Área do triângulo ",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
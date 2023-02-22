package pkg0816_proj03_classes;

import javax.swing.JOptionPane;

public class AreaQuadrado {

    public static void main(String[] args) {
       Dimensao quadrado = new Dimensao();
       
       quadrado.altura = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o lado do quadrado : ","Área do Quadrado ",JOptionPane.QUESTION_MESSAGE ));
       quadrado.base = quadrado.altura;
               
        //Faz o metodo do objeto quadrado instância da classe dimensao
       JOptionPane.showMessageDialog(null,"A área do quadrado é " + quadrado.area(), "Área do Quadrado ", JOptionPane.INFORMATION_MESSAGE);
       
    }
    
}
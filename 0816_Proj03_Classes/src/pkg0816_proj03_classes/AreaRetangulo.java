package pkg0816_proj03_classes;

import javax.swing.JOptionPane;

public class AreaRetangulo {

    public static void main(String[] args) {
        Dimensao retangulo = new Dimensao();
        retangulo.altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base: ", "Área do Retângulo ",JOptionPane.QUESTION_MESSAGE));
        retangulo.base=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base: ", "Área do Retângulo ",JOptionPane.QUESTION_MESSAGE));
        
        //Faz o metodo do objeto retangulo instância da classe dimensao
        JOptionPane.showMessageDialog(null,"A área do retângulo é de: "+retangulo.area(), "Área do Retângulo ",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}

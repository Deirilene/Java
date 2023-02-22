package pkg0816_proj03_classes;

import javax.swing.JOptionPane;

public class TestaFormas {

    public static void main(String[] args) {
        int escolha;
        Dimensao formaGeometrica= new Dimensao();
        
        Object[] opcoes={"Triângulo","Quadrado","Retangulo","Sair"};  
            
        do{
            escolha=JOptionPane.showOptionDialog(null,
                    " Selecione a forma geométrica ",
                    "Classe Dimensão", 
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
            
            switch(escolha){
                case 0->{
                    formaGeometrica.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,
                           "Digite o valor da altura: ","TRIÂNGULO",JOptionPane.QUESTION_MESSAGE)));
                    formaGeometrica.setBase(Integer.parseInt(JOptionPane.showInputDialog(null,
                           "Digite o valor da base: ","TRIÂNGULO",JOptionPane.QUESTION_MESSAGE))); 
                    formaGeometrica.setTipo("T");
                    JOptionPane.showMessageDialog(null,"A área do triângulo é de "+formaGeometrica.area(),
                          "TRIÂNGULO",JOptionPane.INFORMATION_MESSAGE);
                }
                case 1->{
                    formaGeometrica.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,
                           "Digite o valor da lado: ","QUADRADO",JOptionPane.QUESTION_MESSAGE)));
                    formaGeometrica.setBase(formaGeometrica.getAltura());
                    formaGeometrica.setTipo("Q");
                    JOptionPane.showMessageDialog(null,"A área do Quadrado é de "+formaGeometrica.area(),
                          "QUADRADO",JOptionPane.INFORMATION_MESSAGE);
                } 
                case 2->{
                    formaGeometrica.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,
                           "Digite o valor da altura: ","RETÂNGULO",JOptionPane.QUESTION_MESSAGE)));
                    formaGeometrica.setBase(Integer.parseInt(JOptionPane.showInputDialog(null,
                           "Digite o valor da base: ","RETÂNGULO",JOptionPane.QUESTION_MESSAGE)));
                    formaGeometrica.setTipo("R");
                    JOptionPane.showMessageDialog(null,"A área do Retângulo é de "+formaGeometrica.area(),
                          "RETÂNGULO",JOptionPane.INFORMATION_MESSAGE);
                } 
                   
            }      
        }while(escolha != 3);  
    }
    
}

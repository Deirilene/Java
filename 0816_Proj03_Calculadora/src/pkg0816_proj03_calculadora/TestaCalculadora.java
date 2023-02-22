package pkg0816_proj03_calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TestaCalculadora {

    public static void main(String[] args) {
      
        Object[] opcao= {"+",
                        "-",
                        "/",
                        "X",
                        "Sair"};
        DecimalFormat ft=new DecimalFormat("0.00 €");
        Calculadora operacao=new Calculadora();
        int escolha;
        
        do{
            operacao.setNum1(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um número ",
                    "Calculadora",JOptionPane.QUESTION_MESSAGE)));
            escolha=JOptionPane.showOptionDialog(null,"Escolha a operação ",
                    "Calculadora",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opcao, null);
            operacao.setNum2(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número",
                    "Calculadora",JOptionPane.QUESTION_MESSAGE)));

            switch(escolha){
                case 0-> JOptionPane.showMessageDialog(null,"Resultado " +ft.format(operacao.soma()));
                case 1-> JOptionPane.showMessageDialog(null,"Resultado " +ft.format(operacao.subtracao()));
                case 2-> JOptionPane.showMessageDialog(null,"Resultado " +ft.format(operacao.divisao()));
                case 3-> JOptionPane.showMessageDialog(null,"Resultado " +ft.format(operacao.multiplicacao()));
            }  
        }while(escolha != 4);
       
        
    }
    
}

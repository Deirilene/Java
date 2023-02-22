/*
Desenvolver um programa que solicite ao utilizador uma palavra-passe; 
na sequência, o utilizador digita dois números do tipo double, e é calculada a divisão do primeiro pelo segundo. O programa irá pedir ao utilizador que confirme a password indicada anteriormente. Se estiver correta, mostra o resultado da divisão senão surge uma mensagem de erro.
*/

package pkg0816_proj02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Tarefa1 {

    public static void main(String[] args) {       
      
        DecimalFormat Ft=new DecimalFormat("0.00");//classe para formatar dados numericos
        
        String pass =(JOptionPane.showInputDialog(null,"Digite a Palavra Passe; "));
        double n1= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o 1º número; "));
        double n2= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o 2º número;"));
        String pass1 =(JOptionPane.showInputDialog(null,"Confirme a Palavra Passe; "));
        
        if(pass.equals(pass1)){
            JOptionPane.showMessageDialog(null,"Palavra passe correta !\n Resultado: "+Ft.format                (n1/n2),"Login",JOptionPane.INFORMATION_MESSAGE);//chamo a instância Ft e o metodo formate que esta dentro da classe DecimalFormat
        }
        else{
            JOptionPane.showMessageDialog(null,"Palavra Pass incorreta","Login", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

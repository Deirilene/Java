
package pkg0816_proj01;

import javax.swing.JOptionPane;

public class Exer3 {
    
    public static void main(String[] args) {
    // linha de comentário
    /*
    um bloco de comentários
    */    
    String Pass=JOptionPane.showInputDialog(null,"Digite a palavra passe");
    String Pass1=JOptionPane.showInputDialog(null,"Confirme a palavra passe");
    
    // para comparar Strings em Java vamos usar o método equals
    if(Pass.equals(Pass1)){
        JOptionPane.showMessageDialog(null, "Login efetuado","Login",
                JOptionPane.INFORMATION_MESSAGE);
    }
    else{
        JOptionPane.showMessageDialog(null, "Erro de Login","Login",
               JOptionPane.ERROR_MESSAGE);
    }
    }
}

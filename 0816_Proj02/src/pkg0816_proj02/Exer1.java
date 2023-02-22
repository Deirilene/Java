
package pkg0816_proj02;

import javax.swing.JOptionPane;

public class Exer1 {

    public static void main(String[] args) {
       
       int resposta ;
    do{
        resposta = JOptionPane.showConfirmDialog(null, "Confirma saída do programa",
            "ConfirmDialog",JOptionPane.YES_NO_OPTION); 
        
       switch(resposta){
            case 0 ->
                JOptionPane.showMessageDialog(null, "Clicou em Yes", "ConfirmDialog",JOptionPane.INFORMATION_MESSAGE);
             case 1 ->
                JOptionPane.showMessageDialog(null, "Clicou em No", "ConfirmDialog",JOptionPane.INFORMATION_MESSAGE);   
            }
        
        }while(resposta != 0);  
       
    }
    
}

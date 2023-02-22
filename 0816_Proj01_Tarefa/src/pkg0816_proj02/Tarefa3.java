/*
Exercício 3
Crieum programa  que  verifique  se uma  dada letra  digitada  é  "F"  ou  "M".  
Conforme o resultado escrever: F -Feminino, M -Masculino, Género Inválido.
*/
package pkg0816_proj02;

import javax.swing.JOptionPane;

public class Tarefa3 {

    public static void main(String[] args) {
        
        /*char sexo = JOptionPane.showInputDialog(null,"Digite o seu sexo: \n[F]Feminino \n[M]Masculino","Qual seu Género",JOptionPane.QUESTION_MESSAGE).charAt(0); 
        
       if((sexo == 'F') || (sexo == 'f')){
           JOptionPane.showMessageDialog(null," Feminino ","Sexo",JOptionPane.INFORMATION_MESSAGE);
       }else if (sexo == 'M' || sexo == 'm'){
           JOptionPane.showMessageDialog(null," Masculino ","Sexo",JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null," Género Indefinido ","Sexo",JOptionPane.INFORMATION_MESSAGE);
       */
        
        String sexo = JOptionPane.showInputDialog(null,"Digite o seu sexo: "
                                                     + "\n[F]Feminino "
                                                     + "\n[M]Masculino","Qual seu Género",                                                            JOptionPane.QUESTION_MESSAGE);
        
      /*   if((sexo.toLowerCase().equals("F"))){
           JOptionPane.showMessageDialog(null," Feminino ","Sexo",JOptionPane.INFORMATION_MESSAGE);
       }else if ((sexo.toUpperCase().equals("M"))){
           JOptionPane.showMessageDialog(null," Masculino ","Sexo",JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null," Género Indefinido ","Sexo",JOptionPane.INFORMATION_MESSAGE);
         } */
        
      //Switch rule
        switch(sexo.toUpperCase()){
            case "F"-> 
                JOptionPane.showMessageDialog(null," Feminino ","Sexo",JOptionPane.                                 INFORMATION_MESSAGE);
            case "M"->
                JOptionPane.showMessageDialog(null," Masculino ","Sexo",JOptionPane.                                INFORMATION_MESSAGE);
            default->
                JOptionPane.showMessageDialog(null," Género Indefinido ","Sexo",JOptionPane.                        INFORMATION_MESSAGE);    
        }
        
    }
}

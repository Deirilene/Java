package pkg0816_proj02;

import javax.swing.JOptionPane;

public class Exer2 {

    public static void main(String[] args) {

        String[] perguntas = {"Telefonou para a vítima?",
                              "Esteve no local do crime?",  
                              "Mora perto da vítima?",
                              "Tinha dívidas coma vítima",
                              "Já trabalhou com a vítima?"};
        int respostas= 0, resultado=0;
        
        for(int i=0; i<perguntas.length; i++){
            respostas= JOptionPane.showConfirmDialog(null,perguntas[i],"Inquérito" 
                    ,JOptionPane.YES_NO_OPTION);
            if(respostas==0)resultado++;
        }
        
        do{
        //avalia o resultado
        switch(resultado){
            case 2 -> JOptionPane.showMessageDialog(null,"Suspeito","Inquérito",
                    JOptionPane.INFORMATION_MESSAGE);
            case 3,4 -> JOptionPane.showMessageDialog(null,"Cúmplice","Inquérito",
                    JOptionPane.INFORMATION_MESSAGE);
            case 5 -> JOptionPane.showMessageDialog(null,"Assassino","Inquérito",
                    JOptionPane.INFORMATION_MESSAGE);
            default -> JOptionPane.showMessageDialog(null,"Inocente","Inquérito",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        }while(JOptionPane.showConfirmDialog(null,"Clique em Yes para repetir o Inquérito",
                "Inquérito",JOptionPane.YES_NO_OPTION)==0);
    }
    
}

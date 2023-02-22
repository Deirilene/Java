
package pkg0816_proj02_tarefa;

import javax.swing.JOptionPane;

public class Exer01_Tarefa {

    public static void main(String[] args) {

        String[] perguntas = {"Gostou do atendimento?",
                              "O funcionário esclareceu as suas questões?",  
                              "Recomenda uma ida a este balcão?",
                              "Recomendaria a um amigo?",
                              "Gostou do espaço?"};
        int respostas, resultado=0;
        
        for (String pergunta : perguntas) {
            respostas = JOptionPane.showConfirmDialog(null, pergunta, "Inquérito", JOptionPane.YES_NO_OPTION);
            if(respostas==0)resultado++;
        }
        
        do{
        //avalia o resultado
            switch(resultado){
                case 3, 4, 5 -> JOptionPane.showMessageDialog(null,"Recomendado!","Inquérito",
                        JOptionPane.INFORMATION_MESSAGE);
                default -> JOptionPane.showMessageDialog(null,"Não Recomendado","Inquérito",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }while(JOptionPane.showConfirmDialog(null,"Clique em Yes para repetir o Inquérito",
                "Inquérito",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
        
        
    }
    
}
    
    


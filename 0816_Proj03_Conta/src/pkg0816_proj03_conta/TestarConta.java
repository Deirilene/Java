package pkg0816_proj03_conta;

import javax.swing.JOptionPane;

public class TestarConta {

    public static void main(String[] args) {
        Object[] opcoes={"Inicializar a Conta ",
           "Depositar",
           "Levantar",
           "Consultar Saldo",
           "Sair"};
        int escolha;
       
        Conta contaCliente = new Conta();
       
        do{
             escolha=JOptionPane.showOptionDialog(null,"Escolha uma opção",
               "Conta Bancária", JOptionPane.DEFAULT_OPTION, 
               JOptionPane.PLAIN_MESSAGE,null, opcoes, null);
       
            switch(escolha){
                case 0-> contaCliente.inicializarConta();

                case 1-> contaCliente.depositar();

                case 2-> contaCliente.levantar();

                case 3-> contaCliente.consultaSaldo();
            } 
        }while(escolha != 4);
      
       
        
    }
    
}

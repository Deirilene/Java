
package pkg0816_proj04_heranca;

import javax.swing.JOptionPane;

public class TestarHeranca2 {

    public static void main(String[] args) {
        String nome, cor, ambiente,caracteristica, alimento;
        float comprimento, velocidade;
        int patas, escolha;
        
       Object[] opcoes={"Animais", "Peixes", "Mamiferos","Sair"};
       String[] nomes={"Animal","Peixe","Mamifero"};
      
        do{
             escolha= JOptionPane.showOptionDialog(null,
                                             "Escolha uma opção: ", 
                                             "Animais ", 
                                             JOptionPane.DEFAULT_OPTION,
                                             JOptionPane.PLAIN_MESSAGE, null, opcoes, null); 
            
            if(escolha==3) return; 
             
            nome= JOptionPane.showInputDialog(null,"Nome do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION);
            cor= JOptionPane.showInputDialog(null,"Cor do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION);
            ambiente=JOptionPane.showInputDialog(null,"Ambiente do"+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION);
            comprimento=Float.parseFloat(JOptionPane.showInputDialog(null,"Comprimento do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION));
            velocidade=Float.parseFloat(JOptionPane.showInputDialog(null,"Velocidade do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION));
            patas=Integer.parseInt(JOptionPane.showInputDialog(null,"Nº de patas do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION));
            
            
             
            switch(escolha){
                case 0 -> {
                    Animais an=new Animais(nome,cor,ambiente,comprimento,velocidade,patas);
                    an.dadosAnimal();
                }

                case 1 -> {
                   caracteristica= JOptionPane.showInputDialog(null,"Caracteristica do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION); 
                   Peixes px=new Peixes(nome,cor,ambiente,comprimento,velocidade,patas,caracteristica);
                   px.dadosAnimal(); 
                   px.dadosPeixe();
                }

                case 2 -> {
                   alimento= JOptionPane.showInputDialog(null,"Alimento do "+nomes[escolha], 
                    "Dados Animal",JOptionPane.DEFAULT_OPTION); 
                   Mamiferos mf=new Mamiferos(nome,cor,ambiente,comprimento,velocidade,patas,alimento); 
                   mf.dadosAnimal();
                   mf.dadosMamifero();
               }
            }

        }while(escolha != 3); 
        
       
    }
    
}

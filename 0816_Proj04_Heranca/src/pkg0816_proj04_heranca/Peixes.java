package pkg0816_proj04_heranca;

import javax.swing.JOptionPane;

public class Peixes extends Animais{
      private String caracteristica;
    
    //Método Construtor serve para inicializar uma classe
    public Peixes(String nome, String cor, String ambiente, float comprimento, 
            float velocidade, int patas, String caracteristica){
        super(nome,cor,ambiente,comprimento,velocidade,patas);
        this.caracteristica=caracteristica;
    }
    
    //Método para visualizar os dados
    public void dadosPeixe(){
        JOptionPane.showMessageDialog(null,"Caracteristica "+this.caracteristica,
                "DADOS DO PEIXE",JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Método Getter
    public String getCaracteristica(){
        return(this.caracteristica);
    }
    
    //Método Setter
    public void setCaracteristica(String caracteristica){
        this.caracteristica=caracteristica;
    }  
}

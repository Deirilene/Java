package pkg0816_proj04_heranca;

import javax.swing.JOptionPane;

public class Mamiferos extends Animais {
    
    private String alimento;
    
    public Mamiferos(String nome, String cor,String ambiente,float comprimento, float velocidade, int patas, String alimento ){
        super(nome,cor,ambiente,comprimento,velocidade,patas);
        this.alimento=alimento;
    }

    
    public void dadosMamifero(){
        JOptionPane.showMessageDialog(null,"Alimento: "+this.alimento, 
                "DADOS MAMIFEROS", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
   
    
    
}

package pkg0816_proj04_heranca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Animais {
    private String nome, cor, ambiente;
    private float comprimento, velocidade;
    private int patas;
    
    //método construtor, responsavel por inicializar os atributos das classes
    public Animais (String nome, String cor, String ambiente, float comprimento, float velocidade, int patas){
        this.nome=nome;
        this.cor=cor;
        this.ambiente=ambiente;
        this.comprimento=comprimento;
        this.velocidade=velocidade;
        this.patas=patas; 
        
    }
    
    //método para visualizar os dados
    public void dadosAnimal(){
        DecimalFormat ftC=new DecimalFormat("0.00 cm");
        DecimalFormat ftV=new DecimalFormat("0.00 m/s");
        JOptionPane.showMessageDialog(null,"Nome: "+this.nome
                                           +"\nCor: "+this.cor
                                           +"\nAmbiente: "+this.ambiente
                                           +"\nComprimento: "+ftC.format(this.comprimento)
                                           +"\nVelocidade: "+ftV.format(this.velocidade)
                                           +"\nQuantidade de Patas: "+this.patas,
                                           "DADOS DO ANIMAL",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    private void setNome(String nome){
        this.nome=nome;
    }
    
     private void setCor(String cor){
        this.cor=cor;
    }
     
     private void setAmbiente(String ambiente){
        this.ambiente=ambiente;
    }
    
      private void setComprimento(float comprimento){
        this.comprimento=comprimento;
    }
      
       private void setVelocidade(float velocidade){
        this.velocidade=velocidade;
    }
       
      public void setPatas(int patas){
          this.patas=patas;
      } 
     
      
      public String getNome(){
          return(this.nome);
      }
      
      public String getCor(){
          return(this.cor);
      }
      
      public String getAmbiente(){
          return(this.ambiente);
      }
      
      public float getComprimento(){
          return(this.comprimento);
      }
      
      public float getVelocidade(){
          return(this.velocidade);
      }
      
      public int getPatas(){
          return(this.patas);
      }
      
     
}

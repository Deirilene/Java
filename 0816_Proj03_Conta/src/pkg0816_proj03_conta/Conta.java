package pkg0816_proj03_conta;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conta {
    private int numConta;
    private String nome;
    private float saldo;
    
    //Criar os setters
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public void setNomeCliente (String nome){
        this.nome = nome;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    //Criar os getters
    public int getNumConta(){
        return(this.numConta);
    }
    
    public String getNome(){
        return(this.nome);
    }
    
    public float getSaldo(){
        return(this.saldo);
    }
    
    //Método para inicializar a conta
    public void inicializarConta(){
        this.numConta=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o número da Conta: "));
        this.nome=JOptionPane.showInputDialog(null,
                "Digite o nome do cliente: ");
        this.saldo=Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o saldo do cliente: "));
    }
    
    //Método p+ara depositar
    public void depositar(){
        this.saldo += Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do deposito :"));
        
    }
    
    //Método para levantar
    public void levantar(){
        this.saldo -= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do levantamento :"));
    }
    
    //Método Visualizar Dados da Conta
    public void consultaSaldo(){
        DecimalFormat ft=new DecimalFormat("0.00 €");
        JOptionPane.showMessageDialog(null,
                "Número da Conta: "+this.numConta
                +"\nNome do Cliente: "+this.nome 
                +"\nSaldo: "+ft.format(this.saldo));
        
    }
    
}

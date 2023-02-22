/*
Considere a seguinte tabela de preços:                       
             Até 5 Kg        Acima de 5 Kg   
Bananas     2,50 por Kg      2,20 por Kg
Peras       1,80 por Kg       1,50 por Kg
Se  o  cliente  comprar  mais  de  8  Kg  em  frutas  ou  o  valor  total  da  compra  ultrapassar 25,00,receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de bananase a quantidade (em Kg) de peras adquiridas e escreva o valor a ser pago pelo cliente. 
*/

package pkg0816_proj02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Tarefa2 {

    public static void main(String[] args) {
        
        DecimalFormat Ft=new DecimalFormat("0.00 £");
        float qt_banana=0, qt_pera=0, total = 0;
        float preco_b, preco_p, desconto=0.00f;
        
        JOptionPane.showInternalMessageDialog(null,
            "                Até 5kg      |  Acima de 5kg"+  
            "\nBananas  |  2,50 por Kg  |   2,20 por Kg "+ 
            "\nPeras     |  1,80 por KG  |  1,50 por kg\n ",
            "       TABELA DE PREÇOS ",JOptionPane.INFORMATION_MESSAGE);
       
       do{      
         switch (Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha a fruta: "
                                                                 + "\n[1]- Banana "
                                                                 + "\n[2]- Pera"))){
            case 1:
                qt_banana += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos Kg de banana gostaria de compras: ")); 
                break;
                
            case 2:
                qt_pera += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos Kg de Pera gostaria de compras: "));
                break;  
                
            default:    
                  JOptionPane.showMessageDialog(null, "Opção inválida! ", " ", JOptionPane.ERROR_MESSAGE);
            }
           
       }while(JOptionPane.showConfirmDialog(null,"Gostaria de compras mais frutas:","Continuar",JOptionPane.YES_NO_OPTION )!= 1 );
       
        if(qt_banana <= 5 || qt_pera <= 5 ){
                    preco_b= 2.50f;
                    preco_p= 1.80f;
                } else{
                    preco_b= 2.20f;
                    preco_p= 1.50f;
                }
        
         total = (qt_banana*preco_b)+(qt_pera*preco_p);
         if((qt_banana + qt_pera)> 8 || preco_p + preco_b > 25.00f ){  
            desconto = total*0.1f;
        } 
         JOptionPane.showMessageDialog(null,
                "Banana:  "+preco_b+"£  X "+qt_banana+"Kg  =  "+Ft.format(qt_banana*preco_b)+ 
                "\nPera:   "+preco_p+"£  X "+qt_pera+"Kg    =  "+Ft.format(qt_pera*preco_p) +
                "\nTotal:                "+Ft.format(total) +       
                "\nDesconto              "+Ft.format(desconto)+
                "\nTotal com desconto  "+Ft.format(total-desconto),
                "Acima de 8Kg desconto de 10% ",JOptionPane.INFORMATION_MESSAGE);        
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0816_proj01;

import javax.swing.JOptionPane;

public class Exer2 {
    
    public static void main(String[] args) {
        int n1,n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o 1º número"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o 2º número"));
        JOptionPane.showMessageDialog(null, "A soma é "+(n1+n2));
    }
}

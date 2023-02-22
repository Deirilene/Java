
package pkg0816_proj03_calculadora;

public class Calculadora {
   private double num1;
   private double num2;
   
   public void setNum1(double n1){
       this.num1=n1;
   }
   
   public void setNum2(double n2){
       this.num2=n2;
   }
   
   public double getNum1(){
       return(this.num1);
   }
   
   public double getNum2(){
       return(this.num2);
   }
   
   
   public double soma(){
       return(this.num1+this.num2);
   }
   
   public double subtracao(){
       return(this.num1-this.num2);
   }
   
   public double divisao(){
       return(this.num1/this.num2);
   }
   
   public double multiplicacao(){
      return(this.num1*this.num2);
   }
   
}























package pkg0816_proj03_classes;

public class Dimensao {
    public int altura, base;
    public String tipo;
    
    public int area(){
        if(this.tipo.equals("T")){
           return((altura*base)/2); 
        }else{
            return(altura*base);
        }
            
    }
    
}
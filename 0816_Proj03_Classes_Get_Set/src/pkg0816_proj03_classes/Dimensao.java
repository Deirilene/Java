package pkg0816_proj03_classes;

public class Dimensao {
    private int altura, base;
    private String tipo;
    
    //Criando Setters, do tipo void porque não devolvem o valor, somente vai mudar o valor do atributo
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    
    //Criando os Getters, necessita do tipo especifico, porque retornará  um valor para a chamada do mesmo
    
    public int getAltura(){
        return (this.altura);
    }
    
    public int getBase(){
        return(this.base);
    }
    
    public String getTipo(){
        return(this.tipo);
    }
    
    
    //Metodos
    
    public int area(){
        if(this.tipo.equals("T")){
           return((altura*base)/2); 
        }else{
           return(altura*base);
        } 
    }  
}

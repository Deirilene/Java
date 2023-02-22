package pkg0816_proj04_heranca;

public class TestarHeranca {

    public static void main(String[] args) {
        Animais an=new Animais("Camelo","Amarelo","Deserto",200,2,4);
        an.dadosAnimal();
        
        Peixes px=new Peixes("Peixe Palhaço","Laranja e branco","Oceano",0.20f,2,0,"Saúdavel");
        /*Herança permite utilizar métodos que foram definidos na super 
        classe(classe mãe)através de um objeto instânciado com a classe filha*/
        px.dadosAnimal();
        px.dadosPeixe();
        
        Mamiferos mf= new Mamiferos("Canguru","Marrom","Deserto",120,12,4,"Fruta");
        mf.dadosAnimal();
        mf.dadosMamifero();
    }
    
}

public class No{
    int dados;
    No proximo;
    
    public No(int d){
        dados = d;
        proximo = null;
    }
    
    void imprimeDado(){
        
        System.out.println("Dado = " + dados);
        
    }
    
}

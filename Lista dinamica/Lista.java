public class Lista{
    No inicio;
    
    public Lista(){
        inicio = null;
    }
    
    public void insereNoFinal(No aux){
           
         if (vazia()){
            inicio = aux;
        }
        else{
            No atual;
            atual = inicio;
            while(atual.proximo != null){
                atual.proximo =aux;
            }
        atual.proximo = aux;    
        }
       
    }
    
    public boolean vazia(){
        return (inicio == null);
    }
    
    public void imprime(){
        No atual;
            atual = inicio;
            while(atual != null){
                atual.imprimeDado();
                atual = atual.proximo;
            }
        
    }
    
    
}

public class TadFilaPessoa{
    
    int inicio;
    int fim;
    int capacidade;
    Pessoa [] pessoa;
  
    
    public TadFilaPessoa(){
        inicio = 0;
        fim = 0;
        capacidade = 5;
        pessoa = new Pessoa [capacidade];
    }
    public boolean enfileira(Pessoa aux){
        if (cheia()) return false;
        
        fim = (fim + 1) % capacidade;
        pessoa [fim] = aux;
        return true;
    }
    
    public Pessoa desenfileira(){
        if(vazia())return null;
        Pessoa aux = pessoa [inicio];
        //System.out.println(inicio);
        inicio = (inicio + 1) % capacidade;
       //System.out.println(inicio);
        return aux;
    }
   
    public void imprime(){
        if (vazia()) System.out.println("Fila Vazia");
        else{
            int posi;
            for (int i=1; i<= conta(); i++){
                posi = (inicio+i) % capacidade;
                System.out.println(pessoa[posi].nome + pessoa[posi].idade);
            }
        }
    }
    
    public boolean cheia(){
        if (inicio == (fim + 1)% capacidade) return true;
        return false;
    }
    public boolean vazia(){
        if (inicio == fim) return true;
        return false;
        
    }
    public int conta(){
        int ret;
        if (inicio < fim) 
            ret = fim - inicio;
        else
            ret = capacidade - inicio + fim;
        return (ret);
    }
}

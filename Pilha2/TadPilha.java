public class TadFila{
    
    int inicio;
    int fim;
    int capacidade;
    int dados[];
    
    public TadFila(){
        inicio = -1;
        fim = -1;
        capacidade = 2;
        dados = new int[2];
    }
    public void enfileira(int n){
        if (! cheia()){
            
            fim ++;
            dados [fim] = n;
            
        }
    }
    public void imprime(){
        for(int i = inicio+1; i<=fim; i++){
            System.out.println(dados[i]);
        }
        System.out.println();
    }
    public boolean cheia(){
        return (fim == capacidade-1);
    }
    public boolean vazia(){
        return (conta() == 0);
        
    }
    public int conta(){
        return (fim - inicio);
    }
    public int desenfileira(){
        if(!vazia())
           inicio ++;
        return dados[inicio];
    }
}

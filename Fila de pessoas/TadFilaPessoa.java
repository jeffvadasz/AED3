public class TadFilaPessoa{
    
    int inicio;
    int fim;
    int capacidade;
    Pessoa dados[];
  
    
    public TadFilaPessoa(){
        inicio = -1;
        fim = -1;
        capacidade = 5;
        dados = new Pessoa[5];
    }
    public boolean enfileira(Pessoa p){
        if (! cheia()){
            fim ++;
            dados [fim] = p;
        return true;
        }
    return false;    
    }
    
    public Pessoa desenfileira(){
        if(!vazia())
           inicio ++;
        return dados[inicio];
    }
    
    public void desmembra(TadFilaPessoa idoso,TadFilaPessoa naoidoso){
        for(int i = inicio+1; i<=fim; i++){
            if (dados[i].idade >= 60){
                idoso.enfileira(desenfileira());
            }
            else{
                naoidoso.enfileira(desenfileira());
            }
            
        }
    }
    
    public void imprime(){
        for(int i = inicio+1; i<=fim; i++){
           dados[i].imprime();
        }
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
}

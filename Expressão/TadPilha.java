public class TadPilha
{
    
    int capacidade;
    int topo;
    int dados[];
    
    boolean cheia(){
        return (topo == capacidade - 1);
    }
    
     boolean vazia(){
        return (topo == -1);
    }
    void empilha (int d){
        cheia();
        topo++;
        dados[topo] = d;
    }
    int desempilha (){
        
        int retorno = 99999;
        
        if (! vazia()){
            retorno = dados[topo];
            topo--;
        }
        return retorno;
    }
    
    void imprime(){
        for (int i = topo; i>=0; i--)
            System.out.println(dados[i]);
        System.out.println();    
    }
    
    
    
    
    
    TadPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int[c];
    }
}

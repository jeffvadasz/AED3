public class TadPilha
{
    int capacidade;
    int topo;
    int dados[];
    
    boolean cheia(){
        return (topo == capacidade - 1);
    }
    
    void empilha (int d){
        cheia();
        topo++;
        dados[topo] = d;
    }
    
    void imprime(){
        for (int i=0; i<=topo; i++)
            System.out.println(dados[i]);
    }
    
    TadPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int[c];
    }
}

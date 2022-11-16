/******************************************************************************
06 - Pilha
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    TadFila f = new TadFila();
		
		if(f.vazia())
		    System.out.println("Fila Vazia");
		    
		if(f.cheia())
		    System.out.println("Cheia");    
		    
		f.enfileira(6);
		f.enfileira(7);
		f.enfileira(8);
		f.enfileira(9);
		
		f.imprime();
		
		if(f.cheia())
		    System.out.println("Cheia");    
		
		System.out.println(f.conta());
		System.out.println("");
		
		f.desenfileira();
		f.imprime();
		
		if(f.vazia())
		    System.out.println("Fila Vazia");
		    
		System.out.println(f.conta());    
		
	}
}

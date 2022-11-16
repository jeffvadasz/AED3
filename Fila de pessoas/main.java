/******************************************************************************
07 - Fila de pessoas
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    TadFilaPessoa f = new TadFilaPessoa();
	    TadFilaPessoa idoso = new TadFilaPessoa();
	    TadFilaPessoa naoidoso = new TadFilaPessoa();
	    
	    Pessoa p1 = new Pessoa(19, 'M', "Guilherme");
	    Pessoa p2 = new Pessoa(19, 'M', "Malaga");
	    Pessoa p3 = new Pessoa(65, 'M', "Matheus");
		    
		f.enfileira(p1);
		f.enfileira(p2);
		f.enfileira(p3);
		
		f.desmembra(idoso,naoidoso);
		System.out.println("Idoso:" + idoso.conta());
		idoso.imprime();
		System.out.println("Não idoso:" + naoidoso.conta());
		naoidoso.imprime();
		
	}
}

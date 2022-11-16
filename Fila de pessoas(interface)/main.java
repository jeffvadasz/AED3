/******************************************************************************
08 - Fila de pessoas(interface)
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    TadFilaPessoa f = new TadFilaPessoa();
	    TadFilaPessoa idoso = new TadFilaPessoa();
	    TadFilaPessoa naoidoso = new TadFilaPessoa();
	    
	    Pessoa p1 = new Pessoa(19, 'M', "Guilherme ");
	    Pessoa p2 = new Pessoa(20, 'M', "Malaga ");
	    Pessoa p4 = new Pessoa(21, 'M', "And ");
	    Pessoa p5 = new Pessoa(22, 'M', "Edu ");
	    Pessoa p7 = new Pessoa(23, 'M', "Ric ");
	    Pessoa p8 = new Pessoa(24, 'M', "Mat ");
	    Pessoa p10 = new Pessoa(25, 'M', "Math ");
	    Pessoa p11 = new Pessoa(26, 'M', "Ph ");

	    Pessoa p9 = new Pessoa(65, 'M', "Matheus ");
	    Pessoa p3 = new Pessoa(65, 'M', "Oswaldo ");
	    Pessoa p12 = new Pessoa(65, 'M', "CJ ");
	    Pessoa p6 = new Pessoa(65, 'M', "Getta ");
	    Pessoa p13 = new Pessoa(65, 'M', "David ");

	    
	    f.enfileira(p1);
		f.enfileira(p2);
		f.enfileira(p3);
		f.enfileira(p4);
		f.enfileira(p5);
		f.enfileira(p6);
		f.enfileira(p7);
		f.enfileira(p8);
		f.enfileira(p9);
		f.enfileira(p10);
		f.enfileira(p11);
		f.enfileira(p12);
		f.enfileira(p13);
		
		System.out.println("");
        System.out.println ("TODOS ------------------");
        System.out.println("");
		f.imprime();
		
		f.desmembra(idoso,naoidoso);
		
		System.out.println("");
        System.out.println ("IDOSOS ------------------");
        System.out.println("");
        
		idoso.imprime();
		
		System.out.println("");
		System.out.println ("NAO IDOSOS ------------------"); 
		System.out.println("");
	
		naoidoso.imprime();
	

	    System.out.println("");
		System.out.println("ORDEM DE CHAMADA -----------------");
		System.out.println("");
		for(int i=0;i<=12;i++){
		    
		    for(int a=0;a<3;a++){
		        if(!idoso.vazia()){
		            Pessoa aux0 = idoso.desenfileira();
		            aux0.imprime();
		        }
		    }
		    	    
	    
		    for(int b=0;b<1;b++){
		        if(!naoidoso.vazia()){
		            Pessoa aux1 = naoidoso.desenfileira();
		            aux1.imprime();
		        }
		    }
        }
    }
}

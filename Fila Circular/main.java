public class Main
{
	public static void main(String[] args) {
	    
	    TadFilaPessoa f = new TadFilaPessoa();
	    TadFilaPessoa idoso = new TadFilaPessoa();
	    TadFilaPessoa naoidoso = new TadFilaPessoa();
	    
	    Pessoa p1 = new Pessoa(19, 'M', "Ronaldo ");
	    Pessoa p2 = new Pessoa(20, 'M', "Ronaldinho ");
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
		  System.out.println(" Antes de desenfileira");
		
		f.imprime();
		f.desenfileira();
		
		
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
		
		
    }
}

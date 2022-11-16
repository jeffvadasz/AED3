/******************************************************************************
05 - expressao
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		TadPilha p = new TadPilha(10);
		char aux;
		int a,b,resultado = 0;
	
		
		
		String expressao = "45+7*";
		
		
		for (int i=0; i<expressao.length(); i++){
		    aux = expressao.charAt(i);
		    
		    
		    if (aux >= '0' && aux <= '9'){
		        
		        p.empilha(aux - '0');
		       
		    }
		    
		    else{
		       a = p.desempilha();
		       b = p.desempilha();
		       
		       if (aux == '+'){
		           resultado = a + b;
		       }
		       
		       if (aux == '-'){
		           resultado = a - b;
		       }
		       
		       if (aux == '*'){
		           resultado = a * b;
		       }
		       
		       if (aux == '/'){
		           resultado = a / b;
		       }
		       
		       if (aux == '%'){
		           resultado = a % b;
		       }
		       
		       p.empilha(resultado);
		       //System.out.println(resultado);
		    }
		}
		resultado = p.desempilha();
		System.out.println(expressao + " = " + resultado);
	}
}

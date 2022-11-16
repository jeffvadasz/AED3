/******************************************************************************
04 - String
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	 String nome = "Marcao";
	 
	 int tamanho = nome.length();
	 
	 char primeiro = nome.charAt(0);
	 char ultimo = nome.charAt(tamanho - 1);
	 
	 System.out.println(tamanho + "\n" + primeiro + "\n" + ultimo); 

	}
}

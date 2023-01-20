package quest1_livro;

	import java.util.Scanner;

	public class quest1_A {
	static Scanner entrada = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			/*variaveis
			 */
			int tamanho_palavra, x, y, z;
			
			System.out.println("INFORME UMA PALAVRA COM 5 LETRAS : ");
			String palavra = entrada.nextLine();
			
			
			if(palavra.length() > 5) {
			System.out.println(" PALAVRA COM MAIS DE 5 LETRAS! por favor corrija ");
			}
			else {
			tamanho_palavra = palavra.length();
			
			for(x = 0; x < tamanho_palavra; x++)
				for(y= 0; y < tamanho_palavra;y++)
					for(z = 0; z< tamanho_palavra;z++) {
						if(x != y && x != z && y != z)
							System.out.printf("%c%c%c \n",palavra.charAt(x), palavra.charAt(y), palavra.charAt(z));
					}
		}
	}
	}






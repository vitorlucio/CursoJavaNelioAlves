import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.36548;
		String nome = "Vitor";
		int idade = 29;
		double renda = 10000.0;
		
		
		System.out.println("Olá mundo!");
		// printLN com espaçamento
		
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		// Imprmir com 2 casas decimais com ",".
		
		System.out.printf("%.4f%n", x);
		// Imprimir com 4 casas decimais com ",".
		
		Locale.setDefault(Locale.US);
		// Imprimir com as casas decimais com o "."
		
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		// concatenar varios elementos
		
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		// concatenar com ponto flutuante
		
		System.out.printf("%s tem %d anos e pretende ganhar R$ %.2f reais%n", nome, idade, renda);
		// Impressão de varios valores interpolados dentro de uma string 
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		

	}

}



package treinando;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Exercício 1 Escreva um programa que repita a leitura de uma senha até que ela
		 * seja válida. Para cada leitura de senha incorreta informada, escrever a
		 * mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
		 * a senha correta é o valor 2002.
		 * 
		 * Entrada: 2200 Saída: Senha Invalida; Entrada: 1020 Saída: Senha Invalida;
		 * Entrada: 2022 Saída: Senha Invalida; Entrada: 2002 Saída: Acesso Permitido;
		 * 
		 */

		// Resolução:

		/*
		 * System.out.println("Por favor digite sua senha: "); int senha = sc.nextInt();
		 * 
		 * // senha = sc.nextInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha inválida!");
		 * System.out.println("Por favor digite sua senha: "); senha = sc.nextInt(); }
		 * System.out.println("Acesso permitido!");
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 2 Escreva um programa para ler as coordenadas (X,Y) de uma
		 * quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto
		 * escrever o quadrante a que ele pertence. O algoritmo será encerrado quando
		 * pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
		 * mensagem alguma).
		 * 
		 * Entrada: 2 e 2 Saída: Primeiro; Entrada: 3 e -2 Saída: Quarto; Entrada: -8 e
		 * -1 Saída: Terceiro; Entrada: -7 e 1 Saída: segundo; Entrada: 0 e 2
		 * 
		 */

		// Resolução:

		/*
		 * int x, y;
		 * 
		 * System.out.println("Por favor digite o valor de X: "); x = sc.nextInt();
		 * System.out.println("Por favor digite o valor de Y: "); y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) {
		 * 
		 * if (x > 0 && y > 0) { System.out.println("Primeiro"); } else if (x < 0 && y >
		 * 0) { System.out.println("Segundo"); } else if (x < 0 && y < 0) {
		 * System.out.println("Terceiro"); } else { System.out.println("Quarto"); }
		 * System.out.println("Por favor digite o valor de X: "); x = sc.nextInt();
		 * System.out.println("Por favor digite o valor de Y: "); y = sc.nextInt(); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 3 Um Posto de combustíveis deseja determinar qual de seus produtos
		 * tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 * 
		 * Entrada: 8 Saída: MUITO OBRIGADO; Entrada: 1 Saída: Alcool: 1; Entrada: 7
		 * Saída: Gasolina: 2; Entrada: 2 Saída: Diesel: 0; Entrada: 2; Entrada: 4;
		 */

		// Resolução:
		
		/*
		int x;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Qual o combustibel escolhido:");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Terminar");
		System.out.println("Digite a opção:");

		x = sc.nextInt();

		while (x != 4) {
			if (x == 1) {
				alcool = alcool + 1;
			} else if (x == 2) {
				gasolina = gasolina + 1;
			} else if (x == 3) {
				diesel = diesel + 1;
			}

			x = sc.nextInt();
		}
		System.out.println("MUITO oBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		*/
		
		
	}

}

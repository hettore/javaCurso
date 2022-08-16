package treinando;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * ESTRUTURA REPETITIVA WHILE:
		 * 
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
		 * int x; int alcool = 0; int gasolina = 0; int diesel = 0;
		 * 
		 * System.out.println("Qual o combustibel escolhido:");
		 * System.out.println("1 - Alcool"); System.out.println("2 - Gasolina");
		 * System.out.println("3 - Diesel"); System.out.println("4 - Terminar");
		 * System.out.println("Digite a opção:");
		 * 
		 * x = sc.nextInt();
		 * 
		 * while (x != 4) { if (x == 1) { alcool = alcool + 1; } else if (x == 2) {
		 * gasolina = gasolina + 1; } else if (x == 3) { diesel = diesel + 1; }
		 * 
		 * x = sc.nextInt(); } System.out.println("MUITO oBRIGADO");
		 * System.out.println("Alcool: " + alcool); System.out.println("Gasolina: " +
		 * gasolina); System.out.println("Diesel: " + diesel);
		 * 
		 * sc.close();
		 */

		// ESTRUTURA REPETITIVA FOR:

		/*
		 * Exercício 1 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os
		 * ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
		 * 
		 * Entrada: 8; Saída: 1;3;5;7
		 */

		// Resolução:

		/*
		 * int x;
		 * 
		 * System.out.print("Digite um número: ");
		 * 
		 * x = sc.nextInt();
		 * 
		 * for (int i = 0; i <= x; i++) { if (i % 2 != 0) {
		 * 
		 * System.out.println(i);
		 * 
		 * } }
		 */

		/*
		 * Exercício 2 Leia um valor inteiro N. Este valor será a quantidade de valores
		 * inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão
		 * dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		 * essas informações conforme exemplo (use a palavra "in" para dentro do
		 * intervalo, e "out" para fora do intervalo).
		 * 
		 * Entrada: 5;14;123;10;-25;32 Saída: 2 in; 3 in.
		 */

		// Resolução

		/*
		 * int n; int in = 0; int out = 0;
		 * 
		 * System.out.println("Quantos número você quer verificar: "); n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) { System.out.println("Digite um número: "); int y
		 * = sc.nextInt(); if (y >= 10 && y <= 20) { in = in + 1; } else { out = out +
		 * 1; } } System.out.println(in + "in"); System.out.println(out + "out");
		 * 
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 3 Leia 1 valor inteiro N, que representa o número de casos de teste
		 * que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um
		 * deles com uma casa decimal. Apresente a média ponderada para cada um destes
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		 * valor tem peso 3 e o terceiro valor tem peso 5.
		 * 
		 * Entrada: 3; 6.5,4.3,6.1; 5.1,4.2,8.1; 8.0,9.0,10.0; Saída: 5.7; 6.3; 9.3;
		 * 
		 */

		// Resolução:

		/*
		 * int n; double n1; double n2; double n3; double media;
		 * 
		 * System.out.println("bem vindo ao app de notas ponderadas!");
		 * System.out.println("Digite a quantidade de testes: "); n = sc.nextInt();
		 * 
		 * for (int j = 0; j < n; j++) { System.out.println("Digite a primeira nota:");
		 * n1 = sc.nextDouble(); System.out.println("Digite a segunda nota:"); n2 =
		 * sc.nextDouble(); System.out.println("Digite a terceira nota:"); n3 =
		 * sc.nextDouble();
		 * 
		 * media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10; System.out.printf(" %.1f%n ",
		 * media);
		 * 
		 * }
		 */

		/*
		 * Exercício 4 Fazer um programa para ler um número N. Depois leia N pares de
		 * números e mostre a divisão do primeiro pelo segundo. Se o denominador for
		 * igual a zero, mostrar a mensagem "divisao impossivel".
		 * 
		 * Entrada: 3; 3 e -2; -8 e 0; 0 e 8; Saída: -1.5; divisão impossivel; 0.0;
		 * 
		 */

		// Resolução:

		/*
		 * int n; double divisao = 0; int x, y;
		 * 
		 * System.out.println("Digite o numero de divisões: "); n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * System.out.println("Digite o numero que vc quer dividir: "); x =
		 * sc.nextInt(); System.out.println("Digite o denominador: "); y = sc.nextInt();
		 * 
		 * if (y != 0) { divisao = (double) x / y; System.out.printf(" %.1f%n",
		 * divisao); } else { System.out.println("Divisão impossivel."); }
		 * 
		 * }
		 */

		/*
		 * Exercício 5 Ler um valor N. Calcular e escrever seu respectivo fatorial.
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por
		 * definição, fatorial de 0 é 1.
		 * 
		 * Entrada: 4 Saída: 24; Entrada: 1 Saída: 1; Entrada: 5 Saída: 120; Entrada: 0
		 * Saída: 1;
		 * 
		 */

		// Resolução:

		/*
		 * System.out.println("Por favor entre com um número: "); int x = sc.nextInt();
		 * int y = 1;
		 * 
		 * for (int i = 1; i <= x; i++) { y = y * i; } System.out.println(y);
		 */

		/*
		 * Exercício 6 Ler um número inteiro N e calcular todos os seus divisores.
		 * 
		 * Entrada: 6 Saída: 1; 2; 3; 6.
		 */

		// Resolução:

		/*
		 * System.out.println("Por favor digite um número: "); int n = sc.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * if (n % i == 0) { System.out.println(i); } } sc.close();
		 */

		/*
		 * Exercício 7 Fazer um programa para ler um número inteiro positivo N. O
		 * programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada
		 * linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
		 * conforme exemplo
		 * 
		 * Entrada: 5. Saída: 1; 1; 1, 2; 4; 8, 3; 9; 27, 4; 16; 64, 5; 25; 125. 
		 */

		// Resolução:
			
		System.out.println("Por favor digite um número: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			int linha = i;
			int quadrado = i * i;
			int cubo = i * i * i;
		
			System.out.printf(" %d %d %d%n", linha, quadrado, cubo );
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package treinando;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Exercício 1 Fazer um programa para ler um número inteiro, e depois dizer se
		 * este número é negativo ou não.
		 * 
		 * Entrada: -10 Saída: NEGATIVO Entrada: 8 Saída: NÃO NEGATIVO Entrada: 0 Saída:
		 * NÃO NEGATIVO
		 */

		// Resolução:

		/*
		 * 
		 * int a;
		 * 
		 * a = sc.nextInt();
		 * 
		 * if (a < 0) { System.out.println("Este número é Negativo!");
		 * 
		 * } else { System.out.println("Este número é Positivo!"); }
		 * 
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 2 Fazer um programa para ler um número inteiro e dizer se este
		 * número é par ou ímpar.
		 * 
		 * Entrada: 12 Saída: PAR Entrada: -27 Saída: IMPAR Entrada: 0 Saída: PAR
		 */

		// Resolução

		/*
		 * int a;
		 * 
		 * a = sc.nextInt();
		 * 
		 * if (a % 2 == 0 ) { System.out.println("Este número é par!");
		 * 
		 * } else { System.out.println("Este número é impar!"); }
		 * 
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 3 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
		 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
		 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
		 * em ordem crescente ou decrescente.
		 * 
		 * Entrada: 6 e 24 Saida: SAO MULTIPLOS Entrada: 6 E 25 Saida: NAO SAO MULTIPLOS
		 * Entrada: 24 E 6 Saida: SAO MULTIPLOS
		 * 
		 */

		// Resolucao:

		/*
		 * int a, b;
		 * 
		 * a = sc.nextInt(); b = sc.nextInt();
		 * 
		 * if (a <= b) { int result = b % a; if (result == 0) {
		 * System.out.println("SAO MULTIPLOS"); } else {
		 * System.out.println("NAO SAO MULTIPLOS"); }
		 * 
		 * } else if (a >= b) { int result = a % b; if (result == 0) {
		 * System.out.println("SAO MULTIPLOS"); } else {
		 * System.out.println("NAO SAO MULTIPLOS"); } }
		 */

		/*
		 * Exercicio 4 Leia a hora inicial e a hora final de um jogo. A seguir calcule a
		 * duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em
		 * outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 * 
		 * Entrada: 16 e 2 Saida: O JOGO DUROU 10 HORA(S) Entrada: 0 e 0 Saida: O JOGO
		 * DUROU 24 HORA(S) Entrada: 2 e 16 Saida: O JOGO DUROU 14 HORA(S)
		 */

		// Resolucao:

		/*
		 * int horaInicial, horaFinal;
		 * 
		 * horaInicial = sc.nextInt(); horaFinal = sc.nextInt();
		 * 
		 * int duracao;
		 * 
		 * if (horaInicial < horaFinal) { duracao = horaFinal - horaInicial; } else {
		 * duracao = 24 - horaInicial + horaFinal; }
		 * 
		 * System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicos 5 Com base na tabela abaixo, escreva um programa que leia o código
		 * de um item e a quantidade deste item. A seguir, calcule e mostre o valor da
		 * conta a pagar.
		 * 
		 * CODIGO: 1 ESPECIFICACAO: Cachorro Quente PRECO: R$ 4.00 CODIGO: 2
		 * ESPECIFICACAO: X-Salada PRECO: R$ 4.50 CODIGO: 3 ESPECIFICACAO: X-Bacon
		 * PRECO: R$ 5.00 CODIGO: 4 ESPECIFICACAO: Torrada Simples PRECO: R$ 2.00
		 * CODIGO: 5 ESPECIFICACAO: Refrigerante PRECO: R$ 1.50
		 * 
		 * Entrada: 3 e 2 Saida: TOTAL: R$ 10.00 Entrada: 2 e 3 Saida: TOTAL: R$ 13.50
		 * 
		 */

		// Resolucao:

		/*
		 * int codigo; int quantidade;
		 * 
		 * System.out.println("Por favor digite o codigo do produto: "); codigo =
		 * sc.nextInt(); System.out.println("Agora digite a quantidade: "); quantidade =
		 * sc.nextInt();
		 * 
		 * double preco = 0;
		 * 
		 * if (codigo == 1) { preco = quantidade * 4.00; } else if (codigo == 2) { preco
		 * = quantidade * 4.50; } else if (codigo == 3) { preco = quantidade * 5.00; }
		 * else if (codigo == 4) { preco = quantidade * 2.00; } else if (codigo == 5) {
		 * preco = quantidade * 1.50; } else {
		 * System.out.println("Por favor digite um valor valido no menu!"); }
		 * 
		 * 
		 * System.out.printf("TOTAL: R$ %.2f%n", preco);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 6 Você deve fazer um programa que leia um valor qualquer e
		 * apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25],
		 * (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não
		 * estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de
		 * intervalo”.
		 * 
		 * Entrada: 25.01 Saida: Intervalo (25,50) Entrada: 25.00 Saida: Intervalo
		 * (0,25) Entrada: 100.00 Saida: Intervalo (75,100) Entrada: -25.02 Saida: Fora
		 * do intervalo
		 */

		// Resolucao:

		/*
		 * double valor;
		 * 
		 * valor = sc.nextDouble();
		 * 
		 * if ( valor >= 0 && valor <= 25 ) {
		 * System.out.println("Intervalo de (0 a 25)"); } else if ( valor > 25 && valor
		 * <= 50) { System.out.println("Intervalo de (25 a 50)"); } else if ( valor > 50
		 * && valor <= 75) { System.out.println("Intervalo de (50 a 75)"); } else if (
		 * valor > 75 && valor <= 100) { System.out.println("Intervalo de 75 a 100"); }
		 * else { System.out.println("Fora do intervalo"); }
		 */

		/*
		 * Exercicio 7 Leia 2 valores com uma casa decimal (x e y), que devem
		 * representar as coordenadas de um ponto em um plano. A seguir, determine qual
		 * o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
		 * cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a
		 * mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou
		 * “Eixo Y”, conforme for a situação.
		 * 
		 * 
		 */

		// Resolucao:

		/*
		 * double x, y;
		 * 
		 * System.out.println("por favor insira a coordenada de x: "); x =
		 * sc.nextDouble(); System.out.println("por favor insira a coordenada de y: ");
		 * y = sc.nextDouble();
		 * 
		 * if (x == 0 && y == 0) { System.out.println("Origem."); } else if (x > 0 && y
		 * > 0) { System.out.println("Q1"); } else if (x < 0 && y > 0) {
		 * System.out.println("Q2"); } else if (x < 0 && y < 0) {
		 * System.out.println("Q3"); } else if (x > 0 && y < 0) {
		 * System.out.println("Q4"); } else if (x == 0 && y != 0) {
		 * System.out.println("Eixo y"); } else if (y== 0 && x != 0) {
		 * System.out.println("Eixo x"); } else { System.out.println("FIM."); }
		 */

		/*
		 * Exercício 8 Em um país imaginário denominado Lisarb, todos os habitantes
		 * ficam felizes em pagar seus impostos, pois sabem que nele não existem
		 * políticos corruptos e os recursos arrecadados são utilizados em benefício da
		 * população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é
		 * o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma
		 * pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve
		 * pagar de Imposto de Renda, segundo a tabela abaixo.
		 * 
		 * Renda: de 0.00 a R$ 2000.00 Imposto de renda: Isento; Renda: de R$ 2000.01
		 * até R$ 3000.00 Imposto de renda: 8%; Renda: de R$ 3000.01 até R$ 4500.00
		 * Imposto de renda: 18%; Renda: Acima de 4500.00 Imposto de renda: 28%;
		 * 
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
		 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
		 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
		 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
		 * valor deve ser impresso com duas casas decimais.
		 */

		// Resolução:

		/*
		double salario;
		double imposto;
		//double imposto2;

		System.out.println("Por favor digite o valor do salário a ser calculado: ");
		salario = sc.nextDouble();

		if (salario < 2000.00) {
			System.out.println("Imposto de reda: Isento.");
		} else if (salario > 2000.00 && salario < 3000.00) {
			imposto = (salario - 2000.00) * 8 / 100;
			System.out.printf("Impostos: R$ %.2f%n ", imposto);
		} else if (salario > 3000.00 && salario < 4500.00) {
			imposto = (salario - 3000.00) * 18 / 100 + 1000.00 * 8 / 100;
			System.out.printf("Impostos: R$ %.2f%n ", imposto);
		} // else if (salario > 4500.00) {
			// imposto = (salario - 4500.00) * 28/100 + 1500.00 * 18/100 + 1000.00 *8/100;
			// System.out.printf("Imposto: %.2f%n ", imposto);
		// }
		else {
			imposto = (salario - 4500.00) * 28 / 100 + 1500.00 * 18 / 100 + 1000.00 * 8 / 100;
			System.out.printf("Imposto: R$ %.2f%n ", imposto);
		}
		*/
	}

}

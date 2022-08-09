package treinando;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Exemplo: Fazer um programa para ler as medidas da largura e comprimento de um
		 * terreno retangular com uma casa decimal, bem como o valor do metro quadrado
		 * do terreno com duas casas decimais. Em seguida, o programa deve mostrar o
		 * valor da área do terreno, bem como o valor do preço do terreno, ambos com
		 * duas casas decimais.
		 * 
		 * entrada: Saída: 10.00 AREA = 300.00 30.00 PREÇO = 60000.00 200.00
		 */

		// Resolução:

		/*
		 * double largura = sc.nextDouble(); double comprimento = sc.nextDouble();
		 * double metroQuadrado = sc.nextDouble();
		 * 
		 * double area = largura * comprimento; double preco = area * metroQuadrado;
		 * 
		 * System.out.printf("AREA = %.2f%n", area); System.out.printf("PREÇO = %.2f%n",
		 * preco);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 1 Faça um programa para ler dois valores inteiros, e depois mostrar
		 * na tela a soma desses números com uma mensagem explicativa, conforme
		 * exemplos.
		 * 
		 * Entrada:10 e 30 Saída: SOMA = 40 Entrada:-30 e 10 Saída: SOMA = -20 Entrada:0
		 * e 0 Saída: SOMA = 0
		 */

		// Resolução:

		/*
		 * int a, b;
		 * 
		 * a = sc.nextInt(); b = sc.nextInt();
		 * 
		 * System.out.println("SOMA = " + (a + b));
		 * 
		 * sc.close()
		 */

		/*
		 * Exercício 2 Faça um programa para ler o valor do raio de um círculo, e depois
		 * mostrar o valor da área deste círculo com quatro casas decimais conforme
		 * exemplos. Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 * 
		 * Entrada: 2.00 Saída: A=12.5664 Entrada: 100.64 Saída: A=31819.3103 Entrada:
		 * 150.00 Saída: A=70685.7750
		 */

		// Resolução:
		/*
		 * double x = sc.nextDouble();
		 * 
		 * double area = 3.14159 * x * x;
		 * 
		 * System.out.printf("A= %.4f %n", area);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 3 Fazer um programa para ler quatro valores inteiros A, B, C e D. A
		 * seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e
		 * D segundo a fórmula: DIFERENCA = (A * B - C * D). Entrada:5,6,7 e 8 Saída:
		 * DIFERENÇA = -26 Entrada:5,6,-7 E 8 Saída: DIFERENÇA = 86
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int A = sc.nextInt(); int B = sc.nextInt(); int C = sc.nextInt(); int D =
		 * sc.nextInt();
		 * 
		 * int diferenca = ((A*B)-(C*D));
		 * 
		 * System.out.printf("DIFERENÇA = " + diferenca );
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 4 Fazer um programa que leia o número de um funcionário, seu número
		 * de horas trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 * 
		 * Entrada: 25,100 e 5.50 Saída: NUMBER = 25 SALARY = U$ 550.00 Entrada: 1,200 e
		 * 20.50 Saída: NUMBER = 1 SALARY = U$ 4100.00 Entrada: 6,145 e 15.55 Saída:
		 * NUMBER = 25 SALARY = U$ 2254.75
		 */

		// Resolução:

		/*
		 * int numeroF; double horasT, valor;
		 * 
		 * numeroF = sc.nextInt(); horasT = sc.nextDouble(); valor = sc.nextDouble();
		 * 
		 * System.out.println("NUMBER = " + numeroF);
		 * System.out.printf("SALARY = U$ %.2f %n", horasT * valor);
		 * 
		 * 
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 5 Fazer um programa para ler o código de uma peça 1, o número de
		 * peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de
		 * peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser
		 * pago.
		 * 
		 * Entrada: 12 1 5.30 | 16 2 5.10 Saída: VALOR A PAGAR: R$ 15.50 Entrada: 13 2
		 * 15.30 | 161 4 5.20 Saída: VALOR A PAGAR: R$ 51.40 Entrada: 1 1 15.10 | 2 1
		 * 15.10 Saída: VALOR A PAGAR: R$ 30.20
		 */

		// Resolução:

		/*
		 * 
		 * int codigo1, quantidade1, codigo2, quantidade2; double preco1, preco2;
		 * 
		 * codigo1 = sc.nextInt(); quantidade1 = sc.nextInt(); preco1= sc.nextDouble();
		 * 
		 * codigo2 = sc.nextInt(); quantidade2 = sc.nextInt(); preco2 = sc.nextDouble();
		 * 
		 * System.out.printf("VALOR TOTAL A PAGAR = R$ %.2f %n ", (quantidade1 * preco1
		 * + quantidade2 * preco2));
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 6 Fazer um programa que leia três valores com ponto flutuante de
		 * dupla precisão: A, B e C. Em seguida, calcule e mostre: a) a área do
		 * triângulo retângulo que tem A por base e C por altura. b) a área do círculo
		 * de raio C. (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C
		 * por altura. d) a área do quadrado que tem lado B. e) a área do retângulo que
		 * tem lados A e B
		 * 
		 * Entrada: 3.0 4.0 5.2 Saída: TRIANGULO: 7.800 CIRCULO: 84.949 TRAPEZIO: 18.200 QUADRADO: 16.000 RETANGULO: 12.000
		 * Entrada: 12.7 10.4 15.2 Saída: TRIANGULO: 96.520 CIRCULO: 725.833 TRAPEZIO: 175.833 QUADRADO: 108.160 RETANGULO: 132.000
		 */

		/*
		 * 
		 * double A, B, C;
		 * 
		 * A = sc.nextDouble(); B = sc.nextDouble(); C = sc.nextDouble();
		 * 
		 * 
		 * System.out.printf("TRIANGULO: %.3f %n", (A * C) / 2);
		 * System.out.printf("CIRCULO: %.3f %n", (C * C) * 3.14159);
		 * System.out.printf("TRAPEZIO: %.3f %n", ((A + B) * C)/2);
		 * System.out.printf("QUADRADO: %.3f %n", B * B);
		 * System.out.printf("RETANGULO: %.3f %n", A * B);
		 * 
		 * 
		 * 
		 * sc.close();
		 */

	}

}

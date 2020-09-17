/*3. (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros 
utilizados para cada tanque cheio. 
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) 
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem total
e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. 
Todos os cálculos de média devem produzir resultados de ponto flutuante. 
Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/

import java.util.Scanner;

public class Fuel {
	public static void main(String[] args) {
		int km;
		int kmSoma=0;
		int litro;
		int litroSoma=0;
		double resultado;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Insira a quilometragem: ");
			km = entrada.nextInt();
			System.out.println("Insira o consumo (em litros): ");
			litro = entrada.nextInt();
			resultado = km/litro;
			kmSoma = kmSoma + km;
			litroSoma = litroSoma + litro;
			System.out.printf("Consumo em km/litro: %.2f\n", resultado);
			System.out.printf("Quilometragem percorrida: %d km\n", kmSoma);
			System.out.printf("Consumo total de gasolina: %d litros\n", litroSoma);
		} while (km != -1); 
	}
}
import java.util.Scanner;

public class Analise {
	public static void main(String[] args) {
		int aprovacoes = 0;
		int reprovacoes = 0;
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("Insira resultado %d (1 ou 2):", i+1);
			int resultado = entrada.nextInt();
			if(resultado == 1) { 
			aprovacoes++; 
			}
			else {
				reprovacoes++; 
			}
		}
		System.out.println("Aprovados: "+ aprovacoes);
		System.out.println("Reprovados: "+ reprovacoes);
		if (aprovacoes>=8) { System.out.println("Bonus ao instrutor!"); }
	}
}
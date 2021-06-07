package duracaodojogo;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {
		// CONTAGEM DE TEMPO DO JOGO
		
		Scanner sc = new Scanner(System.in);
		
		int horainicial =sc.nextInt();
		int horafinal = sc.nextInt();
		int duracao;
		
		if(horainicial < horafinal) {
			duracao = horafinal - horainicial;
		}
		else {
			duracao = 24 - horainicial + horafinal;
		}
        System.out.println("O TEMPO FOI DE " + duracao);
        }

}

package questao1;

import java.util.Scanner;

public class CronometroUtil {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);	
		int op;
		int qtdCron = 0;	
		final int MAX = 10;
		Cronometro[] cronometros = new Cronometro[MAX];
		
		do {
			System.out.println();
			System.out.println("**********************MENU*********************");
			System.out.println("* 1 - Adicionar novo cronometro               *");
			System.out.println("* 2 - Consultar determinado cronometro        *");
			System.out.println("* 3 - Consultar todos cronometros             *");
			System.out.println("* 4 - Sair                                    *");
			System.out.println("***********************************************");
			System.out.println();
			
			System.out.println("Operação (1 - 4): ");
			op = scanner.nextInt();
			
			switch(op) {
			
			case 1:
				if(qtdCron == MAX) {
					System.out.println("Já foram adicionados 10 cronometros");
				} else {
					Cronometro cron = new Cronometro(false);
					cronometros[qtdCron] = cron;
					qtdCron++;
					
					cron.start();
				}
				
				break;
				
			case 2:
				if(qtdCron == 0) {
					System.out.println("Não há cronometros");
				} else {
					System.out.println("Qual cronometro?(1 - " + qtdCron + ")");
					int nCron = scanner.nextInt();
					if(nCron <= 0 || nCron > qtdCron) {
						System.out.println("Não há cronometro de número " + nCron);
					} else {
						System.out.println("Contagem atual do cronometro '" + nCron + "': " + cronometros[nCron - 1].getContador());
					}
				}
				
				break;
				
			case 3:
				if(qtdCron == 0) {
					System.out.println("Não há cronometros");
				} else {
					for(int i = 0; i <= MAX; i++) {
						System.out.println("Cronometro " + (i + 1) + ": " + cronometros[i].getContador());
					}
				}
				
				break;
				
			}
				
		} while (op != 4);
		
		scanner.close();
	}

}

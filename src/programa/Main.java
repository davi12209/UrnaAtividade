package programa;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static CadastroCandidato cad = new CadastroCandidato();
	public static Urna urna = new Urna(cad);

	public static void main(String[] args) {
		
		
		do {
			
			System.out.println("------MENU------");
			System.out.println("1) Cadastro de candidatos"
						+ "\n 2)Começar votção"
						+ "\n 3)Mostrar resultado"
						+ "\n 4)Nova votção"
						+ "\n 5)Salvar em arvivo CSV");
			int op = scanner.nextInt();
			
			switch(op) {
			
			case 1:
				try {
					cad.cadastrarCandidato();
				} catch (UrnaException e) {			
					e.getMessage();
				}
				break;
			case 2:
				
					System.out.println("Digite o numero de um candidato: ");
					int candidato = scanner.nextInt();
					urna.votar(candidato);	
				break;
				
			case 3:
				
				urna.mostrarResultado();
				break;
				
			case 4:
				
				urna.novaVotaco();
				break;
			}
			
		}while(true);

	}

}

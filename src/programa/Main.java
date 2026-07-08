package programa;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static CadastroCandidato cad = new CadastroCandidato();
	public static Urna urna = new Urna(cad);
	public static ArquivoCSV arquivoCSV = new ArquivoCSV();
	

	public static void main(String[] args) {
		
		
		do {
			
			System.out.println("------MENU------");
			System.out.println("1)Cadastro de candidatos"
						+ "\n 2)Começar votção"
						+ "\n 3)Mostrar resultado"
						+ "\n 4)Nova votção"
						+ "\n 5)Salvar em arvivo CSV"
						+ "\n 6)Sair do programa");
			int op = scanner.nextInt();
			
			switch(op) {
			
			case 1:
				try {
					cad.cadastrarCandidato();
				} catch (UrnaException e) {			
					System.out.println(e.getMessage());
				}
				break;
			case 2:
					while(true) {
						System.out.println("Digite o numero de um candidato ou 0 para voto em branco: ");
						int candidato = scanner.nextInt();
						urna.votar(candidato);
						
						System.out.println("parar a votação digite 1");
						op = scanner.nextInt();
						if(op == 1) {
							break;
						}
					}
				break;
				
			case 3:
				
				urna.mostrarResultado();
				break;
				
			case 4:
				
				urna.novaVotaco();
				break;
				
			case 5:
				
				System.out.println("Criando arquivo CSV.");
				arquivoCSV.salvar(urna);
				break;
			
			case 6:
				return;
			}
			
			
		}while(true);

	}

}

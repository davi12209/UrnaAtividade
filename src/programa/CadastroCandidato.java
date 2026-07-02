package programa;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroCandidato {
	
	public ArrayList<Candidato> candidatos = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	
	
	
	public void cadastrarCandidato() throws UrnaException{
		
		System.out.println("Digite o nome do candidato:");
		String nome = scanner.next();
		
		if(nome == null) {	
			throw new UrnaException("Nome vazio");	
		}
		
		System.out.println("Digite o numero do candidato");
		int num = scanner.nextInt();
		
		for(Candidato c : candidatos) {
			
			if(c.getNum() == 13) {
				
				throw new UrnaException("Esse numero já está sendo utilizado");
				
			}
		}
		
		
		
		Candidato candidato = new Candidato(nome, num);
		
		candidatos.add(candidato);
		
	}
	
	public void removerCandidato(int num) {
		
		for(Candidato c : candidatos) {
			
			if(c.getNum() == num) {
				
				candidatos.remove(c);
				
			}
		}
		
	}


	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	
	
	
	
}

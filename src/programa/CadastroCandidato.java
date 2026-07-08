package programa;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroCandidato {
	
	public ArrayList<Candidato> candidatos = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	
	
	 // Cadastra um novo candidato
	public void cadastrarCandidato() throws UrnaException{
		
		System.out.println("Digite o nome do candidato:");
		String nome = scanner.next();
		
		// Verifica se o nome foi informad
		if(nome.isEmpty()) {	
			throw new UrnaException("Nome vazio");	
		}
		
		System.out.println("Digite o numero do candidato");
		int num = scanner.nextInt();
		
		 // Verifica se já existe um candidato com esse número
		for(Candidato c : candidatos) {
			
			if(c.getNum() == num) {
				
				throw new UrnaException("Esse numero já está sendo utilizado");
				
			}
		}
		
		// Cria e adiciona o candidato à lista
		
		Candidato candidato = new Candidato(nome, num);
		
		candidatos.add(candidato);
		
	}
	
	public void removerCandidato(int num) {

	    for (int i = 0; i < candidatos.size(); i++) {

	        if (candidatos.get(i).getNum() == num) {
	            candidatos.remove(i);
	            return;
	        }
	    }
	}


	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	
	
	
	
}

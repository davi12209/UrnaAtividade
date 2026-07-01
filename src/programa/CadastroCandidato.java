package programa;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroCandidato {
	
	public ArrayList<Candidato> candidatos = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	
	public boolean mesmoNum(int codigo) {
		for (Candidato c : candidatos) {
			if (c.getNum() == codigo) {
				return true;
			}
		}
		return false;
	}
	
	
	public void cadastrarCandidato() throws UrnaException{
		
		System.out.println("Digite o nome do candidato:");
		String nome = scanner.next();
		
		if(nome == null) {
			throw new UrnaException("Nome vazio");
		}
		
		System.out.println("Digite o numero do candidato");
		int num = scanner.nextInt();
		
		if(mesmoNum(num)) {
			throw new UrnaException("Esse numero");
		}
		
		Candidato c = new Candidato(nome, num);
		candidatos.add(c);
		
	}


	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	
	
	
	
}

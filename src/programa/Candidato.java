package programa;

public class Candidato {
	
	private String nome;
	private int num;
	private int votos;
	
	public Candidato(String nome, int num) {
		this.nome = nome;
		this.num = num;
		
	}

	public String getNome() {
		return nome;
	}

	public int getNum() {
		return num;
	}

	public int getVotos() {
		return votos;
	}
	
	public void receberVoto() {
		votos++;
	}
	public void resetarVotos() {
		votos = 0;
	}
}

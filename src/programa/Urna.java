package programa;


public class Urna {

	private int votosBrancos;
	private int votosNulos;
	private CadastroCandidato cad;

	public Urna(CadastroCandidato cad) {
		
		this.cad = cad;
		
	}


	
	public void votar(int num) {
		
		if(num == 0) {
			votosBrancos++;
			return;
		}
		
		for(Candidato c : cad.getCandidatos()) {
            if(c.getNum() == num) {
                c.receberVoto();
                return;
            }
        }
		
		votosNulos++;
	}
	
	public void mostrarResultado() {
		
		Candidato vencedor = null;
		
		for(Candidato c : cad.getCandidatos()) {
           
			System.out.println(c.getNome() + "-" + c.getVotos());
			
			if(vencedor == null || vencedor.getVotos() < c.getVotos()) {
				vencedor = c;
			}
						
        }
		
		System.out.println("Votos em Branco: " + votosBrancos);
		System.out.println("Votos Nulos: " + votosNulos);
		
		System.out.println("----------------------------");
		
		System.out.println("Vencedor:" + vencedor.getNome() + "-" + vencedor.getVotos());
		
	}
	
	public void novaVotaco() {
		
		votosBrancos = 0;
		votosNulos = 0;
		
		for(Candidato c: cad.getCandidatos()) {
			c.resetarVotos();
		}
		
	}
	
	
	
	
	public int getVotosBrancos() {
		return votosBrancos;
	}

	public int getVotosNulos() {
		return votosNulos;
	}
	
}

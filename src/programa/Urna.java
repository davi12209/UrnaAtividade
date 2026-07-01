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
		}
		
		for(Candidato c : cad.getCandidatos()) {
            if(c.getNum() == num) {
                c.receberVoto();
                return;
            }
        }
		
	}
	
	
	public int getVotosBrancos() {
		return votosBrancos;
	}

	public int getVotosNulos() {
		return votosNulos;
	}
	
}

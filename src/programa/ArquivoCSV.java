package programa;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoCSV {

    public void salvar(Urna urna){

        try {
            FileWriter writer =
                new FileWriter("resultado.csv");

            writer.write("Nome;Votos\n");

            for(Candidato c : urna.getCandidatos()) {
                writer.write(
                    c.getNome() + ";" +
                    c.getVotos() + "\n"
                );
            }

            writer.write(
                "Brancos;" +
                urna.getVotosBrancos() + "\n"
            );

            writer.write(
                "Nulos;" +
                urna.getVotosNulos() + "\n"
            );

            writer.close();

            System.out.println(
                "Arquivo CSV salvo com sucesso!"
            );

        } catch(IOException e) {
            System.out.println(
                "Erro ao salvar arquivo."
            );
        }
    }
}

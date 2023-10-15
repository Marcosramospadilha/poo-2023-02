import java.util.ArrayList;

public class Discoteca {
    private ArrayList<Musica> musicas;

    public Discoteca() {
        musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void mostrarMusicas() {
        System.out.println("Músicas na Discoteca:");
        for (Musica musica : musicas) {
            System.out.println(musica);
        }
    }
}

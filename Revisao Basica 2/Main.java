public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Shape of You", "Ed Sheeran");
        Musica musica2 = new Musica("Billie Jean", "Michael Jackson");

        Discoteca discoteca = new Discoteca();
        discoteca.adicionarMusica(musica1);
        discoteca.adicionarMusica(musica2);

        discoteca.mostrarMusicas();
    }
}

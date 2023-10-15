class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    // Construtor
    public Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    // Métodos set/get para titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    // Métodos set/get para autor
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    // Métodos set/get para ano
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    // Métodos set/get para editora
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }

    // Método toString para exibir o estado da instância
    @Override
    public String toString() {
        return titulo + "\n" + autor + "\n" + editora + ", " + ano;
    }
}

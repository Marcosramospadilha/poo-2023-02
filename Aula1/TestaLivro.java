public class TestaLivro {
    public static void main(String[] args) {
        // Criando instâncias dos livros mais vendidos pela Amazon
        Livro livro1 = new Livro("The Da Vinci Code", "Dan Brown", 2003, "Doubleday");
        Livro livro2 = new Livro("teste ", "Author2", 2000, "Editora2");
        Livro livro3 = new Livro("Title3", "Author3", 2010, "Editora3");

        // Exibindo o estado de cada instância
        System.out.println("Livro 1:");
        System.out.println(livro1);
        System.out.println("\nLivro 2:");
        System.out.println(livro2);
        System.out.println("\nLivro 3:");
        System.out.println(livro3);
    }
}

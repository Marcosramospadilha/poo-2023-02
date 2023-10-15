public class TestaLivro {
    public static void main(String[] args) {
        // Criando instâncias dos livros mais vendidos pela Amazon
        Livro livro1 = new Livro("Hello Beautifil", "Ann Napolitano", 2023, "Oprah's Book Club");
        Livro livro2 = new Livro("The Covenant of Water", "Abraham Verghese", 2023, "Grove Press");
        Livro livro3 = new Livro("Happy Place", "Emily Henry", 2023, "Berkley");

        // Exibindo o estado de cada instância
        System.out.println("Livro 1:");
        System.out.println(livro1);
        System.out.println("\nLivro 2:");
        System.out.println(livro2);
        System.out.println("\nLivro 3:");
        System.out.println(livro3);
    }
}

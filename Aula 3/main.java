





public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A, 123", "123-456-789", "123.456.789-01", 'M', 1);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "987-654-321", "12.345.678/0001-99", "XYZ Ltda.");

        System.out.println("Informações da Pessoa Física:");
        pessoaFisica.exibirInformacoes();

        System.out.println("\nInformações da Pessoa Jurídica:");
        pessoaJuridica.exibirInformacoes();
    }
}
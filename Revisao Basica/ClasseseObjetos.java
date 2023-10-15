class Carro {
    String marca;
    String modelo;
    
    void ligar() {
        System.out.println("O carro está ligado.");
    }
    
    void desligar() {
        System.out.println("O carro está desligado.");
    }
}

public class ClasseseObjetos {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        
        System.out.println("Carro: " + meuCarro.marca + " " + meuCarro.modelo);
        meuCarro.ligar();
        meuCarro.desligar();
    }
}

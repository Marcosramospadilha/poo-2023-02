// Classe abstrata FormaGeometrica
abstract class FormaGeometrica {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}

// Subclasse Circulo
class Circulo extends FormaGeometrica {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Subclasse Retangulo
class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

// Subclasse Triangulo
class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do triângulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// Classe CalculadoraArea
class CalculadoraArea {
    // Método estático para calcular a área total das formas geométricas no array
    public static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0;
        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        // Criando objetos das formas geométricas
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 7);

        // Colocando as formas em um array
        FormaGeometrica[] formas = {circulo, retangulo, triangulo};

        // Calculando a área total usando a CalculadoraArea
        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);

        System.out.println("Área total das formas geométricas: " + areaTotal);
    }
}

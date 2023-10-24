// Classe abstrata FormaGeometrica
abstract class FormaGeometrica {
    // Método abstrato para calcular a área
    abstract double calcularArea();
}

// Subclasse Circulo
class Circulo extends FormaGeometrica {
    private double raio;

    // construtor circulo
    Circulo(double raio) {
        this.raio = raio;
    }

    // chama a classe 
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Subclasse Retangulo
class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    // Construtor
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método calcularArea para o retângulo
    @Override
    double calcularArea() {
        return largura * altura;
    }
}

// Subclasse Triangulo
class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    // Construtor
    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementação do método calcularArea para o triângulo
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

// Classe CalculadoraArea
class CalculadoraArea {
    // Método estático para calcular a área total
    static double calcularAreaTotal(FormaGeometrica[] formas) {
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
        // Criando instâncias das formas geométricas
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(4, 6);
        FormaGeometrica triangulo = new Triangulo(3, 7);

        // Criando um array de formas geométricas
        FormaGeometrica[] formas = {circulo, retangulo, triangulo};

        // Calculando a área total
        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);

        // Exibindo o resultado
        System.out.println("Área total das formas geométricas: " + areaTotal);
    }
}

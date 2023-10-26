class FormaGeometrica {
    double calcularArea() {
        return 0;
    }
}

class Circulo extends FormaGeometrica {
    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

class CalculadoraArea {
    static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0;
        for (int i = 0; i < formas.length; i++) {
            areaTotal += formas[i].calcularArea();
        }
        return areaTotal;
    }
}

public class Area {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(10);
        FormaGeometrica retangulo = new Retangulo(10, 10);
        FormaGeometrica triangulo = new Triangulo(10, 10);

        FormaGeometrica[] formas = {circulo, retangulo, triangulo};

        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);

        System.out.println("Área total: " + areaTotal);
    }
}

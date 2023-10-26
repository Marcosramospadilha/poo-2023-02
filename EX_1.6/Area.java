


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

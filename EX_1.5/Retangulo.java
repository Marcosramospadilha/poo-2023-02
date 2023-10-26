
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
public class Calc {
    int n1;
    int n2;

    public double somar() {
        return n1 + n2;
    }

    public double diminuir() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() throws ArithmeticException, NumeroNegativo {
        if (n2 == 0) {
            throw new ArithmeticException("Erro: divisão por zero");
        }
        if (n1 < 0 || n2 < 0) {
            throw new NumeroNegativo("Erro: entrada de número negativo");
        }
        return n1 / n2;
    }
}

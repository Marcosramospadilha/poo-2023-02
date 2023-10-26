public abstract class CalculadoraArea {
    static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0;
        for (int i = 0; i < formas.length; i++) {
            areaTotal += formas[i].calcularArea();
        }
        return areaTotal;
    }
}
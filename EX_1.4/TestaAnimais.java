public class TestaAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Cachorro();
        animais[2] = new Boi();

        for (int i = 0; i < animais.length; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animais[i].som());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add (new
        Perro("Firulais", 3, "Criollo"));
        animales.add (new
                Gato("Ares", 2, true));
        animales.add(new
                Vaca("Lola", 12));

        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
            System.out.println ();
        }
    }
}

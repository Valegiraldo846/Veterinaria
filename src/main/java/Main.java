// Nombre completo: Valeria Becerra Giraldo - Ficha: 3292136

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

/*
 EXPLICACIÓN DE LOS PILARES
 1. ENCAPSULAMIENTO: lo aplique dentro de la
 clase animal en la cual se usan los atributos
 privados de NOMBRE y EDAD.

 2. HERENCIA: Lo aplique cuando cree las clases
 Perro y Gato en la cual se usa extends Animal, de
 esta manera las clases hijas reciben las características
 de la clase Animal y evita repetir los atributos de nombre y edad.
 Y en cada clase hija se agrega lo que necesita en este caso es:
 Perro -> raza
 Gato -> inferior

 3. POLIMORFISMO: este lo aplique en el main en donde
 se uso una sola lista List<Animal> animales
 En esta lista se puede guardar los objetos que son:
 Perro, Gato, Vaca.
 Despues de esto hago un for y aunque todos estan siendo
 tratados como animal, cada objeto ejecuta su propia version
 de los metodos mostrarInfo() y hacerSonido().

 4. ABSTRACCIÓN: la clase Animal es abstracta, por esto no
 se puede hacer new Animal() ademas en la clase tambien tiene
 metodos abstractos.
 */

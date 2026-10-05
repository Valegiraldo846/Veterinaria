public class Vaca extends Animal {

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + "  Dice: Muuu!! ");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n nombre: " + getNombre() +
             " \n edad: " + getEdad() );
    }
}

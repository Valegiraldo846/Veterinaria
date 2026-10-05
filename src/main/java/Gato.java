public class Gato extends Animal {
    private boolean inferiror;

    public Gato(String nombre, int edad, boolean inferiror) {
        super(nombre, edad);
        this.inferiror = inferiror;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " \n Dice: Miauu!!");
    }

    @Override
    public void mostrarInfo() {
        String respuesta = inferiror ? "Si" : "No";
        System.out.println(" Nombre: \n" + getNombre() + " ,\n Edad: " + getEdad() +
                ", \n Inferiror: " + respuesta);

    }
}

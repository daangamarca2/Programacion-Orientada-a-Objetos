// HERENCIA: Perro hereda de Animal
public class Perro extends Animal {

    // POLIMORFISMO: sobrescribe el método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}
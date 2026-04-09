public class Main {
    public static void main(String[] args) {

        // 🔒 ENCAPSULAMIENTO
        Mascota mascota = new Mascota("Firulais", 3);
        mascota.mostrarInfo();

        // Intentar modificar datos de forma segura
        mascota.setEdad(5);
        mascota.mostrarInfo();

        System.out.println("----------------------");

        // 🧬 HERENCIA + 🎭 POLIMORFISMO
        Animal miPerro = new Perro(); // objeto tipo Animal
        Animal miGato = new Gato();

        // Cada uno ejecuta su propia versión del método
        miPerro.hacerSonido();
        miGato.hacerSonido();

        System.out.println("----------------------");

        // 🧠 ABSTRACCIÓN
        miPerro.dormir();
        miGato.dormir();
    }
}
// Clase abstracta (ABSTRACCIÓN)
// Representa un concepto general de Animal
public abstract class Animal {

    // Método abstracto (no tiene implementación)
    // Cada animal lo implementará a su manera
    public abstract void hacerSonido();

    // Método normal
    public void dormir() {
        System.out.println("El animal está durmiendo...");
    }
}
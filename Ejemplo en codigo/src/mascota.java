// ENCAPSULAMIENTO
// Los atributos son privados y se accede mediante métodos públicos
public class Mascota {

    private String nombre;
    private int edad;

    // Constructor
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter (obtener nombre)
    public String getNombre() {
        return nombre;
    }

    // Setter (modificar nombre)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter edad
    public int getEdad() {
        return edad;
    }

    // Setter edad
    public void setEdad(int edad) {
        if (edad > 0) { // validación
            this.edad = edad;
        }
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + ", Edad: " + edad);
    }
}
package vehiculos;

public class Coche extends Vehiculo {
    private int numeroDePuertas;
    // Constructor
    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Getter para numeroDePuertas
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    // Setter para numeroDePuertas
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase para mostrar marca, modelo y año
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}

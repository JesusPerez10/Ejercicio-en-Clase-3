package vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    // Getter para tieneSidecar
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    // Setter para tieneSidecar
    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribir el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la superclase para mostrar marca, modelo y año
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

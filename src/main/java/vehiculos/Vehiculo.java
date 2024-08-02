package vehiculos;

public class Vehiculo {

        private String marca;
        private String modelo;
        private int año;
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para año
    public int getAño() {
        return año;
    }

    // Setter para año
    public void setAño(int año) {
        this.año = año;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}

package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Mustang", 2021);

        // Mostrar detalles de cada vehículo
        vehiculo1.mostrarDetalles();
        vehiculo2.mostrarDetalles();


        Coche coche1 = new Coche("Honda", "Civic", 2019, 4);

        // Mostrar detalles del coche
        coche1.mostrarDetalles();

        // Crear instancia de Moto
        Moto moto1 = new Moto("Harley-Davidson", "Sportster", 2018, true);

        // Mostrar detalles de la moto
        moto1.mostrarDetalles();
    }
    }


// Clase encargada de imprimir vehículos
public class VehiculoPrinter {

    public void imprimir(Vehiculo vehiculo) {
        System.out.println("----- Vehículo -----");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");

        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("Tiene acoplado: " + (camion.tieneAcoplado() ? "Sí" : "No"));
        } else if (vehiculo instanceof Auto) {
            Auto auto = (Auto) vehiculo;
            System.out.println("Cantidad de pasajeros: " + auto.getCantidadPasajeros());
        }

        System.out.println("--------------------\n");
    }
}

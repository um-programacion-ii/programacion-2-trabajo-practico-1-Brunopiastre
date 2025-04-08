public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.println("=== Información del Vehículo ===");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de Carga: " + vehiculo.getCapacidadCargaKg() + " kg");
        System.out.println();
    }
}

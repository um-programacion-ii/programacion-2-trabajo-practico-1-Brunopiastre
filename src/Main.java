public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo auto = new Vehiculo("ABC123", "Toyota", 2015, 500);
        Camion camion = new Camion("XYZ456", "Volvo", 2018, 15000, true);

        // Crear el objeto para imprimir
        VehiculoPrinter printer = new VehiculoPrinter();

        // Imprimir información de los vehículos
        System.out.println("Información del Auto:");
        printer.imprimir(auto);  // Imprime información de un auto
        System.out.println();  // Espacio entre las impresiones
        System.out.println("Información del Camión:");
        printer.imprimir(camion);  // Imprime información de un camión
    }
}

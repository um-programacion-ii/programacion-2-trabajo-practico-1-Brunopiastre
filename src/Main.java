public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2010, 1500);
        Vehiculo v2 = new Vehiculo("XYZ789", "Chevrolet", 2015, 1200);
        Vehiculo v3 = new Vehiculo("LMN456", "Toyota", 2020, 1800);

        VehiculoPrinter printer = new VehiculoPrinter();

        printer.imprimir(v1);
        printer.imprimir(v2);
        printer.imprimir(v3);
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("ABC123", "Toyota", 2020, 500));
        vehiculos.add(new Camion("DEF456", "Volvo", 2018, 8000, true));
        vehiculos.add(new Auto("GHI789", "Ford", 2022, 300, 5));

        VehiculoPrinter printer = new VehiculoPrinter();
        for (Vehiculo v : vehiculos) {
            printer.imprimir(v);
        }

        // Buscar por patente (opcional)
        String patenteBuscada = "DEF456";
        Vehiculo encontrado = buscarPorPatente(vehiculos, patenteBuscada);
        if (encontrado != null) {
            System.out.println("🚗 Vehículo encontrado:");
            printer.imprimir(encontrado);
        } else {
            System.out.println("No se encontró ningún vehículo con la patente " + patenteBuscada);
        }
    }

    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> lista, String patente) {
        for (Vehiculo v : lista) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }
        return null;
    }
}

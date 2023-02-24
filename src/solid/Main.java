package solid;

public class Main {

    public static void main(String[] args) {
        Viaje[] viajes = {new ViajeInternacional(),
                new ViajeMunicipal(),
                new ViajeDepartamental()
        };
        imprimirPrecio(viajes);
    }

    private static void imprimirPrecio(Viaje[] viajes) {
        // OPEN / CLOSED = ABIERTO A EXTENSION, CERRADO A MODIFICACION
        // Liskov  = Clase padre, puede ser reemplaza por la clase hija sin problema (todo bien sin hacer )
        // IsInstanceOfType
        for (Viaje viaje : viajes) {
            System.out.println(viaje.mostrarPrecioConImpuestos());
        }
    }
}

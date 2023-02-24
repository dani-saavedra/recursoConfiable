package solid;

public class ViajeInternacional extends Viaje implements Estado {

    @Override
    int obtenerPrecio() {
        return 500;
    }

    public int obtenerImpuestos() {
        return 19;
    }

    @Override
    public void enviarUbicacion() {
        System.out.println("enviando ubicacion Internacional");
    }

    @Override
    public void cambiarEstadoViaje() {

    }
}

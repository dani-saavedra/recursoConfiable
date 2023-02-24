package solid;

public class ViajeDepartamental extends Viaje implements Estado {

    @Override
    int obtenerPrecio() {
        return 300;
    }

    public int obtenerImpuestos() {
        return 15;
    }

    @Override
    public void enviarUbicacion() {
        System.out.println("enviando ubicacion departamental");
    }

    @Override
    public void cambiarEstadoViaje() {

    }
}

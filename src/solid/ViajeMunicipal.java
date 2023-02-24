package solid;

public class ViajeMunicipal extends Viaje {

    @Override
    int obtenerPrecio() {
        return 100;
    }

    @Override
    public int obtenerImpuestos() {
        return 10;
    }

    @Override
    public void enviarUbicacion() {
        System.out.println("enviando ubicacion municipal");
    }

}

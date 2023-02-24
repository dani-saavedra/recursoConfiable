package solid;

public abstract class Viaje implements Ubicacion {
    public int numero;

    abstract int obtenerPrecio();

    abstract int obtenerImpuestos();

    public String mostrarPrecioConImpuestos() {
        return obtenerPrecio() + "-" + obtenerImpuestos();
    }
}

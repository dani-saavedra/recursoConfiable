package chain;

public class Moneda {

    private final int diametro;
    private final String palabraImpresa;

    public Moneda(int diametro, String palabraImpresa) {
        this.diametro = diametro;
        this.palabraImpresa = palabraImpresa;
    }

    public int getDiametro() {
        return diametro;
    }

    public String getPalabraImpresa() {
        return palabraImpresa;
    }
}

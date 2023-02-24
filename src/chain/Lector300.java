package chain;

public class Lector300 implements LectorMoneda {
    @Override
    public boolean acepta(Moneda moneda) {
        return "trecientos".equals(moneda.getPalabraImpresa())
                && (10 == moneda.getDiametro() || 20 == moneda.getDiametro());
    }

    @Override
    public Integer valor(Moneda moneda) {
        return 300;
    }
}

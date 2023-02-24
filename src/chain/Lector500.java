package chain;

public class Lector500 implements LectorMoneda {
    @Override
    public boolean acepta(Moneda moneda) {
        return "quini".equals(moneda.getPalabraImpresa());
    }

    @Override
    public Integer valor(Moneda moneda) {
        return 500;
    }
}

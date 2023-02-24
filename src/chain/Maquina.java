package chain;

import java.util.Arrays;
import java.util.List;

public class Maquina {
    private List<LectorMoneda> lectores;

    //inyeccion
    public Maquina(LectorMoneda... lectores) {
        this.lectores = Arrays.asList(lectores);
    }

    public int reconocerMoneda(Moneda moneda) {
        for (LectorMoneda lector : lectores) {
            if (lector.acepta(moneda)) {
                //vaya y haga algo con ese manejador.
                return lector.valor(moneda);
            }
        }
        throw new IllegalArgumentException("Moneda invalidad");
    }
}

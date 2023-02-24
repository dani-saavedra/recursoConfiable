package ejemploClases;

import java.util.List;

public class Persona {
    private Corazon corazon;

    private List<Ropa> ropaList;

    public Persona() {
        this.corazon = new Corazon();
        int valor = 2;
        algo(valor,corazon);
        System.out.println(valor);

    } //Agregacion || Composicion

    public void addRopa(Ropa ropa) {
        ropaList.add(ropa);
    }

    public void algo(int numero, Corazon corazon) {
        corazon.valor = 10;
        numero = numero - 1;
        Trabajo recursoConfiable = new Trabajo();
        //Arreglo el test
        recursoConfiable.trabajarMasDuro();
    }
}

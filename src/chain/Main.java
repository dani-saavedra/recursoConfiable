package chain;

public class Main {

    public static void main(String[] args) {

        Moneda moneda = new Moneda(20, "milqui");

        Maquina maquina = new Maquina(new Lector300(), new Lector500());
        System.out.println(maquina.reconocerMoneda(moneda));

    }
/*
    private static void reconocerMoneda(Moneda moneda) {

        //constante contra la variable.
        if ("100".equals(numero) && diametro == 10) {
            System.out.println("La moneda insertada fue de 100");
        } else if ("200".equals(numero)) {
            System.out.println("La moneda insertada fue de 200");
        } else if ("10000".equals(numero)) {
            System.out.println("La moneda insertada fue de 10000");
        }
        //etc
    }
 */
}

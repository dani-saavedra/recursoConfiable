package state;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoBasico = new Pedido(false);
        pedidoBasico.siguienteEtapa();
        System.out.println("----------------------------------------------------------------");
        Pedido pedidoPro = new Pedido(true);
        pedidoPro.siguienteEtapa();
    }
}

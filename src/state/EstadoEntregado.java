package state;

public class EstadoEntregado implements EstadoPedido {

    @Override
    public void avanzar(Pedido pedido) {

    }

    @Override
    public void devolver(Pedido pedido) {

    }

    @Override
    public void imprimirEstadoActual() {
        System.out.println("Estado Entregado");
    }
}

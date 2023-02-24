package state;

public class EstadoPreparacion implements EstadoPedido {

    @Override
    public void avanzar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregado());

    }

    @Override
    public void devolver(Pedido pedido) {
        pedido.setEstado(new EstadoRadicado());
    }

    @Override
    public void imprimirEstadoActual() {
        System.out.println("Estado Preparacion");
    }
}

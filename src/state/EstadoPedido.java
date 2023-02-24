package state;

public interface EstadoPedido {

    void avanzar(Pedido pedido);

    void devolver(Pedido pedido);

    void imprimirEstadoActual();
}

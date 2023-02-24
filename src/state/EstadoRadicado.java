package state;

public class EstadoRadicado implements EstadoPedido {

    @Override
    public void avanzar(Pedido pedido) {
        //Informa al local
        //Verifica disponibilidad del producto en el local
        //hace bla bla bla
        if (pedido.isPremiun()) {
            pedido.setEstado(new EstadoEntregado());
        } else {
            pedido.setEstado(new EstadoPreparacion());
        }
    }

    @Override
    public void devolver(Pedido pedido) {

    }

    @Override
    public void imprimirEstadoActual() {
        System.out.println("Estado Radicado");
    }
}

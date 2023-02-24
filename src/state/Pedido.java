package state;

public class Pedido {

    private EstadoPedido estado = new EstadoRadicado();
    private boolean premiun;

    public Pedido(boolean premiun) {
        this.premiun = premiun;
    }

    public void siguienteEtapa() {
        estado.imprimirEstadoActual();
        estado.avanzar(this);
        estado.imprimirEstadoActual();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    /*
    private String estado = "Radicado";

    public void avanzar() {
        if ("Radicado".equals(estado)) {
            //bla bla bla de recibir el pedido
            estado = "En Preparacion";
        } else if ("Entrega".equals(estado)) {
            estado = "Entregado";
        }else if ("Entrega".equals(estado)) {
            estado = "Entregado";
        }
    }

    public void devolver() {
        if ("Radicado".equals(estado)) {
            //bla bla bla de recibir el pedido
            estado = "En Preparacion";
        } else if ("En Preparacion".equals(estado)) {
            estado = "Entrega";
        } else if ("Entrega".equals(estado)) {
            estado = "Entregado";
        }
    }
     */
    public boolean isPremiun() {
        return premiun;
    }

}

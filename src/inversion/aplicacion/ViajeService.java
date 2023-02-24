package inversion.aplicacion;

import inversion.aplicacion.puerto.ViajeRepositorio;
import solid.Viaje;

public class ViajeService {
    // S = Principio de responsabilidad Unica (side effects), tener mas de una responsabilidad
    // O = OPEN / CLOSED
    // L = LISKOV
    // I = Segracion de intefaces
    // D = INVERSION DE DEPENDENCIA

    // PROPOSITO DE LA ARQUITECTURA  Y OBJETIVO

    //PATRON INYECCION DE DEPENDENCIA
    private ViajeRepositorio repositorio;//DIP:

    //INYECTAR DEPENDENCIAS: Quita la responsabilidad de instanciar, pero no reduce el acoplamiento
    public ViajeService(ViajeRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Viaje guardarViaje(Viaje viaje) {
        viaje.numero = 10;
        //ViajeRepositorio repositorio = new ViajeRepositorio(); -> de instanciar
        repositorio.guardar();
        return viaje;
    }
}

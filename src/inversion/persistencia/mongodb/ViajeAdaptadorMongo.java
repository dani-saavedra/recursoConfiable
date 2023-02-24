package inversion.persistencia.mongodb;

import inversion.aplicacion.puerto.ViajeRepositorio;

public class ViajeAdaptadorMongo implements ViajeRepositorio {

    public void guardar() {
        System.out.println("Guarde en Mongo");
    }

    @Override
    public void actualizarViaje() {

    }

}

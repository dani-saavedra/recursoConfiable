package inversion.persistencia.sqlserver;

import inversion.aplicacion.puerto.ViajeRepositorio;

public class ViajeAdaptadorSQLServer implements ViajeRepositorio {

    public void guardar() {
        System.out.println("Guarde en SQL SERVER");
    }

    @Override
    public void actualizarViaje() {

    }

}

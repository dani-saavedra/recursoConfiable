import inversion.aplicacion.ViajeService;
import inversion.persistencia.mongodb.ViajeAdaptadorMongo;
import inversion.persistencia.sqlserver.ViajeAdaptadorSQLServer;
import solid.ViajeDepartamental;
import solid.ViajeMunicipal;

public class Main {

    public static void main(String[] args) {
        ViajeService service = new ViajeService(new ViajeAdaptadorMongo());
        service.guardarViaje(new ViajeDepartamental());


        ViajeService service2 = new ViajeService(new ViajeAdaptadorSQLServer());
        service2.guardarViaje(new ViajeMunicipal());
    }
}

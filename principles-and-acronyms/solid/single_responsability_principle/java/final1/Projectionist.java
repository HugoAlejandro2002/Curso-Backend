package final1;

public class Projectionist implements MovieProjector {
    @Override
    public void startProjection() {
        System.out.println("Proyeccionista: La proyección de la película ha comenzado.");
    }

    @Override
    public void stopProjection() {
        System.out.println("Proyeccionista: La proyección de la película ha finalizado.");
    }

    @Override
    public void checkProjectorStatus() {
        System.out.println("Proyeccionista: Revisando el estado del proyector...");
        System.out.println("Proyeccionista: El proyector está funcionando correctamente.");
    }
}
package final1;

public class ConcessionClerk implements ConcessionStandWorker {
    @Override
    public void serveSnack() {
        System.out.println("Snackero: Snack servido al cliente.");
    }

    @Override
    public void restockItems() {
        System.out.println("Snackero: Reabasteciendo items del cine...");
        System.out.println("Snackero: Items reabastecidos correctamente.");
    }

    @Override
    public void processPayment() {
        System.out.println("Snackero: Procesando el pago del cliente...");
        System.out.println("Snackero: Pago procesado exitosamente.");
    }
}

package final1;

public class Client {

    public static void main(String[] args) {
        // Simulación con el proyeccionista
        MovieProjector projectionist = new Projectionist();
        System.out.println("Proyeccionista:");
        projectionist.checkProjectorStatus();
        projectionist.startProjection();
        // Suponiendo que la película dura 2 horas
        projectionist.stopProjection();

        System.out.println("\nOperador de Taquilla:");
        // Simulación con el operador de taquilla
        TicketSeller ticketBoothOperator = new TicketBoothOperator();
        ticketBoothOperator.checkTicketAvailability();
        ticketBoothOperator.sellTicket();
        // El cliente desea un reembolso
        ticketBoothOperator.refundTicket();

        System.out.println("\nEmpleado de Concesión:");
        // Simulación con el empleado de la concesión
        ConcessionStandWorker concessionClerk = new ConcessionClerk();
        concessionClerk.serveSnack();
        // Se necesitan más snacks
        concessionClerk.restockItems();
        concessionClerk.processPayment();
    }
}

package final1;

public class Client {

    public static void main(String[] args) {
        MovieProjector projectionist = new Projectionist();
        projectionist.checkProjectorStatus();
        projectionist.startProjection();
        projectionist.stopProjection();

        TicketSeller ticketBoothOperator = new TicketBoothOperator();
        ticketBoothOperator.checkTicketAvailability();
        ticketBoothOperator.sellTicket();
        ticketBoothOperator.refundTicket();

        ConcessionStandWorker concessionClerk = new ConcessionClerk();
        concessionClerk.serveSnack();
        concessionClerk.restockItems();
        concessionClerk.processPayment();
    }
}

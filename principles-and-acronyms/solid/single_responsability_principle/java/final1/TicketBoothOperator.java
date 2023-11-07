package final1;

public class TicketBoothOperator implements TicketSeller {
    @Override
    public void sellTicket() {
        System.out.println("Vendedor: Boleto vendido con éxito.");
    }

    @Override
    public void refundTicket() {
        System.out.println("Vendedor: Boleto reembolsado con éxito.");
    }

    @Override
    public void checkTicketAvailability() {
        System.out.println("Vendedor: Verificando la disponibilidad de boletos...");
        System.out.println("Vendedor: Hay boletos disponibles.");
    }
}
package final1;

public class Client {

    public static void main(String[] args) {
        Teleferico lineaRoja = new LineaRoja();
        Teleferico lineaAzul = new LineaAzul();

        // Simulación de la línea Roja
        lineaRoja.iniciarRecorrido();
        lineaRoja.detenerEnEstacion();
        lineaRoja.finalizarRecorrido();

        // Simulación de la línea Azul
        lineaAzul.iniciarRecorrido();
        lineaAzul.detenerEnEstacion();
        lineaAzul.finalizarRecorrido();


        Teleferico lineaDorada = new LineaDorada();

        // Simulación de la línea Dorada sin modificar las clases existentes
        lineaDorada.iniciarRecorrido();
        lineaDorada.detenerEnEstacion();
        lineaDorada.finalizarRecorrido();
    }
}

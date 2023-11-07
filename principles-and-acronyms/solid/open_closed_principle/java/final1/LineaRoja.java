package final1;

class LineaRoja extends Teleferico {
    @Override
    public void iniciarRecorrido() {
        System.out.println("Línea Roja iniciando recorrido.");
    }

    @Override
    public void detenerEnEstacion() {
        System.out.println("Línea Roja deteniéndose en la estación.");
    }

    @Override
    public void finalizarRecorrido() {
        System.out.println("Línea Roja finalizando recorrido.");
    }
}
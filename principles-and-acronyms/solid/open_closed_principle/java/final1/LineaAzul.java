package final1;

class LineaAzul extends Teleferico {
    @Override
    public void iniciarRecorrido() {
        System.out.println("Línea Azul iniciando recorrido.");
    }

    @Override
    public void detenerEnEstacion() {
        System.out.println("Línea Azul deteniéndose en la estación.");
    }

    @Override
    public void finalizarRecorrido() {
        System.out.println("Línea Azul finalizando recorrido.");
    }
}
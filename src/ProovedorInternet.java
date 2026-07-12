public abstract class ProovedorInternet {

    protected abstract PlanDatos crearPlanDatos(String tipo);

    public void calcularConsumo(String tipo, int numeroMegasConsumido) {
        PlanDatos plan = crearPlanDatos(tipo);

        if (plan != null) {
            float pago = plan.calculoPago(numeroMegasConsumido);
            System.out.println(plan.toString() + " Pago: " + pago + " por " + numeroMegasConsumido + " megas");
        } else {
            System.out.println("Plan no válido.");
        }
    }
}

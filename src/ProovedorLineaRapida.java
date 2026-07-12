public class ProovedorLineaRapida extends ProovedorInternet {

    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;

        if (tipo.equalsIgnoreCase("Personal")) {
            plan = new PlanPersonal();
            plan.nombre = "Personal";
            plan.setTasa(0.5f);
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            plan = new PlanNegocio();
            plan.nombre = "Negocio";
            plan.setTasa(1.5f);
        } else if (tipo.equalsIgnoreCase("Academico")) {
            plan = new PlanAcademico();
            plan.nombre = "Academico";
            plan.setTasa(1.0f);
        }
        return plan;
    }
}

public class ProovedorMovistar extends ProovedorInternet {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;

        // Tasas para Movistar: Personal 0.8, Negocio 1.6, Académico 1.25[cite: 1]
        if (tipo.equalsIgnoreCase("Personal")) {
            plan = new PlanPersonal();
            plan.nombre = "Personal";
            plan.setTasa(0.8f);
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            plan = new PlanNegocio();
            plan.nombre = "Negocio";
            plan.setTasa(1.6f);
        } else if (tipo.equalsIgnoreCase("Academico")) {
            plan = new PlanAcademico();
            plan.nombre = "Academico";
            plan.setTasa(1.25f);
        }
        return plan;
    }

}

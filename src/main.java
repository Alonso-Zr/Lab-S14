public class main {

    public static void main(String[] args) {

        System.out.println("LINEA RAPIDA");
        ProovedorInternet LR = new ProovedorLineaRapida();
        LR.calcularConsumo("Personal", 1000);
        LR.calcularConsumo("Negocio", 1000);
        LR.calcularConsumo("Academico", 1000);
        System.out.println();

        System.out.println("CLARO");
        ProovedorInternet Claro = new ProovedorClaro();
        Claro.calcularConsumo("Personal", 1000);
        Claro.calcularConsumo("Negocio", 1000);
        Claro.calcularConsumo("Academico", 1000);
        System.out.println();

        System.out.println("MOVISTAR");
        ProovedorInternet Movistar = new ProovedorMovistar();
        Movistar.calcularConsumo("Personal", 1000);
        Movistar.calcularConsumo("Negocio", 1000);
        Movistar.calcularConsumo("Academico", 1000);
    }

}

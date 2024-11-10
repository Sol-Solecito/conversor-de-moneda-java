import java.util.Map;

public class ContinentesDisponibles extends Mensajes {
    public void consultaContinente(){
        var eleccionContinente = 0;
        while (eleccionContinente != 9) {
            System.out.println(mensajeContinente);;
            eleccionContinente = scanner.nextInt();

            switch (eleccionContinente) {
                case 1:
                    consulta.consultaSudamerica();
                    break;
                case 2:
                    consulta.consultaCentroAmerica();
                    break;
                case 3:
                    consulta.consultaNorteAmerica();
                    break;
                case 4:
                    System.out.println(mensajeEuropa);
                    Moneda monedaC = (Moneda) apiConversor.datosApi();
                    Map<String, Double> conversionRates = monedaC.conversion_rates();

                    String moneda = "EUR";
                    if (moneda != null) {
                        double valor = scanner.nextDouble();
                        Calculos.convertirYMostrarResultado(valor, moneda, conversionRates);
                    } else {
                        System.out.println(opcionNoDisponible);
                    }
                    break;
                case 9:
                    System.out.println("""
                            Finalizando el proceso
                            ..........
                            Gracias por su visita
                            ----------------------""");
                    break;
                default:
                    System.out.println(opcionNoDisponible);
            }
        }
    }
}
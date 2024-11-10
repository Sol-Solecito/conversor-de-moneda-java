import java.util.Map;

public class Consulta extends ContinentesDisponibles {
    Moneda monedaConsulta = (Moneda) apiConversor.datosApi();
    String ultimaActualizacion = monedaConsulta.time_last_update_utc();
    String siguienteActualizacion = monedaConsulta.time_next_update_utc();

    public void consultaSudamerica() {

        var eleccionSudamerica = 1;
        System.out.println(mensajeSudamerica);
        eleccionSudamerica = scanner.nextInt();

        while (eleccionSudamerica != 0) {

            if (eleccionSudamerica != 0) {
                Map<String, Double> conversionRates = monedaConsulta.conversion_rates();
                String moneda = TipoDeMoneda.obtenerMonedaSurAmerica(eleccionSudamerica);
                if (moneda != null) {
                    System.out.println("Digita la cantidad de "+ moneda +" que desea convertir a (USD)");
                    String entrada = scanner.next();
                    if (entrada.equalsIgnoreCase("salir")){
                        System.out.println("Saliendo del programa...");
                        break;
                    }

                    try {
                        double valor = Double.parseDouble(entrada);
                        System.out.println("-----------------------------------------------------------------");
                        Calculos.convertirYMostrarResultado(valor, moneda, conversionRates);
                        System.out.println("Ultima actualizacion de la tasa: " + ultimaActualizacion);
                        System.out.println("La siguiente acualizacion sera: " + siguienteActualizacion);
                        System.out.println("-----------------------------------------------------------------");
                    }catch (Exception e) {
                        System.out.println("Error: Por favor, introduce un valor valido");
                    }
                }else {
                    System.out.println(opcionNoDisponible);
                }
            }
        }
        scanner.close();
    }
    public void consultaCentroAmerica() {
        var eleccionCentroAmerica = 1;

        while (eleccionCentroAmerica != 0) {
            System.out.println(mensajeCentroAmerica);
            eleccionCentroAmerica = scanner.nextInt();

            if (eleccionCentroAmerica != 0) {
                Moneda monedaC = (Moneda) apiConversor.datosApi();
                Map<String, Double> conversionRates = monedaC.conversion_rates();

                String moneda = TipoDeMoneda.obtenerMonedaCentroAmerica(eleccionCentroAmerica);
                if (moneda != null) {
                    System.out.println("Digita la cantidad de " + moneda + " que desea convertir a (USD)");
                    double valor = scanner.nextDouble();
                    System.out.println("-----------------------------------------------------------------");
                    Calculos.convertirYMostrarResultado(valor, moneda, conversionRates);
                    System.out.println("Ultima actualizacion de la tasa: " + ultimaActualizacion);
                    System.out.println("La siguiente acualizacion sera: " + siguienteActualizacion);
                    System.out.println("-----------------------------------------------------------------");
                } else {
                    System.out.println(opcionNoDisponible);
                }
            }
        }
        scanner.close();
    }
    public void consultaNorteAmerica() {
        int eleccionNorteAmerica = 1;

        while (eleccionNorteAmerica != 0){
            System.out.println(mensajeNorteAmerica);
            eleccionNorteAmerica = scanner.nextInt();

            switch (eleccionNorteAmerica){
                case 1:
                    consultaCodigoMoneda();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
        }
    }
    public void consultaCodigoMoneda(){

        ApiConversorMoneda apiConversor = new ApiConversorMoneda();
        System.out.println("Cuanto dinero USD quieres convertir?");
        double valorUsuario = scanner.nextDouble();
        Moneda monedaC = (Moneda) apiConversor.datosApi();
        Map<String, Double> conversionRates = monedaC.conversion_rates();

        Calculos.calculosUSD(valorUsuario, conversionRates);
    }
}
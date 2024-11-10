import java.util.Map;
import java.util.Scanner;

public class Calculos {
    static Scanner scanner = new Scanner(System.in);

    static void convertirYMostrarResultado(double valor, String moneda, Map<String, Double> conversionRates) {
        if (conversionRates.containsKey(moneda)) {
            double tasaConversion = conversionRates.get(moneda);
            double valorConvertido = valor / tasaConversion;
            System.out.println( valor +" "+ moneda + " es igual a " + valorConvertido + " USD");
        } else {
            System.out.println("No se pudo encontrar la tasa de conversión para " + moneda);
        }
    }

    static void calculosUSD(double valorUsuario, Map<String, Double> conversionRates) {
        String monedaNorte = "USD";
        System.out.println("""
                                A que tipo de moneda deseas convertir
                                tu dinero:"""+ " " + "USD " + valorUsuario);
        System.out.println(" por ejemplo: COP, MXN, EUR, ARS etc...");
        String monedaUsuario = scanner.nextLine();
        if (conversionRates.containsKey(monedaUsuario)) {
            double tasaConversion = conversionRates.get(monedaUsuario);
            double valorConvertido = valorUsuario * tasaConversion;
            int convertidoEntero = (int) valorConvertido;
            System.out.println( valorUsuario +" "+ monedaNorte + " es igual a " + convertidoEntero + " " + monedaUsuario);
        } else {
            System.out.println("No se pudo encontrar la tasa de conversión para " + monedaUsuario);
        }
    }
}

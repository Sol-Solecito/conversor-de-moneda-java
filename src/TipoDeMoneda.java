public class TipoDeMoneda {
    static String obtenerMonedaSurAmerica(int eleccionSudamerica) {
        return switch (eleccionSudamerica) {
            case 1 -> "ARS";  // Argentina
            case 2 -> "BRL";  // Brasil
            case 3 -> "BOB";  // Bolivia
            case 4 -> "COP";  // Colombia
            case 5 -> "CLP";  // Chile
            case 6 -> "PEN";  // Perú
            case 7 -> "PYG";  // Paraguay
            case 8 -> "UYU";  // Uruguay
            default -> null;
        };
    }

    static String obtenerMonedaCentroAmerica(int eleccionCentroAmerica) {
        return switch (eleccionCentroAmerica) {
            case 1 -> "CRC";  // CostaRica
            case 2 -> "DOP";  // Republica Dominicana
            case 3 -> "GTQ";  // Guatemala
            case 4 -> "HNL";  // Honduras
            case 5 -> "HTG";  // Haiti
            case 6 -> "MXN";  // Mexico
            case 7 -> "NIO";  // Nicaragua
            default -> null;
        };
    }
}
import java.util.Scanner;

public class Mensajes {
    static Consulta consulta = new Consulta();
    ApiConversorMoneda apiConversor = new ApiConversorMoneda();
    String opcionNoDisponible = "---------------------------------------------";


    String mensajeContinente = """
                --------------------------------------------------------------------------------------------
                
                *** HOLA, TE DAMOS LA BIENVENIDA A NUESTRO CONVERSOR DE MONEDAS ***
                
                Por favor seleccione el continente donde está ubicado el país 
                de la moneda que desea convertir a Dolares (USD): 
              
                Si desea convertir dolares a otra moneda selecciona America del Norte/USD) 
                y luego elija la moneda a la que va a convertir escribiendo el indicativo correspondiente.
                
                1. America del Sur
                2. Centro America
                3. America del Norte
                4. EUR (Union Europea)
                9. SALIR
                
                """;
    String mensajeSudamerica = """
                -----------------------------------------------------------------
                Sur America
                
                Por favor ingrese el número correspondiente de la moneda que desea convertir a dolares (USD): 
                1. ARS (Peso Argentino)
                2. BRL (Real Brasileño)
                3. BOB (Peso Boliviano)
                4. COP (Peso Colombiano)
                5. CLP (Peso Chileno)
                6. PEN (Sol Peruano)
                7. PYG (Guarani Paraguayo)
                8. UYU (Peso Uruguayo)
                0. Atras
                
                """;
    String mensajeCentroAmerica = """
                -----------------------------------------------------------------
                Centro America
                
                Por favor ingrese el número correspondiente de la moneda que desea convertir a dolares (USD): 
                1. CRC (Colón Costarricense)
                2. DOP (Peso Dominicano)
                3. GTQ (Quetzal Guatemalteco)
                4. HNL (Lempira Hondureño)
                5. HTG (Gourde Haitiano)
                6. MXN (Peso Mexicano)
                7. NIO (Córdoba nicaragüense)
                8. PAB (Balboa Panameño)
                0. Atras
                """;

    String mensajeNorteAmerica ="""
                -----------------------------------------------------------------
                Norte America
                
                Por favor ingrese el número correspondiente de la moneda que desea convertir: 
                1. USD (Dolar Estadounidense)
                2. CAD (Dolar Canadiense)
                0. Atras
                """;

    String mensajeEuropa = """
                -----------------------------------------------------------------
                Europa
                
                Digita la cantidad de euros que desea convertir a USD
                """;

    Scanner scanner = new Scanner(System.in);


}
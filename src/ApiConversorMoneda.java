import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversorMoneda {
    public Object datosApi() {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/003488a6df138bc2f3742bd9/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("Error, no se encontraron datos.");
        }
        String json = response.body();
        return new Gson().fromJson(response.body(), Moneda.class);
    }
}

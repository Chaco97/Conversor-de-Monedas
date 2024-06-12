import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioConversion {

    public TasaCambio obtenerTasa(String monedaBase, String monedaDestino) {
        // Construir la URL usando String.format para mayor claridad
        String urlString = String.format("https://v6.exchangerate-api.com/v6/40803f00e2546baaa64e3151/pair/%s/%s",
                monedaBase, monedaDestino);
        URI url = URI.create(urlString);

        // Crear una instancia de HttpClient
        HttpClient httpCliente = HttpClient.newHttpClient();

        // Crear una solicitud HTTP
        HttpRequest httpSolicitud = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            // Enviar la solicitud y recibir la respuesta
            HttpResponse<String> httpRespuesta = httpCliente.send(httpSolicitud, HttpResponse.BodyHandlers.ofString());

            // Verificar si la solicitud fue exitosa
            if (httpRespuesta.statusCode() == 200) {
                // Convertir la respuesta JSON en un objeto TasaCambio
                return new Gson().fromJson(httpRespuesta.body(), TasaCambio.class);
            } else {
                // Manejar el caso de respuesta no exitosa
                System.out.println("La solicitud HTTP no fue exitosa: " + httpRespuesta.statusCode());
                return null;
            }
        } catch (IOException | InterruptedException e) {
            // Manejar las excepciones de IO y de interrupción de manera adecuada
            e.printStackTrace();
            return null;
        }
    }
}


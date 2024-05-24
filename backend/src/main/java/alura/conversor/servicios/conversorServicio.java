package alura.conversor.servicios;
import alura.conversor.peticion.conversorPeticion;
import alura.conversor.respuesta.conversorRespuesta;
import org.springframework.web.client.RestTemplate;


public class conversorServicio {

    private RestTemplate restTemplate = new RestTemplate();

    public conversorPeticion getCurrencyRates() {
        String url = "https://api.exchangerate-api.com/v4/latest/USD"; // reemplace con la URL de su API
        return restTemplate.getForObject(url, conversorPeticion.class);
    }
    public conversorRespuesta convertCurrency(String from, String to, double cantidad) {
        conversorPeticion rates = getCurrencyRates();
        double conversionRate = rates.getRates().get(to) / rates.getRates().get(from);
        double convertedAmount = cantidad * conversionRate;
        return new conversorRespuesta(from, to, convertedAmount);
    }
}

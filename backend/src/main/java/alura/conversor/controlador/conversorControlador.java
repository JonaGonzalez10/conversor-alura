package alura.conversor.controlador;
import alura.conversor.peticion.conversorPeticion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import alura.conversor.respuesta.conversorRespuesta;
import alura.conversor.servicios.conversorServicio;
public class conversorControlador {
    private final conversorServicio controlador;

    public conversorControlador(conversorServicio controlador) {
        this.controlador = controlador;
    }

    @GetMapping("/currency")
    public conversorPeticion getCurrencyRates() {
        return controlador.getCurrencyRates();
    }

    @PostMapping("/convert")
    public conversorRespuesta convertCurrency(@RequestBody conversorRespuesta request) {
        return controlador.convertCurrency(request.getFrom(), request.getTo(), request.getCantidad());
    }
}

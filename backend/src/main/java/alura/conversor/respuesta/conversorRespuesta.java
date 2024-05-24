package alura.conversor.respuesta;
import java.util.Map;
public class conversorRespuesta {

    private String from;
    private String to;
    private double cantidad;

    public conversorRespuesta() {
    }

    public conversorRespuesta(String from, String to, double cantidad) {
        this.from = from;
        this.to = to;
        this.cantidad = cantidad;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public double getCantidad() {
        return cantidad;
    }
}

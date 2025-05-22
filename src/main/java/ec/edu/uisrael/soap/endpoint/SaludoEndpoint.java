package ec.edu.uisrael.soap.endpoint;

import ec.edu.uisrael.soap.model.SaludoRequest;
import ec.edu.uisrael.soap.model.SaludoResponse;
import ec.edu.uisrael.soap.service.SaludoService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.time.LocalDate;

@Endpoint
public class SaludoEndpoint {
    private static final String NAMESPACE_URI = "http://ejemplo.com/saludos";

    private final SaludoService saludoService;

    public SaludoEndpoint(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SaludoRequest")
    @ResponsePayload
    public SaludoResponse obtenerSaludo(@RequestPayload SaludoRequest request) {
        SaludoResponse response = new SaludoResponse();
        response.setMensaje(saludoService.obtenerSaludo(request.getNombre()));
        response.setFechaHora(LocalDate.now().toString());
        response.setCodigo(200);
        return response;
    }
}

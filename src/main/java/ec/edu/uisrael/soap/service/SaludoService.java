package ec.edu.uisrael.soap.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String obtenerSaludo(String nombre) {
        return "Hola, " + nombre + "! Bienvenido al servicio SOAP.";
    }
}

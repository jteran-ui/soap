package ec.edu.uisrael.soap.model;

import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"mensaje", "fechaHora", "codigo"})
@XmlRootElement(name = "SaludoResponse", namespace = "http://ejemplo.com/saludos")
public class SaludoResponse {

    @XmlElement(namespace = "http://ejemplo.com/saludos")
    private String mensaje;


    @XmlElement(namespace = "http://ejemplo.com/saludos")
    private String fechaHora;


    @XmlElement(namespace = "http://ejemplo.com/saludos")
    private int codigo;


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

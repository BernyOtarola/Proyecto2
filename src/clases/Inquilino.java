package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author berny
 */
public class Inquilino {

    private int cedInqui;
    private String nomInqui;
    private String genero;
    private Date fechNac;
    private String direccion;
    private int telefono;
    private String email;
    private String ocupacion;

    public Inquilino() {
        this.cedInqui = 0;
        this.nomInqui = "";
        this.genero = "";
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
        this.ocupacion = "";
    }

    public Inquilino(int cedula, String nombre, String genero, java.util.Date fechNac, String direccion, int telefono, String email, String ocupacion) {
        this.cedInqui = cedula;
        this.nomInqui = nombre;
        this.genero = genero;
        this.fechNac = fechNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.ocupacion = ocupacion;
    }

    public int getCedInqui() {
        return cedInqui;
    }

    public void setCedInqui(int cedInqui) {
        this.cedInqui = cedInqui;
    }

    public String getNomInqui() {
        return nomInqui;
    }

    public void setNomInqui(String nomInqui) {
        this.nomInqui = nomInqui;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Object[] toObjectArray() {
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(fechNac);

        return new Object[]{cedInqui, nomInqui, genero, formattedDate, direccion, telefono, email, ocupacion};
    }
}

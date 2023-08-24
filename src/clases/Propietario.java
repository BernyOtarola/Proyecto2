package clases;

/**
 *
 * @author berny
 */
public class Propietario {

    private int cedPropiet;
    private String nomPropiet;
    private String genero;
    private String direccion;
    private int telefono;
    private String email;

    public Propietario() {
        this.cedPropiet = 0;
        this.nomPropiet = "";
        this.genero = "";
        this.direccion = "";
        this.telefono = 0;
        this.email = "";

    }

    public Propietario(int cedPropiet, String nomPropiet, String genero, String direccion, int telefono, String email) {
        this.cedPropiet = cedPropiet;
        this.nomPropiet = nomPropiet;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCedPropiet() {
        return cedPropiet;
    }

    public void setCedPropiet(int cedPropiet) {
        this.cedPropiet = cedPropiet;
    }

    public String getNomPropiet() {
        return nomPropiet;
    }

    public void setNomPropiet(String nomPropiet) {
        this.nomPropiet = nomPropiet;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

}

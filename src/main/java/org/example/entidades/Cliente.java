package org.example.entidades;

public class Cliente {
        //Atributos de Cliente
    private Long idCliente;
    private String nombre;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private String email;

        //Constructores de Cliente
    public Cliente() {
    }

        //Asignadores de atributos de Cliente (setters)
    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setEmail(String email) {
        this.email = email;
    }

        //Lectores de atributos de Cliente (getters)
    public Long getIdCliente() {
        return idCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCalle() {
        return calle;
    }
    public int getNumero() {
        return numero;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getPais() {
        return pais;
    }
    public String getEmail() {
        return email;
    }

        //Métodos de Cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

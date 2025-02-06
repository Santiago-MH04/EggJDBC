package org.example.entidades;

import java.time.LocalDate;

public class Casa {
        //Atributos de Casa
    private Long idCasa;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private int tiempoMinimo;
    private int tiempoMaximo;
    private float precioHabitacion;
    private String tipoVivienda;

        //Constructores de Casa
    public Casa() {
    }

        //Asignadores de atributos de Casa (setters)
    public void setIdCasa(Long idCasa) {
        this.idCasa = idCasa;
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
    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }
    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }
    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

        //Lectores de atributos de Casa (getters)
    public Long getIdCasa() {
        return this.idCasa;
    }
    public String getCalle() {
        return this.calle;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    public String getPais() {
        return this.pais;
    }
    public LocalDate getFechaDesde() {
        return this.fechaDesde;
    }
    public LocalDate getFechaHasta() {
        return this.fechaHasta;
    }
    public int getTiempoMinimo() {
        return this.tiempoMinimo;
    }
    public int getTiempoMaximo() {
        return this.tiempoMaximo;
    }
    public float getPrecioHabitacion() {
        return this.precioHabitacion;
    }
    public String getTipoVivienda() {
        return this.tipoVivienda;
    }

        //Métodos de Casa

    @Override
    public String toString() {
        return "Casa{" +
                "idCasa=" + idCasa +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", tiempoMinimo=" + tiempoMinimo +
                ", tiempoMaximo=" + tiempoMaximo +
                ", precioHabitacion=" + precioHabitacion +
                ", tipoVivienda='" + tipoVivienda + '\'' +
                '}';
    }
}

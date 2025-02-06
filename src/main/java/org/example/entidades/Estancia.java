package org.example.entidades;

import lombok.Data;

import java.time.LocalDate;

@Data   //Con esta anotación se incluyen, entre otros, los métodos equals(), hashCode()
public class Estancia {
        //Atributos de Estancia
    private Long idEstancia;
    private int idCliente;
    private int idCasa;
    private String nombreHuesped;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;

    //Constructores de Estancia
    //Asignadores de atributos de Estancia (setters)
    //Lectores de atributos de Estancia (getters)
    //Métodos de Estancia
    
}

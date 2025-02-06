package org.example.entidades;

import lombok.Data;

@Data   //Con esta anotación se incluyen, entre otros, los métodos equals(), hashCode()
public class Familia {
        //Atributos de Familia
    private Long idFamilia;
    private String nombre;
    private int edadMinima;
    private int edadMaxima;
    private int numHijos;
    private String email;
    private int idCasaFamilia;


    //Constructores de Familia
    //Asignadores de atributos de Familia (setters)
    //Lectores de atributos de Familia (getters)
        //Métodos de Familia
    
}

package org.example.entidades;

import lombok.Data;

@Data   //Con esta anotación se incluyen, entre otros, los métodos equals(), hashCode()
public class Comentario {
        //Atributos de CLASE
    private Long idComentario;
    private int idCasa;
    private String comentario;

    //Constructores de CLASE
    //Asignadores de atributos de CLASE (setters)
    //Lectores de atributos de CLASE (getters)
    //Métodos de CLASE
}

package org.example.servicios;

import java.util.List;
import java.util.Optional;

public interface CRUD_Servicio<T> {
    //Atributos de CRUD_Service
    //Constructores de CRUD_Service
    //Asignadores de atributos de CRUD_Service (setters)
    //Lectores de atributos de CRUD_Service (getters)
        //Métodos de CRUD_Service
    List<T> listar();
    Optional<T> porID(Long id);
    void guardar(T t);
    void eliminar(Long id);
}

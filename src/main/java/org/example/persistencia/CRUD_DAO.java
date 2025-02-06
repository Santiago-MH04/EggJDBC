package org.example.persistencia;

import java.util.List;
import java.util.Optional;

public interface CRUD_DAO <T> {
    //Atributos de CRUD_DAO
    //Constructores de CRUD_DAO
    //Asignadores de atributos de CRUD_DAO (setters)
    //Lectores de atributos de CRUD_DAO (getters)
        //Métodos de CRUD_DAO
    List<T> listar();
    Optional<T> porID(Long id);
    void guardar(T t);
    void eliminar(Long id);
}

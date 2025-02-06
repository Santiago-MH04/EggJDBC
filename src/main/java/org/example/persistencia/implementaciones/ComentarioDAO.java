package org.example.persistencia.implementaciones;

import org.example.entidades.Comentario;
import org.example.persistencia.CRUD_DAO;

import java.util.List;
import java.util.Optional;

public class ComentarioDAO implements CRUD_DAO<Comentario> {
    //Atributos de ComentarioDAO
    //Constructores de ComentarioDAO
    //Asignadores de atributos de ComentarioDAO (setters)
    //Lectores de atributos de ComentarioDAO (getters)
        //Métodos de ComentarioDAO
    @Override
    public List<Comentario> listar() {
        return List.of();
    }

    @Override
    public Optional<Comentario> porID(Long id) {
        return Optional.empty();
    }

    @Override
    public void guardar(Comentario comentario) {

    }

    @Override
    public void eliminar(Long id) {

    }
}

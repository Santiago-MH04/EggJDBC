package org.example.servicios.implementaciones;

import org.example.entidades.Comentario;
import org.example.persistencia.implementaciones.ComentarioDAO;
import org.example.servicios.CRUD_Servicio;

import java.util.List;
import java.util.Optional;

public class ComentarioServicio implements CRUD_Servicio<Comentario> {
        //Atributos de ComentarioServicio
    private ComentarioDAO comentarioDAO;

        //Constructores de ComentarioServicio
    public ComentarioServicio(ComentarioDAO comentarioDAO) {
        this.comentarioDAO = comentarioDAO;
    }

    //Asignadores de atributos de ComentarioServicio (setters)
    //Lectores de atributos de ComentarioServicio (getters)
        //Métodos de ComentarioServicio

    @Override
    public List<Comentario> listar() {
        return this.comentarioDAO.listar();
    }

    @Override
    public Optional<Comentario> porID(Long id) {
        return this.comentarioDAO.porID(id);
    }

    @Override
    public void guardar(Comentario comentario) {
        this.comentarioDAO.guardar(comentario);
    }

    @Override
    public void eliminar(Long id) {
        this.comentarioDAO.eliminar(id);
    }
}

package org.example.persistencia.implementaciones;

import org.example.entidades.Estancia;
import org.example.persistencia.CRUD_DAO;

import java.util.List;
import java.util.Optional;

public class EstanciaDAO implements CRUD_DAO<Estancia> {
    //Atributos de EstanciaDAO
    //Constructores de EstanciaDAO
    //Asignadores de atributos de EstanciaDAO (setters)
    //Lectores de atributos de EstanciaDAO (getters)
        //Métodos de EstanciaDAO
    @Override
    public List<Estancia> listar() {
        return List.of();
    }

    @Override
    public Optional<Estancia> porID(Long id) {
        return Optional.empty();
    }

    @Override
    public void guardar(Estancia estancia) {

    }

    @Override
    public void eliminar(Long id) {

    }
}

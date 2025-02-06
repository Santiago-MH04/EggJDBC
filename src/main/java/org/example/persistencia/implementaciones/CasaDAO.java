package org.example.persistencia.implementaciones;

import org.example.entidades.Casa;
import org.example.persistencia.CRUD_DAO;

import java.util.List;
import java.util.Optional;

public class CasaDAO implements CRUD_DAO<Casa> {
    //Atributos de CasaDAO
    //Constructores de CasaDAO
    //Asignadores de atributos de CasaDAO (setters)
    //Lectores de atributos de CasaDAO (getters)
        //Métodos de CasaDAO
    @Override
    public List<Casa> listar() {
        return List.of();
    }

    @Override
    public Optional<Casa> porID(Long id) {
        return Optional.empty();
    }

    @Override
    public void guardar(Casa casa) {

    }

    @Override
    public void eliminar(Long id) {

    }
}

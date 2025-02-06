package org.example.persistencia.implementaciones;

import org.example.entidades.Familia;
import org.example.persistencia.CRUD_DAO;

import java.util.List;
import java.util.Optional;

public class FamiliaDAO implements CRUD_DAO<Familia> {
    //Atributos de FamiliaDAO
    //Constructores de FamiliaDAO
    //Asignadores de atributos de FamiliaDAO (setters)
    //Lectores de atributos de FamiliaDAO (getters)
        //Métodos de FamiliaDAO
    @Override
    public List<Familia> listar() {
        return List.of();
    }

    @Override
    public Optional<Familia> porID(Long id) {
        return Optional.empty();
    }

    @Override
    public void guardar(Familia familia) {

    }

    @Override
    public void eliminar(Long id) {

    }
}

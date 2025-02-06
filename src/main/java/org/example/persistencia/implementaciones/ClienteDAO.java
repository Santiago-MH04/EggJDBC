package org.example.persistencia.implementaciones;

import org.example.entidades.Cliente;
import org.example.persistencia.CRUD_DAO;

import java.util.List;
import java.util.Optional;

public class ClienteDAO implements CRUD_DAO<Cliente> {
    //Atributos de ClienteDAO
    //Constructores de ClienteDAO
    //Asignadores de atributos de ClienteDAO (setters)
    //Lectores de atributos de ClienteDAO (getters)
        //Métodos de ClienteDAO

    @Override
    public List<Cliente> listar() {
        return List.of();
    }

    @Override
    public Optional<Cliente> porID(Long id) {
        return Optional.empty();
    }

    @Override
    public void guardar(Cliente cliente) {

    }

    @Override
    public void eliminar(Long id) {

    }
}

package org.example.servicios.implementaciones;

import org.example.entidades.Cliente;
import org.example.persistencia.implementaciones.ClienteDAO;
import org.example.servicios.CRUD_Servicio;

import java.util.List;
import java.util.Optional;

public class ClienteServicio implements CRUD_Servicio<Cliente> {
        //Atributos de ClienteServicio
    private ClienteDAO clienteDAO;

        //Constructores de ClienteServicio
    public ClienteServicio(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    //Asignadores de atributos de ClienteServicio (setters)
    //Lectores de atributos de ClienteServicio (getters)
        //Métodos de ClienteServicio
    @Override
    public List<Cliente> listar() {
        return this.clienteDAO.listar();
    }

    @Override
    public Optional<Cliente> porID(Long id) {
        return this.clienteDAO.porID(id);
    }

    @Override
    public void guardar(Cliente cliente) {
        this.clienteDAO.guardar(cliente);
    }

    @Override
    public void eliminar(Long id) {
        this.clienteDAO.eliminar(id);
    }
}

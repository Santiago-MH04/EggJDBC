package org.example.servicios.implementaciones;

import org.example.entidades.Familia;
import org.example.persistencia.implementaciones.FamiliaDAO;
import org.example.servicios.CRUD_Servicio;

import java.util.List;
import java.util.Optional;

public class FamiliaServicio implements CRUD_Servicio<Familia> {
        //Atributos de FamiliaServicio
    private FamiliaDAO familiaDAO;

        //Constructores de FamiliaServicio
    public FamiliaServicio(FamiliaDAO familiaDAO) {
        this.familiaDAO = familiaDAO;
    }

    //Asignadores de atributos de FamiliaServicio (setters)
    //Lectores de atributos de FamiliaServicio (getters)
        //Métodos de FamiliaServicio
    @Override
    public List<Familia> listar() {
        return this.familiaDAO.listar();
    }

    @Override
    public Optional<Familia> porID(Long id) {
        return this.familiaDAO.porID(id);
    }

    @Override
    public void guardar(Familia familia) {
        this.familiaDAO.guardar(familia);
    }

    @Override
    public void eliminar(Long id) {
        this.familiaDAO.eliminar(id);
    }
}

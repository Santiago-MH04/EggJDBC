package org.example.servicios.implementaciones;

import org.example.entidades.Casa;
import org.example.persistencia.implementaciones.CasaDAO;
import org.example.servicios.CRUD_Servicio;

import java.util.List;
import java.util.Optional;

public class CasaServicio implements CRUD_Servicio<Casa> {
        //Atributos de CasaServicio
    private CasaDAO casaDAO;

        //Constructores de CasaServicio
    public CasaServicio(CasaDAO casaDAO) {
        this.casaDAO = casaDAO;
    }


    //Asignadores de atributos de CasaServicio (setters)
    //Lectores de atributos de CasaServicio (getters)
        //Métodos de CasaServicio
    @Override
    public List<Casa> listar() {
        return this.casaDAO.listar();
    }

    @Override
    public Optional<Casa> porID(Long id) {
        return this.casaDAO.porID(id);
    }

    @Override
    public void guardar(Casa casa) {
        this.casaDAO.guardar(casa);
    }

    @Override
    public void eliminar(Long id) {
        this.casaDAO.eliminar(id);
    }
}

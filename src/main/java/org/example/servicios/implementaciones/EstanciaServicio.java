package org.example.servicios.implementaciones;

import org.example.entidades.Estancia;
import org.example.servicios.CRUD_Servicio;

import java.util.List;
import java.util.Optional;

public class EstanciaServicio implements CRUD_Servicio<Estancia> {
        //Atributos de EstanciaServicio
    private EstanciaServicio estanciaServicio;

        //Constructores de EstanciaServicio
    public EstanciaServicio(EstanciaServicio estanciaServicio) {
        this.estanciaServicio = estanciaServicio;
    }


    //Asignadores de atributos de EstanciaServicio (setters)
    //Lectores de atributos de EstanciaServicio (getters)
        //Métodos de EstanciaServicio
    @Override
    public List<Estancia> listar() {
        return this.estanciaServicio.listar();
    }

    @Override
    public Optional<Estancia> porID(Long id) {
        return this.estanciaServicio.porID(id);
    }

    @Override
    public void guardar(Estancia estancia) {
        this.estanciaServicio.guardar(estancia);
    }

    @Override
    public void eliminar(Long id) {
        this.estanciaServicio.eliminar(id);
    }
}

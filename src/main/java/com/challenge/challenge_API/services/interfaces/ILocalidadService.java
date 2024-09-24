package com.challenge.challenge_API.services.interfaces;

import com.challenge.challenge_API.domain.Localidad;

import java.util.List;

public interface ILocalidadService{
    public List<Localidad> getAll();
    public Localidad getById(int id);
    public Localidad getByNombre(String nombre);
    public Localidad getByCodigo(int codigo);
    public Localidad create(Localidad entity);
    public Localidad update(Localidad entity);
    public boolean delete(Localidad entity);
}

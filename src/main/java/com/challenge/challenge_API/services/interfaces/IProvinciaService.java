package com.challenge.challenge_API.services.interfaces;

import com.challenge.challenge_API.domain.Provincia;

import java.util.List;

public interface IProvinciaService {
    public List<Provincia> getAll();
    public Provincia getById(int id);
    public Provincia getByNombre(String nombre);
    public Provincia getByCodigo(String codigo);
    public Provincia create(Provincia entity);
    public Provincia update(Provincia entity);
    public boolean delete(Provincia entity);
}

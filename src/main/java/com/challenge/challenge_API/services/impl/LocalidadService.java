package com.challenge.challenge_API.services.impl;

import com.challenge.challenge_API.domain.Localidad;
import com.challenge.challenge_API.services.interfaces.ILocalidadService;
import com.challenge.challenge_API.mappers.ILocalidadMapper;
import com.challenge.challenge_API.persistance.entities.LocalidadEntity;
import com.challenge.challenge_API.persistance.repositories.ILocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadService implements ILocalidadService {

    private final ILocalidadRepository _localidadRepository;
    private final ILocalidadMapper _mapper;

    @Autowired
    public LocalidadService(ILocalidadRepository localidadRepository, ILocalidadMapper mapper) {
        _localidadRepository = localidadRepository;
        _mapper = mapper;
    }

    @Override
    public List<Localidad> getAll() {
        List<LocalidadEntity> localidadesEntities = _localidadRepository.findAll();
        return _mapper.toListDto(localidadesEntities);
    }

    @Override
    public Localidad getById(int id) {
        return null;
    }

    @Override
    public Localidad getByNombre(String nombre) {
        return null;
    }

    @Override
    public Localidad getByCodigo(int codigo) {
        return null;
    }

    @Override
    public Localidad create(Localidad entity) {
        return null;
    }

    @Override
    public Localidad update(Localidad entity) {
        return null;
    }

    @Override
    public boolean delete(Localidad entity) {
        return false;
    }
}

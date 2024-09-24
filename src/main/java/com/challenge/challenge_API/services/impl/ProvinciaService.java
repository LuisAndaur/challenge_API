package com.challenge.challenge_API.services.impl;

import com.challenge.challenge_API.domain.Provincia;
import com.challenge.challenge_API.services.interfaces.IProvinciaService;
import com.challenge.challenge_API.mappers.IProvinciaMapper;
import com.challenge.challenge_API.persistance.entities.ProvinciaEntity;
import com.challenge.challenge_API.persistance.repositories.IProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaService implements IProvinciaService {

    private final IProvinciaRepository _provinciaRepository;
    private final IProvinciaMapper _mapper;

    @Autowired
    public ProvinciaService(IProvinciaRepository provinciaRepository, IProvinciaMapper mapper) {
        _provinciaRepository = provinciaRepository;
        _mapper = mapper;
    }

    @Override
    public List<Provincia> getAll() {
        List<ProvinciaEntity> provinciasEntities = _provinciaRepository.findAll();
        return _mapper.toListDto(provinciasEntities);
    }

    @Override
    public Provincia getById(int id) {
        return null;
    }

    @Override
    public Provincia getByNombre(String nombre) {
        return null;
    }

    @Override
    public Provincia getByCodigo(String codigo) {
        return null;
    }

    @Override
    public Provincia create(Provincia entity) {
        ProvinciaEntity auxEntity = _mapper.toEntity(entity);
        return _mapper.toDto(_provinciaRepository.save(auxEntity));
    }

    @Override
    public Provincia update(Provincia entity) {
        return null;
    }

    @Override
    public boolean delete(Provincia entity) {
        return false;
    }
}

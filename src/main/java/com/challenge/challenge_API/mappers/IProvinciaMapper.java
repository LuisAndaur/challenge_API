package com.challenge.challenge_API.mappers;

import com.challenge.challenge_API.domain.Provincia;
import com.challenge.challenge_API.persistance.entities.ProvinciaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface IProvinciaMapper extends IEntityMapper<Provincia, ProvinciaEntity> {

    Provincia toDto(ProvinciaEntity provinciaEntity);
    ProvinciaEntity toEntity(Provincia provincia);
    List<Provincia> toListDto(List<ProvinciaEntity> provinciaEntities);
    List<ProvinciaEntity> toListEntity(List<Provincia> provinciaEntities);
}

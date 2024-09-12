package com.challenge.challenge_API.mappers;

import com.challenge.challenge_API.domain.Localidad;
import com.challenge.challenge_API.persistance.entities.LocalidadEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ILocalidadMapper extends IEntityMapper<Localidad, LocalidadEntity> {

    Localidad toDto(LocalidadEntity provinciaEntity);
    LocalidadEntity toEntity(Localidad provincia);
    List<Localidad> toListDto(List<LocalidadEntity> provinciaEntities);
    List<LocalidadEntity> toListEntity(List<Localidad> provincia);
}

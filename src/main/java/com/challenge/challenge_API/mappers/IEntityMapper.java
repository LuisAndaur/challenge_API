package com.challenge.challenge_API.mappers;

import java.util.List;

public interface IEntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toListEntity(List<D> dto);
    List<D> toListDto(List<E> entity);
}

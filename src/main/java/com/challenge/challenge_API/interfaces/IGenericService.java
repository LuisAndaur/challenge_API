package com.challenge.challenge_API.interfaces;

import java.util.List;

public interface IGenericService<T> {
    public List<T> getAll();
    public T getById(int id);
    public T getByNombre(String nombre);
    public T getByCodigo(int codigo);
    public T getByCodigo(String codigo);
    public T create(T entity);
    public T update(T entity);
    public boolean delete(T entity);
}

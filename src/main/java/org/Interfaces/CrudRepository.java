package org.Interfaces;

import java.util.List;

public interface CrudRepository<T> {
    List<T> listar();

    void crear(T t);

    void editar(T t);

    void eliminar(Integer id);

}

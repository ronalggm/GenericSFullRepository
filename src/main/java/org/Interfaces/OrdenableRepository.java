package org.Interfaces;

import org.Direccion;

import java.util.List;

public interface  OrdenableRepository<T> {
    List<T> listar(String campo, Direccion dir);

}

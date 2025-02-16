package org;

import org.Interfaces.FullRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements FullRepository<T> {
    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public T buscarPorId(Integer id) {
        T result = null;
        for (T t : dataSource) {
            if (t.getId().equals(id)) {
                result = t;
                return result;
            }
        }
        return null;
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(id);
    }


    public AbstractListRepository crearEnlazado(T t) {
        crear(t);
        return this;
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


}
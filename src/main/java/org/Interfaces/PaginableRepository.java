package org.Interfaces;

import java.util.List;

public interface PaginableRepository<T> {
    List<T> listar(int desde, int hasta);

}

package org.Interfaces;

import org.BaseEntity;

public interface FullRepository<T>
        extends OrdenableRepository<T>,
        PaginableRepository<T>, CrudRepository<T> {


}

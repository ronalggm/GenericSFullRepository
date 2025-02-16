package org;

import org.Interfaces.FullRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements FullRepository<T> {
    private List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();

    }
}
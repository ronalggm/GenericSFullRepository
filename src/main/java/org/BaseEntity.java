package org;

public class BaseEntity {
    protected Integer id;
    private static int ultimoId;

    public BaseEntity() {
        this.id = ultimoId++;
    }

    public static class AbstractListRepository {

    }
}

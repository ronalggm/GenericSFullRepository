package org;

import org.modelos.Cliente;

import java.util.List;

public class ClienteListRepository extends AbstractListRepository<Cliente> {

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }



    @Override
    public void editar(Cliente cliente) {

    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return List.of();
    }
}

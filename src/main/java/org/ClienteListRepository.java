package org;

import org.modelos.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepository extends AbstractListRepository<Cliente> {


    @Override
    public void editar(Cliente cliente) {
        Cliente cli = buscarPorId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        if (dir == Direccion.ASC) {
            listaOrdenada.sort((a, b) -> ordenar(campo, a, b));

        }
        if (dir == Direccion.DESC) {
            dataSource.sort((a, b) -> ordenar(campo, b, a));
        }
        return listaOrdenada;
    }

    public int ordenar(String campo, Cliente a, Cliente b) {
        int result = 0;
        switch (campo) {
            case "id" -> result = a.getId().compareTo(b.getId());
            case "nombre" -> result = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> result = a.getApellido().compareTo(b.getApellido());
        }
        return result;
    }



}

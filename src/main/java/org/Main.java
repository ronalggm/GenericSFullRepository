package org;

import org.modelos.Cliente;

public class Main {
    public static void main(String[] args) {

        AbstractListRepository<Cliente> repoClientes = new ClienteListRepository();
        repoClientes.crearEnlazado(new Cliente("Juan", "Perez"))
                .crearEnlazado(new Cliente("Luci", "Martinez"))
                .crearEnlazado(new Cliente("Carlos", "Gutierrez"))
                .crearEnlazado(new Cliente("Laura", "Quintero"));

        System.out.println("===Listar por defecto===");
        repoClientes.listar().forEach(System.out::println);

        System.out.println("Buscar por id:");
        System.out.println(repoClientes.buscarPorId(2).getNombre()+ "id" + repoClientes.buscarPorId(2).getId());



        System.out.println("=== metodo Editar===");
        Cliente intercambio = new Cliente("Bea", "Mena");
        intercambio.setId(2);

        repoClientes.editar(intercambio);

        System.out.println(repoClientes.buscarPorId(2).getNombre());

        System.out.println("Id intercambiado: " + 2 + " Nombre: " + repoClientes.buscarPorId(2).getNombre());

        repoClientes.listar().forEach(System.out::println);
    }


}
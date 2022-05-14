package com.ibm.academia.restapi.productos.modelo.servicios;

import com.ibm.academia.restapi.productos.modelo.entidades.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoDAO
{
     List<Producto> buscarTodos();
     Optional<Producto>buscarPorId(Long id);

}

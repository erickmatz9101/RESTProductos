package com.ibm.academia.restapi.productos.modelo.repositorios;

import com.ibm.academia.restapi.productos.modelo.entidades.Producto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long>
{


}

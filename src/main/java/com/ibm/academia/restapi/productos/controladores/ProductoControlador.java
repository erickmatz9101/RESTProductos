package com.ibm.academia.restapi.productos.controladores;

import com.ibm.academia.restapi.productos.modelo.entidades.Producto;
import com.ibm.academia.restapi.productos.modelo.servicios.ProductoDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto/")
public class ProductoControlador
{
    private final static Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoDAO productoDAO;

    /**
     * Endpoint para consultar los productos
     * @return una lista de productos
     * @author Erick Matz 14-05-22
     */

    @GetMapping("/listar")
    public ResponseEntity<?>consultarTodosProductos()
    {
        List<Producto> productos = productoDAO.buscarTodos();
        return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
    }

    /**
     * Endpoint para consultar un objeto produto
     * @param productoId parametro de busqueda del objeto
     * @return un obeto de tipo producto
     * @author: ErickMatz 14-05-22
     */


    @GetMapping("/ver-detalle/productoId/{productoId}")
    public ResponseEntity<?> verDetalleProducto(@PathVariable Long productoId){
        Optional<Producto> producto = null;

        try{

            producto = productoDAO.buscarPorId(productoId);

        }catch (Exception e){

            logger.info(e.getMessage() + " Causa " + e.getCause());

            throw e;

        }

        return new ResponseEntity<Producto>(producto.get(),HttpStatus.OK);

    }

}

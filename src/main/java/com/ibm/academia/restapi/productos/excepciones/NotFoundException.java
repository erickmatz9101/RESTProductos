package com.ibm.academia.restapi.productos.excepciones;

public class NotFoundException extends RuntimeException
{
    public NotFoundException(String message){
        super(message);

    }


    private static final long serialVersionUID = -692083794584032204L;
}

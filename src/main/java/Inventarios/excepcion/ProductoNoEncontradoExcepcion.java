package Inventarios.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductoNoEncontradoExcepcion extends RuntimeException{

    public ProductoNoEncontradoExcepcion(String mensaje){
        super(mensaje);
    }
}

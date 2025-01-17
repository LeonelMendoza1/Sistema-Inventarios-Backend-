package Inventarios.servicio;

import Inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductorPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProducto(Integer idProducto);
}

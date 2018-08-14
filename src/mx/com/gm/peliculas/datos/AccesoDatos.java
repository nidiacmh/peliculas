package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;

import java.util.List;

public interface AccesoDatos {

    boolean existe(String nombre);

    List<Pelicula> listar(String nombre);

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);
}

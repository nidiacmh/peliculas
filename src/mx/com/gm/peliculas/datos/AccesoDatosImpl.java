package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;

import java.util.List;

public class AccesoDatosImpl implements AccesoDatos {
    @Override
    public boolean existe(String nombre) {
        return false;
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        return null;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    @Override
    public void crear(String nombreArchivo) {

    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}

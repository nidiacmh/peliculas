package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;


public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        datos = datos;
    }

    @Override
    public void agregar(String nombrePelicula, String nombreArchivo) {

    }

    @Override
    public void listarPeliculas(String nombreArchivo) {

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        System.out.println("Iniciar el archivo");
    }
}

package mx.com.gm.peliculas.negocio;

public interface CatalogoPeliculas {

    void agregar(String nombrePelicula, String nombreArchivo);

    void listarPeliculas(String nombreArchivo);

    void buscarPelicula(String nombreArchivo, String buscar);

    void iniciarArchivo(String nombreArchivo);
}

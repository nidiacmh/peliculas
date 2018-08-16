package cpjlaboratoriofinal;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CPJLaboratorioFinal {


    static int opcion = 5;
    private static CatalogoPeliculasImpl catalogo;
    private static AccesoDatos datos;
    private static String nombreArchivo = "catalogo.txt";
    CatalogoPeliculas catalogoPeliculas;


    public static void main(String... args) {

        if (!args[0].isEmpty())
            nombreArchivo = args[0];

        Scanner sn = new Scanner(System.in);
        catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {

            System.out.println("1. Iniciar catalogo de peliculas");
            System.out.println("2. Agregar pelicula");
            System.out.println("3. Listar Peliculas");
            System.out.println("4. Buscar Pelicula");
            System.out.println("0. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        catalogo.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        break;
                    case 0:
                        System.out.println("salir");
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4 o 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}



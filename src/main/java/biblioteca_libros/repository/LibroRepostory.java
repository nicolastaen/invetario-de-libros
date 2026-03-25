package biblioteca_libros.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import biblioteca_libros.model.Libro;

@Repository
public class LibroRepostory {

    //Arreglo para guardar los libeos
    private List<Libro> listarLibros = new ArrayList<>();

    // Metodo para retornar los libros
    public List<Libro> obtenerLibros() {
        return listarLibros;
    }

}

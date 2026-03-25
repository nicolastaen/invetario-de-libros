package biblioteca_libros.service;

import biblioteca_libros.model.Libro;
import biblioteca_libros.repository.LibroRepostory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;

@Service
public class LibroService {
    @Autowired
    private LibroRepostory libroRepostory;

    public List<Libro> getLibros(){
        return libroRepostory.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepostory.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepostory.buscarId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepostory.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepostory.eliminar(id);
        return "producto eliminado";
    }
}

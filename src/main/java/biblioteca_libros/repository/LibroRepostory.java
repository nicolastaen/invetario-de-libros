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

    //metodo para buscar un libro por si id
    public Libro buscarId(int id) {
        for (Libro libro : listarLibros) { 
            if (libro.getId()== id) {
                return libro;
            }
        }
        return null;
    }

    //metodo para buscar un libro por su isbn
    public Libro buscarIsbn(String isbn) {
        for (Libro libro : listarLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    //metodo para guardar lol
    public Libro guardar(Libro lib) {
        listarLibros.add(lib);
        return lib;
    }

    //metodo para actualizar un libro
    public Libro actualizar(Libro lib) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listarLibros.size(); i++){
            if (listarLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = 1;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listarLibros.set(idPosicion, libro1);
        return libro1;
    }

    //metodoS para eliminar un libro
    public void eliminar(int id) {
        //metodo1
        Libro libro = buscarId(id);
        if (libro != null) {
            listarLibros.remove(libro);
        }

        //metodo2
        int idPosicion = 0;
        for (int i = 0; i < listarLibros.size(); i++) {
            if (listarLibros.get(1).getId() == id) {
                idPosicion = i;
                break;
            }
        }
        if (idPosicion > 0) {
            listarLibros.remove(idPosicion);
        }

        //metodo 3
        listarLibros.removeIf(x -> x.getId() == id);
    }
}

package biblioteca_libros.controller;

import biblioteca_libros.model.Libro;
import biblioteca_libros.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ap1/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

}

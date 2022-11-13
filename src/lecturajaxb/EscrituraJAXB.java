package lecturajaxb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author David Marín
 */
public class EscrituraJAXB {

    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Libreria.class);
        Marshaller marshaller = context.createMarshaller();
        Libreria libreria = new Libreria();
        libreria.setNombre("Mi libreria");
        
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libro = new Libro();
        //Se añade el primer libro
        libro.setIsbn("9788441536258");
        libro.setTitulo("Java 8");
        libro.setAutor("Herbert Schildt");
        libros.add(libro);
        //Se añade el segundo libro
        libro.setIsbn("9788415033370");
        libro.setTitulo("Curso de programación web");
        libro.setAutor("Scott Mccracken");
        libros.add(libro);
        //Se añade el tercer libro
        libro.setIsbn("9788426722126");
        libro.setTitulo("Python fácil");
        libro.setAutor("Arnaldo Pérez Castaño");
        libros.add(libro);
        
        libreria.setLibros(libros);
        
        //Se genera y se imprime por consola el XML
        //Con esta linea se le da formato XML
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //Se imprime el XML por consola
        marshaller.marshal(libreria, System.out);
        //Ahora se escribe el XML en un fichero
        marshaller.marshal(libreria, new FileWriter("src\\lecturajaxb\\MiLibreria.xml"));
        
        
        
    }
    
}

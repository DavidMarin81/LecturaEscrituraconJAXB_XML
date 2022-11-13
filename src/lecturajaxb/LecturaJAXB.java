package lecturajaxb;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author David Marín
 */
public class LecturaJAXB {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Libreria.class);
        //Se crea un objeto que permite leer de XML a Java
        Unmarshaller unmarshaller = context.createUnmarshaller();
        //Se hace un casting a Libreria
        Libreria libreria = (Libreria) unmarshaller.unmarshal(new File("src\\lecturajaxb\\libreria.xml"));
        
        System.out.println("Nombre: " + libreria.getNombre());
        
        ArrayList<Libro> libros = libreria.getLibros();
        for (Libro l : libros){
            System.out.println(l.getIsbn() + " " + l.getTitulo() + " " + l.getAutor());
        }
    }
    
}

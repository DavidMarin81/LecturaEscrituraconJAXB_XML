package lecturajaxb;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author David Marín
 */
//Se define el elemento root del xml
//Se usa name="libreria" ya que usaremos este name para la etiqueta Xml
@XmlRootElement(name="libreria")
@XmlType(propOrder={"nombre", "libros"})
public class Libreria {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Libreria() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Elemento envoltorio
    @XmlElementWrapper(name="libros")
    @XmlElement(name="libro")
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    
}

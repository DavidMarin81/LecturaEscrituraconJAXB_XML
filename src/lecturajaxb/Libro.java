package lecturajaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author David Marín
 */
@XmlRootElement(name="libro")
//Se tiene que escribir en el orden en el que aparecen
@XmlType(propOrder ={"isbn", "titulo", "autor"})
public class Libro {
    //isbn es un atributo
    private String isbn;
    //titulo y autor son elementos
    private String titulo;
    private String autor;

    public Libro() {
    }

    //Se define isbn como atributo
    @XmlAttribute(name="isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}

import java.util.*;

public class Curso extends Matricula {
    public String nombreC, codigoC;
    public int precio;
    public Docente docente;
    private List<Curso> clases;
    public Curso(String nombre, int edad, String cedula, String telefono, int codigo, String inscripcion, String nombreC, String codigoC, int precio, Docente docente) {
        super(nombre, edad, cedula, telefono, codigo, inscripcion);
        this.nombreC = nombreC;
        this.codigoC = codigoC;
        this.precio = precio;
        this.docente=docente;
        this.clases= new ArrayList<>();
    }



}

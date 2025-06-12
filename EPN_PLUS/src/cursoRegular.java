public class cursoRegular extends Matricula {
    public String nombreC, codigoC;
    public int precio;
    public cursoRegular(String nombre, int edad, String cedula, String telefono, int codigo, String inscripcion, String nombreC, String codigoC, int precio) {
        super(nombre, edad, cedula, telefono, codigo, inscripcion);
        this.nombreC = nombreC;
        this.codigoC = codigoC;
        this.precio = precio;
    }



}

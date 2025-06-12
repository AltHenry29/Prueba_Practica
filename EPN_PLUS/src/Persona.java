public class Persona {
    public String nombre, cedula, telefono;
    public int edad;

    public Persona(String nombre, int edad, String cedula, String telefono ){
        this.nombre=nombre;
        this.cedula=cedula;
        this.edad=edad;
        this.telefono=telefono;
    }

    public abstract void mostrarInformacion();

    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public String getCedula(){return cedula;}
    public String getTelefono(){return telefono;}
}

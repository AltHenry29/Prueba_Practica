public class Docente extends Persona {
    public String especializacion, horario;
    public Docente(String nombre, int edad, String cedula, String telefono, String especializacion, String horario) {
        super(nombre, edad, cedula, telefono);
        this.especializacion=especializacion;
        this.horario=horario;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Docente: " +  nombre +" | Edad: "+ edad + " | Especializacion: "+ especializacion +" | Telefono: "+ telefono);
    }

    public String getDocente(){
        return nombre;
    }
}

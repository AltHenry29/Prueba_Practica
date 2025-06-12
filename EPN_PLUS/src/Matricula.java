public class Matricula extends Estudiante {
    public String inscripcion;
    public Matricula(String nombre, int edad, String cedula, String telefono, int codigo, String inscripcion ){
        super (nombre, edad, cedula, telefono, codigo);
        this.inscripcion=inscripcion;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Estudiante: " +  nombre +" | Edad: "+ edad + " | Codigo: "+codigo + " ¡¡¡Matriculado!!!");
    }

}

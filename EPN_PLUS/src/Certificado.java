public class Certificado extends Estudiante{
    public Certificado(String nombre, int edad, String cedula, String telefono, int codigo ) {
        super(nombre, edad, cedula, telefono, codigo);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Estudiante: " +  nombre +" | Edad: "+ edad + " | Codigo: "+codigo);
        System.out.println("Certificado a Nivel Nacional");
    }
}

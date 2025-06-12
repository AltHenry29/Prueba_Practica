import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    public int codigo;
    private List<Estudiante> inscritos;
    public Estudiante(String nombre, int edad, String cedula, String telefono, int codigo) {
        super(nombre, edad, cedula, telefono);
        this.codigo=codigo;
        this.inscritos=new ArrayList<>();
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Estudiante: " +  nombre +" | Edad: "+ edad);
        for (Estudiante p:inscritos){
            p.mostrarInformacion();
        }
    }
}

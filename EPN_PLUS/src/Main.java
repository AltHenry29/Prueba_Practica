import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        String name, id, phone;
        int opc,age,code=0;
        System.out.println("-----Programa de Matriculas */EPN-PLUS*/ -----");
        System.out.println("1. Matriculacion de Estudiantes");
        System.out.println("2. Registro de Estudiantes");
        System.out.println("3. Registro de Docentes");
        System.out.println("4. Descripcion de Cursos");
        System.out.println("5. Historial");
        System.out.print("Escoja una opcion:");
        opc=sc.nextInt();
        System.out.print("En proceso");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(2000);
        System.out.println("Listo");
        switch (opc){
            case 1:
                System.out.println("\n-----Menu de matriculacion-----\n");
                System.out.print("Ingrese el nombre del estudiante: ");
                name = sc.next();
                System.out.print("\nIngrese la edad del estudiante: ");
                age = sc.nextInt();
                if(age<13 || age>60){
                    System.out.println("\nMil disculpas, no cumples con el requisito de edad, Sorry :v");
                    break;
                }
                System.out.print("\nIngrese la cedula del estudiante");
                id = sc.next();
                System.out.print("\nIngrese el telefono del estudiante");
                phone = sc.next();
                //code+=1;
                Estudiante e=new Estudiante(name,age,id,phone,code);

                break;

            case 2:

        }

    }
}
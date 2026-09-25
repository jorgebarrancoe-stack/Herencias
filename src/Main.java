import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = null;
        Docente docente = null;
        int opcion = -1;

        while (opcion != 0) {
            System.out.println(" MENU ");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar notas");
            System.out.println("3. Registrar docente");
            System.out.println("4. Mostrar informacion");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                System.out.print("Nombre del estudiante: ");
                String nombreEst = sc.nextLine();
                System.out.print("Programa: ");
                String programa = sc.nextLine();
                estudiante = new Estudiante(nombreEst, "E001", programa);
                System.out.println("Estudiante registrado.");
            }

            if (opcion == 2) {
                if (estudiante == null) {
                    System.out.println("Primero registra un estudiante.");
                } else {
                    System.out.print("Nota 1: ");
                    double n1 = Double.parseDouble(sc.nextLine());
                    System.out.print("Nota 2: ");
                    double n2 = Double.parseDouble(sc.nextLine());
                    System.out.print("Nota 3: ");
                    double n3 = Double.parseDouble(sc.nextLine());
                    System.out.print("Nota 4: ");
                    double n4 = Double.parseDouble(sc.nextLine());
                    estudiante.registrarNotas(n1, n2, n3, n4);
                    System.out.println("Notas registradas.");
                }
            }

            if (opcion == 3) {
                System.out.print("Nombre del docente: ");
                String nombreDoc = sc.nextLine();

                System.out.print("Especialidad: ");
                String especialidad = sc.nextLine();

                System.out.println("Elige la asignatura que dicta:");
                System.out.println("1. Calculo");
                System.out.println("2. Fisica");
                System.out.println("3. POO");
                System.out.println("4. Algebra");

                int opcionAsignatura = Integer.parseInt(sc.nextLine());

                docente = new Docente(nombreDoc, "D001", especialidad, opcionAsignatura);

                System.out.println("Docente registrado.");
            }

            if (opcion == 4) {
                if (estudiante != null) {
                    System.out.println(estudiante.mostrarInfo());
                }
                if (docente != null) {
                    System.out.println(docente.mostrarInfo());
                }
                if (estudiante == null && docente == null) {
                    System.out.println("No hay nada registrado todavia.");
                }
            }
        }

        System.out.println("Saliendo...");
        sc.close();
    }
}
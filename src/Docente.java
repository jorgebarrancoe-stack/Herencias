public class Docente extends Persona implements Asignatura {
    private String especialidad;
    private int opcionAsignatura;

    public Docente(String nombre, String id, String especialidad, int opcionAsignatura) {
        super(nombre, id);
        this.especialidad = especialidad;
        this.opcionAsignatura = opcionAsignatura;
    }

    @Override
    public String Calculo() {
        return "Calculo I y II";
    }

    @Override
    public String Fisica() {
        return "Fisica Mecanica";
    }

    @Override
    public String POO() {
        return "Programacion Orientada a Objetos";
    }

    @Override
    public String Algebra() {
        return "Algebra Lineal";
    }

    public String obtenerAsignatura() {
        if (opcionAsignatura == 1) {
            return Calculo();
        }

        if (opcionAsignatura == 2) {
            return Fisica();
        }

        if (opcionAsignatura == 3) {
            return POO();
        }

        if (opcionAsignatura == 4) {
            return Algebra();
        }

        return "Sin asignatura";
    }

    @Override
    public String mostrarInfo() {
        return "Docente: " + nombre
                + " | Especialidad: " + especialidad
                + " | Asignatura: " + obtenerAsignatura();
    }
}
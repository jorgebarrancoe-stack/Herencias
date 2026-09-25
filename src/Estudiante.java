public class Estudiante extends Persona {
    private String programa;
    private double nota1, nota2, nota3, nota4;

    public Estudiante(String nombre, String id, String programa) {
        super(nombre, id);
        this.programa = programa;
    }

    public void registrarNotas(double n1, double n2, double n3, double n4) {
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        nota4 = n4;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    @Override
    public String mostrarInfo() {
        return "Estudiante: " + nombre
                + " | Programa: " + programa
                + " | Promedio: " + calcularPromedio();
    }
}
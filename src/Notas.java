public class Notas {
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public Notas() {
        this(0, 0, 0, 0);
    }

    public Notas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 3.0;
    }
}
public abstract class Propiedad {

    protected String codigo;
    protected double valor;

    public Propiedad(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public double Valor() {
        return valor;
    }

    public String Codigo() {
        return codigo;
    }

    public abstract double PorcentajeComision();

    public abstract String Tipo();
}

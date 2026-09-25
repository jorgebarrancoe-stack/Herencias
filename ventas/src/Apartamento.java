public class Apartamento extends Propiedad {

    public Apartamento(String codigo, double valor) {
        super(codigo, valor);
    }

    @Override
    public double PorcentajeComision() {
        return 0.02;
    }

    @Override
    public String Tipo() {
        return "Apartamento";
    }
}

public class Lote extends Propiedad {

    public Lote(String codigo, double valor) {
        super(codigo, valor);
    }

    @Override
    public double PorcentajeComision() {
        return 0.025;
    }

    @Override
    public String Tipo() {
        return "Lote";
    }
}
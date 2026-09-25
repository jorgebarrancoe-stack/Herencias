public class Casa extends Propiedad {

    public Casa(String codigo, double valor) {
        super(codigo, valor);
    }

    @Override
    public double PorcentajeComision() {
        return 0.03;
    }

    @Override
    public String Tipo() {
        return "Casa";
    }
}

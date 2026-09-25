public class Empleado implements Comisionable {

    private final String nombre;
    private final String documento;

    public Empleado(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    @Override
    public double calcularComision (double valorVenta) {
        return valorVenta * 0.02;
    }

     {

         int porcentaje = 0;
         int cantidadVentas = 0;
         int valorVenta = 0;

    }

    public String Nombre() {
        return nombre;
    }

    public String Documento() {
        return documento;
    }

    @Override
    public double calcularComision(double valorVenta, int cantidadVentas) {
        return 0;
    }
}
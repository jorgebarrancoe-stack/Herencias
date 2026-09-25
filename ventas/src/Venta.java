public class Venta {

    private final Empleado empleado;
    private final Propiedad propiedad;

    public Venta(Empleado empleado, Propiedad propiedad) {
        this.empleado = empleado;
        this.propiedad = propiedad;
    }

    public double calcularComision(int cantidadVentas) {

        double porcentaje = propiedad.PorcentajeComision();

        if (cantidadVentas >= 5) {
            porcentaje = porcentaje + 0.01;
        } else if (cantidadVentas >= 3) {
            porcentaje = porcentaje + 0.005;
        }

        return propiedad.Valor() * porcentaje;
    }

    public void mostrarInformacion(int cantidadVentas) {

        System.out.println("Empleado: " + empleado.Nombre());
        System.out.println("Tipo de propiedad: " + propiedad.Tipo());
        System.out.println("Código: " + propiedad.Codigo());
        System.out.println("Valor de venta: $" + propiedad.Valor());
        System.out.println("Cantidad de ventas: " + cantidadVentas);
        System.out.println("Comisión: $" + calcularComision(cantidadVentas));
        System.out.println("-----------------------------");
    }
}
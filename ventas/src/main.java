import java.util.Scanner;

public class main {

    public main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Empleado empleado = new Empleado("Maria", "123456789");

        System.out.println("=== SISTEMA DE VENTAS Y COMISIONES ===");

        System.out.print("Ingrese el tipo de propiedad: ");
        String tipo = entrada.nextLine().toLowerCase();

        System.out.print("Ingrese el código de la propiedad: ");
        String codigo = entrada.nextLine();

        System.out.print("Ingrese el valor de la propiedad: ");
        double valor = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de ventas realizadas en el mes: ");
        int cantidadVentas = entrada.nextInt();

        Propiedad propiedad;

        switch (tipo) {

            case "casa":
                propiedad = new Casa(codigo, valor);
                break;

            case "lote":
                propiedad = new Lote(codigo, valor);
                break;

            case "apartamento":
                propiedad = new Apartamento(codigo, valor);
                break;

            default:
                System.out.println("Tipo de propiedad no válido.");
                entrada.close();
                return;
        }

        Venta venta = new Venta(empleado, propiedad);

        System.out.println();
        venta.mostrarInformacion(cantidadVentas);

        entrada.close();
    }
}

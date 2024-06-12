import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {

    public static void convertir(String monedaBase, String monedaDestino, ServicioConversion servicioCambio,
                                 Scanner escanerEntrada) {
        double cantidad;  // 'monto' renombrado a 'cantidad'
        double cantidadConvertida;  // 'montoConvertido' renombrado a 'cantidadConvertida'
        Date fechaHoy = new Date();  // 'fechaActual' renombrado a 'fechaHoy'
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");  // 'formato' renombrado a 'formatoFecha'

        TasaCambio tasaCambio = servicioCambio.obtenerTasa(monedaBase, monedaDestino);  // 'tasa' renombrado a 'tasaCambio'

        if (tasaCambio != null) {
            System.out.println("El tipo de cambio para hoy " + formatoFecha.format(fechaHoy) +
                    "\n1 " + monedaBase + " = " + tasaCambio.obtenerTasaConversion() + " " + monedaDestino);

            try {
                System.out.println("Ingrese la cantidad que deseas convertir de " + monedaBase);
                cantidad = Double.parseDouble(escanerEntrada.nextLine());
                cantidadConvertida = cantidad * tasaCambio.obtenerTasaConversion();
                System.out.println("La cantidad " + cantidad + " " + monedaBase + " equivale a =>> "
                        + cantidadConvertida + " " + monedaDestino);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        } else {
            System.out.println("No se pudo obtener la tasa de cambio para " + monedaBase + " a " + monedaDestino);
        }
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioConversion conversionService = new ServicioConversion();
        int option = 0;

        while (option != 9) {  // Corrigiendo el límite a 9 para "Salir"
            System.out.println("-------------------------------------------\n");
            System.out.println("Bienvenido al convertidor de divisas");
            System.out.println("1) USD a MXN");
            System.out.println("2) MXN a USD");
            System.out.println("3) EUR a MXN");
            System.out.println("4) MXN a EUR");
            System.out.println("5) GBP a MXN");
            System.out.println("6) JPY a MXN");
            System.out.println("7) AUD a MXN");
            System.out.println("8) CAD a MXN");
            System.out.println("9) Salir");
            System.out.println("Elija una opción válida \n");
            System.out.println("\n");

            try {
                option = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                switch (option) {
                    case 1:
                        Convertidor.convertir("USD", "MXN", conversionService, scanner);
                        break;
                    case 2:
                        Convertidor.convertir("MXN", "USD", conversionService, scanner);
                        break;
                    case 3:
                        Convertidor.convertir("EUR", "MXN", conversionService, scanner);
                        break;
                    case 4:
                        Convertidor.convertir("MXN", "EUR", conversionService, scanner);
                        break;
                    case 5:
                        Convertidor.convertir("GBP", "MXN", conversionService, scanner);
                        break;
                    case 6:
                        Convertidor.convertir("JPY", "MXN", conversionService, scanner);
                        break;
                    case 7:
                        Convertidor.convertir("AUD", "MXN", conversionService, scanner);
                        break;
                    case 8:
                        Convertidor.convertir("CAD", "MXN", conversionService, scanner);
                        break;
                    case 9:
                        System.out.println("Cerrando el programa...");
                        break;
                    default:
                        System.out.println("Por favor, ingrese una opción válida (1-9)");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
                option = 0; // Restablecer la opción para evitar un bucle infinito
            } catch (Exception e) {
                System.out.println("Opción no válida");
                break;
            }
        }
        scanner.close(); // Cerrar el scanner al finalizar
    }
}

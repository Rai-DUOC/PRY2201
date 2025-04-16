package exp2_s5_rainiero_morroni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rai
 */
public class Exp2_S5_Rainiero_Morroni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int opcion;
        List<String> entradasCompradas = new ArrayList<>();
        boolean salir = false;

        System.out.println("¡Bienvenido a Teatro Moro!");
        do {
            System.out.println("        ---Menu Principal---");
            System.out.println("Seleccione una opcion para continuar:");
            System.out.println("1. Comprar entradas.");
            System.out.println("2. Revisar promociones activas.");
            System.out.println("3. Busca tus entradas.");
            System.out.println("4. Eliminar una entrada.");
            System.out.println("5. Salir.");
            System.out.println("\n Ingrese su opcion a continuacion: ");
            opcion = sca.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Accediendo a la seccion de compra de entradas...");
                    System.out.println("            MAPA DE ASIENTOS");
                    System.out.println(""); //Linea en blanco.
                    System.out.println("                                            [ESCENARIO]");
                    System.out.println("                                           A  B  C  D  E");
                    System.out.println("Sector 1 - VIP:                           [1][2][3][4][5]");
                    System.out.println("Sector 2 - Platea:                        [1][2][3][4][5]");
                    System.out.println("Sector 3 - Palco:                         [1][2][3][4][5]");
                    System.out.println("");//Linea en blanco.
                    System.out.println("Valores entradas Publico General");
                    System.out.println("Sector VIP: $30.000.-"); //Precio 1
                    System.out.println("Sector Platea: $20.000.-"); //Precio 2
                    System.out.println("Sector Palco: $10.000.-"); //Precio 3
                    System.out.println("");//Linea en blanco.

                    int sector;

                    do {
                        System.out.println("Seleccione el SECTOR deseado:");
                        System.out.println("1. Sector 1 - VIP");
                        System.out.println("2. Sector 2 - Platea");
                        System.out.println("3. Sector 3 - Palco");
                        System.out.println("Ingrese el numero del sector (1-3): ");

                        while (!sca.hasNextInt()) {
                            System.out.println("Ingrese una opcion valida");
                            System.out.println("Ingrese el numero del sector (1-3): ");
                        }

                        sector = sca.nextInt();
                        if (sector < 1 || sector > 3) {
                            System.out.println("Ingrese una opcion valida:");
                        }
                    } while (sector < 1 || sector > 3);

                    int asiento;

                    do {
                        System.out.println("Seleccione el asiento deseado del sector " + sector + ".");
                        System.out.println("1. Asiento 1");
                        System.out.println("2. Asiento 2");
                        System.out.println("3. Asiento 3");
                        System.out.println("4. Asiento 4");
                        System.out.println("5. Asiento 5");
                        System.out.println("Ingrese el numero del asiento (1-5): ");

                        while (!sca.hasNextInt()) {
                            System.out.println("Ingrese una opcion valida");
                            System.out.println("Ingrese el numero del asiento (1-5): ");
                        }

                        asiento = sca.nextInt();
                        if (asiento < 1 || asiento > 5) {
                            System.out.println("Ingrese un asiento valido:");
                        }
                    } while (asiento < 1 || asiento > 5);

                    System.out.println("El asiento seleccionado es el " + asiento + " ubicado en el sector " + sector + ".");

                    int edad;
                    double descuento = 0;
                    // 100% descuento igual o menor de 2 años.
                    // 10% descuento Estudiantes (3-17 años).
                    // 15% descuento Tercera Edad (>59 años).

                    System.out.println(""); //Linea en blanco.
                    System.out.println("Ingrese su edad para consultar por nuestros descuentos: ");
                    edad = sca.nextInt();

                    if (edad < 2) {
                        descuento = 1; // 100% de descuento
                        System.out.println("¡Entrada gratuita! (100% de descuento)");
                    } else if (edad >= 2 && edad < 18) {
                        descuento = 0.1; // 10% de descuento
                        System.out.println("Descuento del 10% aplicado.");
                    } else if (edad >= 60) {
                        descuento = 0.15; // 15% de descuento
                        System.out.println("Descuento del 15% aplicado.");
                    } else {
                        System.out.println("No se aplica ningun descuento.");
                    }

                    double precioSector = 0;
                    double precioFinal = 0;

                    if (sector == 1) {
                        precioSector = 30000;
                    } else if (sector == 2) {
                        precioSector = 20000;
                    } else if (sector == 3) {
                        precioSector = 10000;
                    } else {
                    }

                    precioFinal = precioSector * (1 - descuento);

                    System.out.println("El asiento comprado es el " + asiento + " ubicado en el sector " + sector + ".");
                    System.out.println("Precio base entrada: " + precioSector);
                    System.out.println("Precio final a pagar: " + precioFinal);
                    System.out.println(""); //Linea en blanco.
                    System.out.println("¡Gracias por su compra, disfrute su funcion!");
                    break;
                case 2:
                    System.out.println("Accediendo a la seccion de promociones...");
                    System.out.println("Estudiantes: ¡10% de descuento!");
                    System.out.println("Tercera edad: ¡15% de descuento!");
                    System.out.println("Menores de 2 años: Entrada liberada.");
                    break;
                case 3:
                    System.out.println("Accediendo a la seccion de busqueda...");
                    break;
                case 4:
                    System.out.println("Accediendo a la seccion de eliminacion de entradas...");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida. Por favor, intente nuevamente.");
                    System.out.println(""); //Linea en blanco.
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);

    }

}

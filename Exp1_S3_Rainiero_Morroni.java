package exp1_s3_rainiero_morroni;

import java.util.Scanner;

/**
 *
 * @author Rai
 */
public class Exp1_S3_Rainiero_Morroni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //•	Tipo de entrada (VIP, platea baja, platea alta o palco)
        //•	Tarifa (estudiante o público general)
        //•	Valor de la tarifa
        //                          Estudiante	Público general
        //VIP                     $20.000	$30.000
        //Platea alta	$9.000	$18.000
        //Platea baja	$10.000	$15.000
        //Palcos	$6.500	$13.000

        Scanner sca = new Scanner(System.in);
        int tarifaGeneral = 0; // Inicializar tarifaGeneral.
        int descuento1 = 10000; //Descuento para entrada VIP.
        int descuento2 = 2; //Descuento para entrada Platea alta y palco.
        int descuento3 = 5000; //Descuento para entrada Platea baja.

        System.out.println("¡Bienvenido/a a Teatro Moro!");

        System.out.println("Indique el tipo de entrada deseada (VIP, Platea alta, Platea baja o Palco)");
        String tipoEntrada = sca.nextLine();

        System.out.println("¿Tiene descuento de Estudiante? Indicar Si o No:");
        String promo = sca.nextLine();

        if ("VIP".equalsIgnoreCase(tipoEntrada) && ("Si".equalsIgnoreCase(promo))) {
            tarifaGeneral = (30000 - descuento1);
        } else if ("VIP".equalsIgnoreCase(tipoEntrada) && "No".equalsIgnoreCase(promo)) {
            tarifaGeneral = 30000;

        } else if ("Platea alta".equalsIgnoreCase(tipoEntrada) && ("Si".equalsIgnoreCase(promo))) {
            tarifaGeneral = (18000 / descuento2);
        } else if ("Platea alta".equalsIgnoreCase(tipoEntrada) && "No".equalsIgnoreCase(promo)) {
            tarifaGeneral = 18000;

        } else if ("Platea baja".equalsIgnoreCase(tipoEntrada) && ("Si".equalsIgnoreCase(promo))) {
            tarifaGeneral = (15000 - descuento3);
        } else if ("Platea baja".equalsIgnoreCase(tipoEntrada) && "No".equalsIgnoreCase(promo)) {
            tarifaGeneral = 15000;

        } else if ("Palco".equalsIgnoreCase(tipoEntrada) && ("Si".equalsIgnoreCase(promo))) {
            tarifaGeneral = (13000 / descuento2);
        } else if ("Palco".equalsIgnoreCase(tipoEntrada) && "No".equalsIgnoreCase(promo)) {
            tarifaGeneral = 13000;
                   
        } else {
            System.out.println("Tipo de entrada o descuento no valido.");
        }
        
        System.out.println("El total a pagar por su entradáá es de: $" + tarifaGeneral + ".-");
        System.out.println("Gracias por su compra, disfrute la funcion");

    }
}

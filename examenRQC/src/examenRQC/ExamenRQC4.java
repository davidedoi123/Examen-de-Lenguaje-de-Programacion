
package examenRQC;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class ExamenRQC4 {
public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ClientesAtendidos;
        double TotaldelaCompra, TotaldeVentas;
        String TeclaRepetir;
        ClientesAtendidos = 0;
        TotaldeVentas = 0;
        do {
            System.out.print("Ingrese el valor de total de la compra: ");
            TotaldelaCompra = in.nextDouble();
            in.nextLine();
            TotaldeVentas = TotaldeVentas + TotaldelaCompra;
            ClientesAtendidos = ClientesAtendidos + 1;
            System.out.println();
            do {
                System.out.print("\u00BFDesea repetir el proceso? (S/N): ");
                TeclaRepetir = in.nextLine();
            } while (!TeclaRepetir.equalsIgnoreCase("s") && !TeclaRepetir.equalsIgnoreCase("n"));
        } while (TeclaRepetir.equalsIgnoreCase("s"));
        System.out.println("Valor de clientes atendidos: " + ClientesAtendidos);
        System.out.println("Valor de total de ventas al Dia: " + TotaldeVentas);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodedatos;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fjsaca2001
 */
public class ManejoDeDatos {

    public static void leerRegistros() {
        // TODO code application logic here
        double suma1 = 0, suma2 = 0, c = 0;
        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("tabula-FWC_2018_Squadlists_4.csv"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                       // Cambio de los datos tipo cadea a dobles
                double dato1 = Double.parseDouble(linea_partes.get(9));
                double dato2 = Double.parseDouble(linea_partes.get(11));
                // Suma repetitiva para despues poder dividir
                suma1 += dato1;
                suma2 += dato2;
                // Contador que nos servira como dividendo
                c++;

            } // fin de while
            entrada.close();
            // Calculo de los promedios
            double prom1 = suma1 / c;
            double prom2 = suma2 / c;
            // Presentacion de los resultados
            System.out.printf("El promedio del hegt es: %.2f", prom1);
            System.out.printf("\nEl promedio del goals es : %.2f", prom2);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }// fin de catch
    }// fin del m�todo leerRegistros
}// cierra el archivo y termina la aplicaci�n

    

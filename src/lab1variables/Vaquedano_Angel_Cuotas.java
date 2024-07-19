/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1variables;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_Cuotas {
    public static void main(String[] args) {
      Scanner lea=new Scanner(System.in);
      lea.useDelimiter("\n");
      
      System.out.println("Favor ingrese el monto del prestamo hecho: ");
      double prestamo=lea.nextDouble();
      System.out.println("Ingrese en cuantos meses se realizará el pago: ");
      int meses=lea.nextInt();
      System.out.println("Favor ingrese el pocentaje de la tasa de interés del prestamo: ");
      double tasainteresespor=lea.nextDouble()/100;
      System.out.println("Favor ingrese el porcentaje de comision realizada por mes: ");
      double comisionpor=lea.nextDouble()/100;
      System.out.println("Favor ingrese el porcentaje del seguro mensual por mes: ");
      double seguropor=lea.nextDouble()/100;
      
      double cuotames=(prestamo/meses);
      double intereses=(cuotames*tasainteresespor);
      double comision=(cuotames*comisionpor);
      double seguro=(cuotames*seguropor);
      
      double cuotatotal=(cuotames+(intereses+comision+seguro));
     
      System.out.println("**** CUOTAS MENSUALES *****"+
              "\n Cuota de Pago Mensual: HNL "+cuotames+
              "\n Total a Pagar: HNL "+cuotatotal);
      
      
      
    }
    
}

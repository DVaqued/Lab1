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
public class Vaquedano_Angel_Clics {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        lea.useDelimiter("\n");
        System.out.println("Favor ingrese la cantidad total de clics: ");
        int cantidadtotalclics=lea.nextInt();
        System.out.println("Favor ingrese la primera cantidad total de clics: ");
        int cantidadtotal1=lea.nextInt();
        System.out.println("Favor ingrese el precio por cada clic de la primera cantidad de clics: ");
        double precio1=lea.nextDouble();
        System.out.println("Favor ingrese la segunda cantidad de clics: ");
        int cantidadtotal2=lea.nextInt();
        System.out.println("Favor ingrese el precio por cada clic de la segunda cantidad de clics: ");
        double precio2=lea.nextDouble();
        System.out.println("Favor ingrese la tercera cantidad de clics: ");
        int cantidadtotal3=lea.nextInt();
        System.out.println("Favor ingrese el precio por cada clic de la tercera cantidad de clics: ");
        double precio3=lea.nextDouble();
        
        double total1=(cantidadtotal1*precio1);
        double total2=(cantidadtotal2*precio2);
        double total3=(cantidadtotal3*precio3);
        
        double cantidadtotal=(total1+total2+total3);
        double ISV=(cantidadtotal*0.16);
        
        System.out.println("Su total de clics es "+cantidadtotalclics+" con un total de $"+String.format("%,.2f",cantidadtotal)+" + ISV de $"+String.format("%,.2f",ISV));
        }
}
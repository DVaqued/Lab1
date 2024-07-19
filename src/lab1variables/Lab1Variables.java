/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1variables;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Lab1Variables {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
                lea.useDelimiter("\n");
        System.out.println("Favor ingrese el nombre del empleado: ");
        int NombreEmpleado=lea.nextInt();
        System.out.println("Ingresar horas de trabajo mensual: ");
        int HorasTrab=lea.nextInt();
        System.out.println("Favor ingrese la tarifa por hora: ");
        double tarifaph=lea.nextDouble();
        
        double salariosem=(HorasTrab*tarifaph)/4;
    }
    
}

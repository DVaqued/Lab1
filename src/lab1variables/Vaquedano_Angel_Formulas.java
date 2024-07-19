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
public class Vaquedano_Angel_Formulas {
    public static void main(String[] args) {
      Scanner lea=new Scanner(System.in);
      lea.useDelimiter("\n");
      double ejera=((3/2)+(4/3));
      System.out.println("La respuesta del ejercicio a es: "+String.format("%,.2f",ejera));
      System.out.println("-----------------------------------------------------------------");
      System.out.println("Favor ingrese la varible x del ejercicio b: ");
      double varx=lea.nextDouble();
      System.out.println("Favor ingrese la variable y: ");
      double vary=lea.nextDouble();
      System.out.println("La respuesta del ejercicio b es "+String.format("%,.2f",((1/(varx-vary)-(3*varx*vary)/4))));
      
      System.out.println("-----------------------------------------------------------------");
      double ejerc=((1/2)+7);
      System.out.println("La repuesta del ejercicio c es "+ejerc);
      double ejerd=(7+(1/2));
      
      System.out.println("-----------------------------------------------------------------");
      System.out.println("La repuesta del ejercicio d es "+ejerd);
      System.out.println("Favor ingrese la variable a del ejercicio e: ");
      double vara=lea.nextDouble();
      System.out.println("Favor ingrese la variable b del ejercicio e: ");
      double varb=lea.nextDouble();
      System.out.println("Favor ingrese la variable c del ejercicio e: ");
      double varc=lea.nextDouble();
      System.out.println("Favor ingrese la variable d del ejercicio e: ");
      double vard=lea.nextDouble();
      System.out.println("Favor ingrese la variable e del ejercicio e: ");
      double vare=lea.nextDouble();
      System.out.println("Favor ingrese la variable f del ejercicio e: ");
      double varf=lea.nextDouble();
      System.out.println("Favor ingrese la variable g del ejercicio e: ");
      double varg=lea.nextDouble();
      System.out.println("Favor ingrese la variable h del ejercicio e: ");
      double varh=lea.nextDouble();
      System.out.println("Favor ingrese la variable j del ejercicio e: ");
      double varj=lea.nextDouble();
      
      double ejere=((vara*vara)/(varb-varc)+((vard-vare)/varf-((varg*varh)/varj)));
      System.out.println("La respuesta del ejercicio e es: "+ejere);
      
      System.out.println("-----------------------------------------------------------------");
      System.out.println("Favor ingrese la variable m del ejercicio g: ");
      double varm=lea.nextDouble();
      System.out.println("Favor ingrese la variable n del ejercicio g: ");
      double varn=lea.nextDouble();
      System.out.println("Favor ingrese la variable p del ejercicio g: ");
      double varp=lea.nextDouble();
      System.out.println("Favor ingrese la variable q del ejercicio g: ");
      double varq=lea.nextDouble();
      
      double ejerg=(varm+(varn/(varp-varq)));
      System.out.println("La repuesta del ejercicio g es "+ejerg);
      
     System.out.println("-----------------------------------------------------------------");

     
    }
}

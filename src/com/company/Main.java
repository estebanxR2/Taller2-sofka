package com.company;
/**
 * Creacion de naves espaciales atraves de POO
 * @autor Jair Rincon  -  jairesrival@gmail.com
 */

import java.util.Scanner;

public class Main {
    /**
     *
     * @param args Array de Strings que debe aparecer obligatoriamente como argumento del método main
     */
    public static void main(String[] args) {
        /* se crea una variable x entero para utilizar en el while si x es menor que 4 se cumplira otro ciclo hasta que este sea mayor que la condicion */
       int x = 1;
        while (x<=4) {
            /**
             + se impprime las opciones para le seleccion del usuario
             */
            System.out.print("""
                \nSelect a spacecraft:\s
                a.SHUTTLE VEHICLES
                b.UNMANNED SPACECRAFT
                c.MANNED SPACECRAFTS
                R/:""");
            /**
             * input: lectura de seleccion del usuario y es esta variable es de tipo char
             */
            Scanner input= new Scanner(System.in);
            char option1=input.nextLine().charAt(0);
            /* switch case: forma sencilla de enviar la ejecución a diferentes partes del código segun la seleccion del usuario*/
            switch (option1) {
                case 'a' -> {/* si el usuario copia c entraria en este caso*/
                    System.out.print("\n/////SHUTTLE VEHICLES/////\n");
                    System.out.print("\nenter the model of the shuttle vehicles: ");
                    String model = input.nextLine();
                    System.out.print("\nenter the type of fuel: ");
                    String fuel = input.nextLine();
                    System.out.print("\nenter the weight(#): ");
                    int weight = input.nextInt();
                    shuttle_vehicles shuttle_vehicles1 = new shuttle_vehicles(model, fuel, weight);
                    System.out.println(shuttle_vehicles1.show());
                    shuttle_vehicles1.full();
                }
                /* si el usuario copia b entraria en este caso*/
                case 'b' -> {
                    System.out.print("\n/////UNMANNED SPACECRAFT/////\n");
                    System.out.print("\nenter the model of the shuttle vehicles: ");
                    String model = input.nextLine();
                    System.out.print("\nenter the type of fuel: ");
                    String fuel = input.nextLine();
                    System.out.print("\nenter the planets that can be approached by the spacecraft: ");
                    String planets = input.nextLine();
                    unmanned_spacecraft unmanned_spacecraft = new unmanned_spacecraft(model, fuel, false, planets);
                    System.out.println(unmanned_spacecraft.show());
                }
                /* si el usuario copia c entraria en este caso*/
                case 'c' -> {
                    System.out.print("\n/////MANNED SPACECRAFTS/////\n");
                    System.out.print("\nenter the model of the shuttle vehicles: ");
                    String model = input.nextLine();
                    System.out.print("\nenter the type of fuel: ");
                    String fuel = input.nextLine();
                    manned_spacecraft manned_spacecraft = new manned_spacecraft(model, fuel, true);
                    System.out.println(manned_spacecraft.show());
                }
                default -> System.out.print("You have entered the wrong option\n");
            }
            /* Pregunta al usuario para continuar o no en la creacion de spacecraft*/
            System.out.print("\ndo you want to continue creating ships or leave? (y/n): \s");
            char option2 = input.next().charAt(0);
            //input.close();
            switch (option2) {
                case 'y' -> x ++;
                case 'n' -> x = 5;
                default -> System.out.print("You have entered the wrong option\n");
            }

        }
    }
}

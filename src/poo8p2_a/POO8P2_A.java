/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8p2_a;

/**
 * Clase import para utilizar el Scanner 
 */
import java.util.Scanner;
/**
 *
 * @author Gonzalez De Luna
 */
public class POO8P2_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /**
         * Declaración de variables 
         */
        float area;
        int opcion;
        final float PI = 3.1416f;
        
        /**
         * @new Creación de constructor
         */
        Scanner sc = new Scanner(System.in);
        
        /**
         * Crea un menú para preguntar qué opción desea
         */
        do
        {
            System.out.println("\n Elige una opción");
            System.out.println("1. Área del circulo");
            System.out.println("2. Área del triángulo");
            System.out.println("3. Área del cuadrado");
            System.out.println("4. Salir\n");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1: 
                    //Circulo
                    System.out.println("Seleccionó el círculo");
                    float radio = 15;
                    area = PI * radio * radio;
                    break;
                case 2: 
                    //Triángulo 
                    System.out.println("Seleccionó el triángulo");
                    float base = 8, altura = 5;
                    area = (base * altura) / 2;
                    break;
                case 3: 
                    //Cuadrado
                    System.out.println("Seleccionó el cuadrado");
                    float lado = 10;
                    area = lado * lado;
                    break;
                case 4: 
                    //Salir 
                    System.out.println("Hasta luego !! :)");
                    continue;
                default:
                    //Ninguno de los anteriores
                    System.out.println("Su elección no es correcta");
                    continue;
            }
            System.out.println("El área es: " + area);
            } while (opcion != 4);
        /**
         * Cierra el escaner
         */
        sc.close();
    }
    
}

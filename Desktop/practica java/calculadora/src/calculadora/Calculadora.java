/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int eleccion;
        float num1, num2, resultado;
        
        System.out.println("Bienvenido" + "\n" +"Por favor ingrese una opcion:" + "\n" + "1) Suma"
        + "\n" + "2) Resta" + "\n" + "3) Multiplicacion "+ "\n"+ "4) Division");//le da la opcion al usuario a poder elegir que operacion desea realizar
        
        eleccion = entrada.nextInt();//guarda la eleccion seleccionada
        
        switch(eleccion)
        {
            case 1://operacion de suma
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                resultado = num1 + num2;
                System.out.println("el resultado de su sumas es: "+ resultado);
            break;
        
            case 2:// operacion de resta
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                resultado = num1 - num2;
                System.out.println("el resultado de su resta es: "+ resultado);
            break;         
            
            case 3://operacion de multiplicacion
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                resultado = num1 * num2;
                System.out.println("el resultado de su multiplicacion es: "+ resultado);
            break;
            
            case 4://operacion de division
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextFloat();
                resultado = num1 / num2;
                System.out.println("el resultado de su division es: "+ resultado);
            break;
            
            default:// en caso de no elegir una opcion correcta notifica al usuario
                System.out.println("opcion incorrecta"); 
        }
    }
    
}

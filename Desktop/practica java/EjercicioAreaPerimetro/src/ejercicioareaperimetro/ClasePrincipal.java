/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioareaperimetro;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class ClasePrincipal {


    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bandera = 0;// la bandera es para accionar el do-while.
        int seleccion = 0;// seleccion de opciones del menu.
        
        do{
            do{
               System.out.println("elija la opcion:"
                    + "\n" + "1. calcular area y perimetro de cuadrilatero."
                    + "\n" + "2. calcular area y perimetro de triangulo."
                    + "\n" + "3.calcular area y perimetro de circulo."
                    + "\n" + "4.para salir.");//menu de elecciones
            seleccion = entrada.nextInt();//guarda en seleccion la opcion elejida por el usuario 
            if (seleccion >=1 && seleccion <=4){/* si la opcion esta entre la opciones 1 o 4 
                                                la bandera pasa a ser 1 para cummplir con la
                                                condicion del do-while*/
                bandera = 1;
            }else{//si el usuario ingresa una opcion erronea, notifica de lo sucedido
                System.out.println("por favor ingrese una opcion entre 1 o 4");
                    }           
            }while(bandera == 0);
            if(seleccion == 1){//eleccion cuadrilatero
                Cuadrilatero c1;//generacion de objeto de clase Cuadrilatero
                float lado1, lado2;//atributos que van a mandar los datos a cuadrilatero
                System.out.println("Por favor ingrese el primer lado: ");
                lado1 = entrada.nextFloat();//primer dato ingresado
                System.out.println("Por favor ingrese el segundo lado: ");
                lado2 = entrada.nextFloat();//segundo dato ingresado
                if (lado1 == lado2){// si es un cuadrado ambo lados son iguales, ingresa solo un lado
                    c1 = new Cuadrilatero(lado1);
                }else{//si es un rectangulo ingresa los dos lados
                    c1 = new Cuadrilatero(lado1, lado2);
                }
                System.out.println("El perimetro es :" + c1.getPerimetro());
                System.out.println("El area es: " + c1.getArea());
            }
        }while(bandera != 2);
    }
    
}

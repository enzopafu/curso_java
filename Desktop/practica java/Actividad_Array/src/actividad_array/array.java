/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_array;

import java.util.Scanner;

/**
 *
 * @author Enzo
 */
public class array {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); // permite la entrada por teclado de los datos.
        
        int bandera = 0;// utilizamos la bandera para que el do-while.
        
        int seleccion = 0;/*utilizamos la seleccion para poder generar un menu en el cual el
        usuario deba elegir una opcion */
        
        float [] array_numeros = new float [5];//almacena 5 datos numericos en el array
        String [] array_nombres = new String[5];//almacena 5 datos de cadena en el array
        do{/*utilizamos el do-while para generar un menu donde el usuario elija que opcion
            desea realizar */
            do{
            System.out.println("elija la opcion:"
                    + "\n" + "1. para ingresar 5 numeros"
                    + "\n" + "2. para para ingresar 5 nombres"
                    + "\n" + "3. para salir.");//menu de elecciones
            seleccion = entrada.nextInt();//guarda en seleccion la opcion elejida por el usuario
            if (seleccion >=1 && seleccion <=3){/* si la opcion esta entre la opciones 1 o 3 
                                                la bandera pasa a ser 1 para cummplir con la
                                                condicion del do-while*/
                bandera = 1;
            }else{//si el usuario ingresa una opcion erronea, notifica de lo sucedido
                System.out.println("por favor ingrese una opcion entre 1 o 3");
                    }           
            }while(bandera == 0);
            
            if (seleccion == 1){/* si el usuario elije la eleccion uno pide 5 numeros y lo 
                                   muestra de manera invertida*/
                for (int i =0;i<5;i++) {//solicita el ingreso de 5 numeros
            System.out.print(" ingrese el n°"+(i+1)+" : ");
            array_numeros[i] = entrada.nextInt();
                }
                for (int i=4; i>=0;i--) {//muestra los 5 numeros de manera invertida
            System.out.println(array_numeros[i]);            
                }
            }else if ( seleccion == 2){/* si el usuario elije la eleccion dos pide 5 nombres y lo 
                                   muestra de manera invertida*/
                for (int i = 0;i<5;i++) {//solicita el ingreso de 5 nombres
            System.out.print(" ingrese el "+(i+1)+"° nombre : ");
            array_nombres[i] = entrada.next();/* en este caso usamos .next en vez de nextLine
                                                 porque si usamos este ultimo nos saltea el 1°
                                                 ingreso.*/
                }
                for (int i=4; i>=0;i--) {//muestra los 5 nobres de manera invertida
            System.out.println(array_nombres[i]);            
                }
            }
        }while (bandera != 2);
    }
}
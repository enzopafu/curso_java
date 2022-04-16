
package operaciones;

import java.util.Scanner;

public class ClasePadre {
    protected float valor1;
    protected float valor2;
    protected float resultado;
    Scanner entrada = new Scanner(System.in);
    //pide los datos
    public void PedirDatos(){
        System.out.print("Por favor ingresar el primer numero: ");
        valor1 = entrada.nextFloat();
        System.out.print("Por favor ingresar el segundo numero: ");
        valor2 = entrada.nextFloat();
       
    }
    //muestra el resultado de la operacion realizada
    public void MostrarResultado(){
        System.out.println(resultado);
    } 
}

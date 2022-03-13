package clase;

import java.util.Scanner;

public abstract class ClasePadreMenu {

    protected int transaccion, deposito, retiro;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Menu() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Por favor seleccione: ");
                System.out.println("    1. Si desea consultar saldo.");
                System.out.println("    2. Si desea realizar una extraccion.");
                System.out.println("    3. Si desea realizar un deposito.");
                System.out.println("    4. Si desea salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Porfavor vuelva a intentar con una de las opciones descriptas");
                    System.out.println("-------------------------------------------------------------");
                }

            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadreMenu mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            } else if (seleccion == 2) {
                ClasePadreMenu mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            } else if (seleccion == 3) {
                ClasePadreMenu mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("------------------------------------------");
                System.out.println("Gracias por usar el sistema, vuelva pronto");
                System.out.println("------------------------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    public void Retiro() {
        retiro = entrada.nextInt();
    }
    
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    public abstract void Transacciones();
    
    public void setSaldo (int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return(saldo);
    }
}

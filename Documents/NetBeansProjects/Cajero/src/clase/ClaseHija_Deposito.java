package clase;

public class ClaseHija_Deposito extends ClasePadreMenu {

    @Override
    public void Transacciones() {
        System.out.print("Por favor ingrese el monto a depositar: $");
        Deposito();

        transaccion = getSaldo();
        setSaldo(transaccion + deposito);
        System.out.println("*************************************************************************");
        System.out.println("usted deposito: $" + deposito + " su saldo actual es de: $" + getSaldo());
        System.out.println("*************************************************************************");
    }

}

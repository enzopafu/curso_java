
package clase;

public class ClaseHija_Consulta extends ClasePadreMenu {
   @Override
   public void Transacciones(){
       System.out.println("***********************************");
       System.out.println("Su saldo actual es: $" + getSaldo());
       System.out.println("***********************************");
   }
}


package clase;
 class ClaseHija_Retiro extends ClasePadreMenu{
     
     @Override
     public void Transacciones(){
         System.out.print("Por favor ingrese el monto a retirar: $");
         Retiro();
         if (retiro <= getSaldo()){
             transaccion = getSaldo();
             setSaldo(transaccion - retiro);
             System.out.println("********************************************************************");
             System.out.println("Su saldo actual es de: $"+ getSaldo() + " usted retiro: $" + retiro);
             System.out.println("********************************************************************");
         }else{
             System.out.println("**************************");
             System.out.println("Su saldo es insuficiente.");
             System.out.println("**************************");
         }
     }
    
}

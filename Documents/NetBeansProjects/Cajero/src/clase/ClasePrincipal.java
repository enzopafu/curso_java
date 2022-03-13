
package clase;

public class ClasePrincipal {

    public static void main(String[] args) {
        ClasePadreMenu mensajero = new ClaseHija_Consulta();
        mensajero.setSaldo(0);
        mensajero.Menu();
    }
    
}

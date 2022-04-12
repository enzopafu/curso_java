
package ejercicioareaperimetro;

public class Circulo {
    //atributo
    private float radio;
    
    //metodos
    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float getCircunferencia(){
        float circunferencia = (float) (2*Math.PI*radio);
        return circunferencia;
    }
    
    public float getArea(){
        float area = (float) (Math.PI*(radio*radio));
        return area;
    }
}

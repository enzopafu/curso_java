
package ejercicioareaperimetro;

public class Cuadrilatero {
   //atributos
    private float lado1;
    private float lado2;

    //Contructor
    public Cuadrilatero(float lado1, float lado2) {//constructor rectangulo
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {//constructor cuadrado
        this.lado1 = lado1;
    }
    
    public float getPerimetro(){//construtor calculo perimetro
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    public float getArea(){//constructor calculo area
        float area = (lado1*lado2);
        return area;
    }
}

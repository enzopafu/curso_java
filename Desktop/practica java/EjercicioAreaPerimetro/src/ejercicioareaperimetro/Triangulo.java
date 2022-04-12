
package ejercicioareaperimetro;

public class Triangulo {
    //atributos
    private float lado1;
    private float lado2;
    private float lado3;
    
    //metodos

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public float getPerimetro(){//perimetro
        float perimetro = (lado1 + lado2 + lado3);
        return perimetro;
    }
    
    public float getArea(){//area
        float heron = (lado1+lado2+lado3)/2; // heron es una formula para sacar el area del triangulo con sus 3 lados, primero saca el semiperimetro
        float area = (float) Math.sqrt(heron*(heron - lado1)*(heron - lado2)*(heron - lado3));/*la formula es raiz cuadradade semiperimitro multiplicada
                                                                                                 por la resta del semiperimetro por el lado*/
        return area;
    }
}

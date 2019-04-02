package hometask7.Model;

public class Triangle extends Shape {
    public float a;
    public float b;
    public float c;

    public Triangle(String color, float a, float b, float c) {
        super(color);
        if( (a < 0 || b < 0|| c < 0)|| (a+b<=c)||(a+c<=b)||(c+b<+a)){
            System.out.println("Vary vary bad input");
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString(){
        return super.toString() +
                ", side A=" + a +
                ", side B=" + b +
                ", side C=" + c;
    }

    @Override
    public float calcArea() {
        float p = (a + b + c)/2;
        return (float)(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}

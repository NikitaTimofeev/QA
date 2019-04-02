package hometask7.Model;

public class Circle extends Shape {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(String color, float radius) {
        super(color);
        if(radius > 0){
            this.radius = radius;    
        }
        else{
            System.out.println("Bad data, radius cannot be < 0");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius;
    }

    @Override
    public float calcArea(){
        return(float)Math.PI*radius*radius;
    }
}

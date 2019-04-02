package hometask7.Model;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(String color, float width, float height) {
        super(color);
        if( width < 0 || height < 0){
            System.out.println("BAD DATA");
        } else{
            this.width = width;
            this.height = height;
        }    
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width = " + width +
                ", height = " + height;
    }

    @Override
    public float calcArea() {
        return width*height;
    }

}

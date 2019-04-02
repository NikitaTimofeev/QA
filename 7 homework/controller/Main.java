package hometask7.Controller;


import hometask7.Model.Circle;
import hometask7.Model.Rectangle;
import hometask7.Model.Shape;
import hometask7.Model.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = createShapes();
        showShapes(figures);
        System.out.println("Sum of all areas " + getFiguresArea(figures));
        System.out.println(" Sum of triangles areas " + getSumAreas(figures)[0]+ "\n"+
                " Sum of circles areas " + getSumAreas(figures)[1]+"\n"+
                " Sum of rectangles areas " + getSumAreas(figures)[2]);
    }
    public static Shape[] createShapes(){
        return new Shape[]{
                new Rectangle("White",10,12),
                new Rectangle("Black",1,12),
                new Rectangle("Red",1,1),
                new Rectangle("Blue",10,1),
                new Circle("White",5),
                new Circle("Black",1),
                new Circle("Black",10),
                new Triangle("Black",8,3,10),
                new Triangle("White",10,3,10)
        };
    }

    public static void showShapes(Shape[] figures){
        for (Shape shape:figures){
            System.out.println(shape.toString());
        }
    }

    public static float getFiguresArea(Shape[] figures){
        float sum = 0.0f;
        for (Shape shape:figures){
            sum +=shape.calcArea();
        }
        return sum;
    }

    public static float[] getSumAreas(Shape[] figures){
        float areaTriandle = 0.0f;
        float areaCircle = 0.0f;
        float areaRectangle = 0.0f;
        for (Shape shape: figures){

            if(shape instanceof Triangle){
                areaTriandle += shape.calcArea();
            }
            else if (shape instanceof Circle){
                areaCircle += shape.calcArea();
            }
            else {areaRectangle += shape.calcArea();}
        }
        return new float[]{areaTriandle,areaCircle,areaRectangle};
    }
}

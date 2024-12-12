package Model;

import java.awt.*;
import java.util.Random;

public class ShapeFactory {

    public Shape getShape(String name, Random rand, double width, double height, double radius, Color color) {
        Shape shape = null;

        // Shape choose
        switch (name) {
            case "Circle":
                shape = new Circle(new Point(rand.nextInt(200), rand.nextInt(200)), radius, color);
                break;
            case "Square":
                shape = new Square(new Point(rand.nextInt(200), rand.nextInt(200)), width, color);
                break;
            case "Rectangle":
                shape = new Rectangle(new Point(rand.nextInt(200), rand.nextInt(200)), width, height, color);
                break;
        }

        return shape;
    }
}

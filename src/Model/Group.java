package Model;

import java.util.ArrayList;

public class Group {
    ArrayList<Shape> GroupShapes;

    public Group() {
        GroupShapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        GroupShapes.add(shape);
    }
}

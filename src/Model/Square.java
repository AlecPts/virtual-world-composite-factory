package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Square extends Shape {
    // Attribute
    private Point center;
    private double size;
    Color color;

    public Square(Point center, double size, Color color) {
        this.center = center;
        this.size = size;
        this.color = color;
    }

    @Override
    public java.awt.Rectangle getBox() {
        return new java.awt.Rectangle((int)(center.x), (int)(center.y), (int)(size), (int)(size));
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString(int padding) {
        String str = new String();

        str += getType() + "(" + center +")";

        return str;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(center.x,center.y,(int)size,(int)size);
        g.setColor(Color.black);
        g.drawRect(center.x,center.y,(int)size,(int)size);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        return new DefaultMutableTreeNode(getType()+ "(Center["+center.x+", "+center.y +"], W["+size+"], H["+size+"]");
    }
}

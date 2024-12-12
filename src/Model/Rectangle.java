package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Rectangle extends Shape {
    // Attribute
    private Point center;
    private double width;
    private double height;
    Color color;

    public Rectangle(Point center, double width, double height, Color color) {
        this.center = center;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public java.awt.Rectangle getBox() {
        return new java.awt.Rectangle((int)(center.x), (int)(center.y ), (int)(width), (int)(height));
    }

    @Override
    public String getType() {
        return "Rectangle";
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
        g.fillRect(center.x,center.y,(int)width,(int)height);
        g.setColor(Color.black);
        g.drawRect(center.x,center.y,(int)width,(int)height);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        return new DefaultMutableTreeNode(getType()+ "(Center["+center.x+", "+center.y +"], W["+width+"], H["+height+"]");
    }
}

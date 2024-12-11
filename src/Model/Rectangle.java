package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Rectangle extends Shape {
    // Attribute
    private Point center;
    private double radius;
    Color color;

    public Rectangle(Point center, double radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public java.awt.Rectangle getBox() {
        return new java.awt.Rectangle((int)(center.x), (int)(center.y ), (int)(radius), (int)( radius));
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
        g.fillOval(center.x,center.y,(int)radius,(int)radius);
        g.setColor(Color.black);
        g.drawOval(center.x,center.y,(int)radius,(int)radius);
    }

    @Override
    public DefaultMutableTreeNode getJTreeNodes() {
        return new DefaultMutableTreeNode(getType()+ "(Center["+center.x+", "+center.y +"], R["+radius+"]");
    }
}

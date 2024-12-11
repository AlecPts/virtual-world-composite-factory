package Model;

import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.Rectangle;

public abstract class Shape {
    // Methods
    public abstract Rectangle getBox();
    public abstract String getType();
    public abstract String toString(int padding);
    public abstract void draw(Graphics g);
    public abstract DefaultMutableTreeNode getJTreeNodes();

}


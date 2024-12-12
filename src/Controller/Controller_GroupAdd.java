package Controller;

import Model.Group;
import Model.Shape;
import Model.ShapeFactory;
import Model.ShapeManager;

import javax.swing.*;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.Random;

public class Controller_GroupAdd {
    private final TreePath[] treePath;

    public Controller_GroupAdd(TreePath[] tp) {
        treePath = tp;
    }

    public void control() {
        for (TreePath path : treePath) {
            Group group = new Group();
            group.addShape((Shape) path.getLastPathComponent());
        }
    }
}

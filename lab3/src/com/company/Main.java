package com.company;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame JFrame = getFrame();
        JFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {

            Font font1 = new Font("Times New Roman", Font.ITALIC, 18);
            Color c1 = new Color(94, 88, 88);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font1);
            g2.setColor(c1);
            g2.drawString("Lidiia Havrylian, PP-42", 20, 20);


            Polygon p1 = new Polygon();
            p1.addPoint(270, 239);
            p1.addPoint(350, 230);
            p1.addPoint(420, 200);
            p1.addPoint(390, 160);
            p1.addPoint(340, 130);
            p1.addPoint(270, 239);
            g.setColor(Color.red);
            g2.fill(p1);
            g.drawPolygon(p1);
            g2.setColor(c1);
            g2.drawString("Polygon, red", 290, 270);

            Polygon p2 = new Polygon();
            p2.addPoint(50, 130);
            p2.addPoint(100, 50);
            p2.addPoint(150, 130);
            g.setColor(Color.blue);
            g2.fill(p2);
            g.drawPolygon(p2);
            g2.setColor(c1);
            g2.drawString("Triangle, blue", 50, 150);

            Ellipse2D ed = new Ellipse2D.Double(600.0d, 100.0d,
                    120.0d, 80.0d);
            g.setColor(Color.green);
            g2.fill(ed);
            ((Graphics2D) g).draw(ed);
            g2.setColor(c1);
            g2.drawString("Ellipse, green", 620, 220);

        }
    }
    static JFrame getFrame() {
        JFrame JFrame = new JFrame() {
        };
        JFrame.setVisible(true);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFrame.setSize(500, 500);
        // JFrame.setLocation(500,180);
        JFrame.setTitle("lab 4");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        JFrame.setBounds(dimension.width / 2 - 450, dimension.height / 2 - 350, 900, 700);
        return JFrame;
    }
}

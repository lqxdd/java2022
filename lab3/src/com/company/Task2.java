package com.company;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame JFrame = getFrame();
        JFrame.add(new MyComponent());
       /* String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String s:fonts){
            System.out.println(s);
        }*/
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Times New Roman", Font.BOLD, 30);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("season temperature diagram", 320, 50);
            Font font1 = new Font("Times New Roman", Font.PLAIN, 18);
            g2.setFont(font1);
            g2.drawString("temperature", 30, 90);
            g2.drawString("season", 580, 550);
            g2.drawString("0", 70, 580);
            g2.drawString("winter", 165, 580);
            g2.drawString("spring", 265, 580);
            g2.drawString("summer", 365, 580);
            g2.drawString("autumn", 465, 580);
            g2.drawString("-10", 30, 495);
            g2.drawString("0", 35, 435);
            g2.drawString("+10", 30, 375);
            g2.drawString("+20", 30, 315);
            g2.drawString("+30", 30, 255);
            g2.drawString("+40", 30, 195);

            Point2D p1 = new Point2D.Double(70, 120);
            Point2D p2 = new Point2D.Double(70, 550);
            Line2D l2 = new Line2D.Double(p1, p2);
            Line2D l1 = new Line2D.Double(70, 550, 560, 550);
           g2.setStroke(new BasicStroke(6f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
            g2.setColor(Color.BLACK);
            g2.draw(l2);
            g2.draw(l1);
            Line2D lw = new Line2D.Double(60, 130, 70, 120);
            g2.draw(lw);
            Line2D lw1 = new Line2D.Double(70, 120, 80, 130);
            g2.draw(lw1);
            Line2D lw111 = new Line2D.Double(550, 540, 560, 550);
            g2.draw(lw111);
            Line2D lw11 = new Line2D.Double(560, 550, 550, 560);
            g2.draw(lw11);



            Line2D l3 = new Line2D.Double(170, 540, 170, 560);
            Line2D l4 = new Line2D.Double(270, 540, 270, 560);
            Line2D l5 = new Line2D.Double(370, 540, 370, 560);
            Line2D l6 = new Line2D.Double(470, 540, 470, 560);
            g2.draw(l3);
            g2.draw(l4);
            g2.draw(l5);
            g2.draw(l6);
            Line2D l7 = new Line2D.Double(60, 490, 80, 490);
            Line2D l8 = new Line2D.Double(60, 430, 80, 430);
            Line2D l9 = new Line2D.Double(60, 370, 80, 370);
            Line2D l10 = new Line2D.Double(60, 310, 80, 310);
            Line2D l11 = new Line2D.Double(60, 250, 80, 250);
            Line2D l12 = new Line2D.Double(60, 190, 80, 190);
            g2.draw(l7);
            g2.draw(l8);
            g2.draw(l9);
            g2.draw(l10);
            g2.draw(l11);
            g2.draw(l12);



            Shape rect = new Rectangle(150, 495, 40, 56);
            g2.setColor(Color.blue);
            g2.draw(rect);

            Shape rect2 = new Rectangle(250, 315, 40, 236);
            g2.setColor(Color.green);
            g2.draw(rect2);

            Shape rect3 = new Rectangle(350, 195, 40, 356);
            g2.setColor(Color.orange);
            g2.draw(rect3);

            Shape rect4 = new Rectangle(450, 375, 40, 176);
            g2.setColor(Color.red);
            g2.draw(rect4);

            Font f2 = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20);
            g2.setFont(f2);
            g2.setColor(Color.BLUE);
            g2.drawString("-10", 160, 485);

            g2.setColor(Color.green);
            g2.drawString("+20", 260, 300);

            g2.setColor(Color.orange);
            g2.drawString("+40", 360, 185);

            g2.setColor(Color.red);
            g2.drawString("+10", 460, 365);

//            g2.drawString("11", 252, 225);
//            g2.drawString("10", 357, 255);
//            g2.drawString("4.8", 465, 415);


//            Line2D l13 = new Line2D.Double(70, 490, 170, 490);
//            g2.setStroke(new BasicStroke(4f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
//            g2.setColor(Color.RED);
//            g2.draw(l13);
//            CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(170, 490, 370, -250, 390, 700, 469, 420);
//            g2.draw(cubicCurve2D);
//            Font f1 = new Font("Times New Roman", Font.ITALIC, 12);
//            g2.setFont(f1);
//            g2.setColor(Color.BLUE);
//            g2.drawString("2", 160, 485);
//            g2.drawString("11", 252, 225);
//            g2.drawString("10", 357, 255);
//            g2.drawString("4.8", 465, 415);

            // QuadCurve2D quadCurve2D=new QuadCurve2D.Double(400,200,425,500,500,200);
            // g2.draw(quadCurve2D);
/*
          //Ellipse2D el= new Ellipse2D.Double(70,70,170,170);
            //g2.setPaint(new Color(10,90,0));
            g2.setPaint(new GradientPaint(new Point(70,70),Color.red, new Point(170,170), Color.yellow));
            g2.fill(l2);
            g2.setPaint(Color.red);
            g2.fill(el);
            Rectangle2D r2=new Rectangle2D.Double(70,70,170,170);
            g2.draw(r2);
            QuadCurve2D quadCurve2D=new QuadCurve2D.Double(400,0,425,100,450,0);
            g2.draw(quadCurve2D);
            CubicCurve2D cubicCurve2D=new CubicCurve2D.Double(450,50,475,250,525,50,550,50);
            g2.draw(cubicCurve2D);
            GeneralPath generalPath=new GeneralPath();
            generalPath.curveTo(325,200,375,0,400,100);
            g2.draw(generalPath);*/
        }
    }
    static JFrame getFrame() {
        JFrame JFrame = new JFrame() {
        };
        JFrame.setVisible(true);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFrame.setSize(500, 500);
        // JFrame.setLocation(500,180);
        JFrame.setTitle("lab 3");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        JFrame.setBounds(dimension.width / 2 - 450, dimension.height / 2 - 350, 900, 700);
        return JFrame;
    }
}

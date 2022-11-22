package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;
import java.util.Objects;


public class Main {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\Asus\\Desktop\\kurs4\\java\\laba6\\src\\com\\company\\office.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);


        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 800);
        jFrame.setVisible(true);

        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); //створення контейнера (панелі), розміщення компонентів за замовчуванням - зліва
        jFrame.add(jPanel); //додавання панелі у вікно
        jPanel.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20)); //відступи від країв

        Font font = new Font("Times New Roman", Font.BOLD, 19); //задаємо шрифт

        Color color = new Color(0, 0, 0);

        jPanel.add(Box.createVerticalStrut(30)); //відступ до наступного компонента

        JLabel jLabel = new JLabel();

        JMenuBar jMenuBar = new JMenuBar();
        JMenu program = new JMenu("Програма");
        JMenu edit = new JMenu("Правка");
        jMenuBar.add(program);
        jMenuBar.add(edit);
        jFrame.setJMenuBar(jMenuBar);
        JMenuItem check = program.add(new JMenuItem("Перевірка"));
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Зп не може бути від'ємною");
            }
        });

        JMenuItem calculate = program.add(new JMenuItem("Обчислити"));






        program.add(new JSeparator());
        JMenuItem quit = program.add(new JMenuItem("Вийти"));
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        edit.add(new JMenuItem("Копіювати"));
        edit.add(new JMenuItem("Вставити"));


        jLabel.setIcon(imageIcon);
        jPanel.add(jLabel);

        JLabel namelabel = new JLabel("ПІБ:");
        jPanel.add(namelabel);
        JTextField name = new JTextField("", 30);
        jPanel.add(name); //текстове поле з шириною 50

        JLabel salary = new JLabel("Введіть зарплату за останні 6 місяців через пробіл:");
        jPanel.add(salary);
        JTextField s1 = new JTextField("", 60);
        jPanel.add(s1);


        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JFrame jFrame2 = new JFrame();
                jFrame2.setSize(500, 500);
                jFrame2.setVisible(true);
                JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT)); //створення контейнера (панелі), розміщення компонентів за замовчуванням - зліва
                jFrame2.add(jPanel2); //додавання панелі у вікно
                jPanel2.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20)); //відступи від країв
                //додаємо на панель

                String gets= new String(s1.getText());
                System.out.println(gets);
                int max;
                int month;

                String[] string = gets.split(" ");

                int[] arr = new int[string.length];
                for (int i = 0; i < string.length; i++) {
                    arr[i] = Integer.valueOf(string[i]);
                }
                max = Arrays.stream(arr).max().getAsInt();

                System.out.println(max);
                String res = Integer.toString(max);


                JLabel label3 = new JLabel("Максимальна зарплата = " + res); //надпис

                Font font2 = new Font("Times New Roman", Font.BOLD, 30); //задаємо шрифт
                label3.setFont(font2);
                jPanel2.add(label3);

                JButton confirm = new JButton("        Вихід        ");
                jPanel2.add(confirm);

                confirm.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.exit(0);
                    }});


            }
        });

        JButton jButton = new JButton("              Перевірити                 ");
        jPanel.add(jButton); //додаємо кнопку
//        JLabel salary2 = new JLabel("Зарплата 2 місяць:");
//        jPanel.add(salary2);
//        JTextField s2 = new JTextField("", 5);
//        jPanel.add(s2);
//
//        JLabel salary3 = new JLabel("Зарплата 3 місяць:");
//        jPanel.add(salary3);
//        JTextField s3 = new JTextField("", 5);
//        jPanel.add(s3);
//
//        JLabel salary4 = new JLabel("Зарплата 4 місяць:");
//        jPanel.add(salary4);
//        JTextField s4 = new JTextField("", 5);
//        jPanel.add(s4);
//
//        JLabel salary5 = new JLabel("Зарплата 5 місяць:");
//        jPanel.add(salary5);
//        JTextField s5 = new JTextField("", 5);
//        jPanel.add(s5);
//
//        JLabel salary6 = new JLabel("Зарплата 6 місяць:");
//        jPanel.add(salary6);
//        JTextField s6 = new JTextField("", 5);
//        jPanel.add(s6);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    JFrame jFrame2 = new JFrame();
                jFrame2.setSize(500, 500);
                jFrame2.setVisible(true);
                    JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT)); //створення контейнера (панелі), розміщення компонентів за замовчуванням - зліва
                    jFrame2.add(jPanel2); //додавання панелі у вікно
                    jPanel2.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20)); //відступи від країв
                  //додаємо на панель

                String gets= new String(s1.getText());
                System.out.println(gets);
                int max;
                int month;

                String[] string = gets.split(" ");

                int[] arr = new int[string.length];
                for (int i = 0; i < string.length; i++) {
                    arr[i] = Integer.valueOf(string[i]);
                }
                max = Arrays.stream(arr).max().getAsInt();

                System.out.println(max);
                String res = Integer.toString(max);


                JLabel label3 = new JLabel("Максимальна зарплата = " + res); //надпис

                Font font2 = new Font("Times New Roman", Font.BOLD, 30); //задаємо шрифт
                label3.setFont(font2);
                jPanel2.add(label3);

                JButton confirm = new JButton("        Вихід        ");
                    jPanel2.add(confirm);

                    confirm.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            System.exit(0);
                        }});


                }
            });




        jPanel.revalidate();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
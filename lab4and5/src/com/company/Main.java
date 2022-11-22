// лабораторна робота № 5
//3 варіант, Гаврилян, ПП-12
package com.company;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class Main {
    static JFrame getFrame() {
        JFrame JFrame = new JFrame() { //створення нового вікна
        };
        JFrame.setVisible(true); //видимість вікна
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //закриття вікна
        JFrame.setTitle("lab 4"); //назва
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        JFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 250, 570, 500); //розміщення посередені єкрану та розмір
        return JFrame;
    }

    public static void main(String[] args) throws Exception {
        JFrame jFrame = getFrame(); //створення вікна
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); //створення контейнера (панелі), розміщення компонентів за замовчуванням - зліва
        jFrame.add(jPanel); //додавання панелі у вікно
        jPanel.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20)); //відступи від країв
        JLabel topLabel = new JLabel("                              Реєстрація                                                                      "); //надпис
        Font font = new Font("Times New Roman", Font.BOLD, 19); //задаємо шрифт
        topLabel.setFont(font);
        Color color = new Color(0, 0, 0);
        topLabel.setForeground(color);
        jPanel.add(Box.createVerticalStrut(30)); //відступ до наступного компонента
        jPanel.add(topLabel); //додаємо на панель

        JLabel namelabel = new JLabel("Прізвище та ім'я:");
        Font font1 = new Font("Times New Roman", Font.PLAIN, 17);
        namelabel.setFont(font1);
        namelabel.setForeground(color);
        jPanel.add(namelabel);


        jPanel.setBackground(new Color(200, 185, 240)); //колір фона
        JTextField name = new JTextField("", 50);
        jPanel.add(name); //текстове поле з шириною 50
        JLabel maillabel = new JLabel("Логін:");
        maillabel.setFont(font1);
        maillabel.setForeground(color);
        jPanel.add(maillabel);
        JTextField login = new JTextField("", 50);
        jPanel.add(login);

        JPasswordField passwordField = new JPasswordField(30);
        JLabel passlabel = new JLabel("Пароль:                                                                                  ");
        passlabel.setFont(font1);
        passlabel.setForeground(color);
        passwordField.setEchoChar('$');
        jPanel.add(passlabel);
        jPanel.add(passwordField);


        JPasswordField passwordField2 = new JPasswordField(30);
        JLabel passlabel2 = new JLabel("Пароль (підтвердження:                                                                  ");
        passlabel2.setFont(font1);
        passlabel2.setForeground(color);
        passwordField2.setEchoChar('$');
        jPanel.add(passlabel2);
        jPanel.add(passwordField2);

        JCheckBox checkBox1 = new JCheckBox("Згоден з Умовами                                                                              ");
        checkBox1.setBackground(new Color(200, 185, 240));
        jPanel.add(checkBox1);


        JButton jButton = new JButton("        Зареєструватися        ");
        jPanel.add(jButton); //додаємо кнопку

        jPanel.add(Box.createVerticalStrut(50));
        jPanel.revalidate();
        jButton.setEnabled(false);


        login.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(name.getText().length() > 0 && !login.getText().isEmpty())
                    jButton.setEnabled(true);
                else
                    jButton.setEnabled(false);
            }
        });



        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String password1= new String(passwordField.getPassword());
                String password2= new String(passwordField2.getPassword());


                if ((Objects.equals(password1, password2)) && checkBox1.isSelected()){
                    jPanel.add(Box.createVerticalStrut(50));
                    JLabel done = new JLabel("Дякую за реєстрацію");
                    done.setFont(font1);
                    done.setForeground(color);
                    jPanel.add(done);
                    JFrame jFrame2 = getFrame();
                    JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT)); //створення контейнера (панелі), розміщення компонентів за замовчуванням - зліва
                    jFrame2.add(jPanel2); //додавання панелі у вікно
                    jPanel2.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 20)); //відступи від країв
                    JLabel label3 = new JLabel("Реєстрація успішна"); //надпис

                    Font font2 = new Font("Times New Roman", Font.BOLD, 30); //задаємо шрифт
                    label3.setFont(font2);
                    jPanel2.add(label3); //додаємо на панель

                    JButton confirm = new JButton("        Підтвердити        ");
                    jPanel2.add(confirm);

                    confirm.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            System.exit(0);
                        }});


                } else {
                    JOptionPane.showMessageDialog(null, "В полі «Прізвище та ім’я» введено цифри, символи та літери відмінні від кириличних \n В полі логін введено літери відмінні від латинських / пробіл \n В полі пароль та підтвердження паролю введено кириличні літери та присутній пробіл \n Паролі не співпадають");
                }
            }
        });


    }
}


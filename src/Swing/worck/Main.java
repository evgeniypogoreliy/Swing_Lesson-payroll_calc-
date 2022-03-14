package Swing.worck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame  {

    static int numbers = 0;

    public static void main(String[] args) {
        JFrame window = new JFrame();

        JButton EXIT;
        JButton exit;
        JButton zp;

        EXIT = new JButton("Выход");
        exit = new JButton("Точно?");
        zp = new JButton("Посчитать");
        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        JTextField text3 = new JTextField(10);
        JTextField text4 = new JTextField(10);
        JLabel pay = new JLabel("Оклад");
        JLabel bonus = new JLabel(" Приемия");
        JLabel cof = new JLabel("Кофициент");
        JLabel sever_cof = new JLabel(" Северный");
        JLabel res = new JLabel("Результат");
        JLabel resul = new JLabel();

        JPanel textPanel1 = new JPanel(new FlowLayout());
        textPanel1.setLayout(new GridLayout(5,2));
        textPanel1.add(pay);
        textPanel1.add(text1);
        textPanel1.add(bonus);
        textPanel1.add(text2);
        textPanel1.add(cof);
        textPanel1.add(text3);
        textPanel1.add(sever_cof);
        textPanel1.add(text4);
        textPanel1.add(res);
        textPanel1.add(resul);

        JPanel buttonsPanel = new JPanel(new FlowLayout());

        buttonsPanel.add(EXIT);
        buttonsPanel.add(zp);
        buttonsPanel.setBackground(Color.yellow);

        exit.setSize(50, 40);
        exit.setBackground(Color.gray);
        exit.setFont(new Font("", Font.BOLD, 20));

        EXIT.setPreferredSize(new Dimension(80, 28));
        EXIT.setFont(new Font("", Font.BOLD, 12));

        window.add(buttonsPanel, BorderLayout.SOUTH );
        window.add(textPanel1);

        zp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(text1.getText());
                double b = Double.parseDouble(text2.getText());
                double c = Double.parseDouble(text3.getText());
                double d = Double.parseDouble(text4.getText());

                double zaric1 = (a+(a *(b/100))) + ((a+(a *(b/100)))*(c/100)) + ((a + (a *(b/100)))*(d/100)) ;
                double zaric = zaric1 - (zaric1 * 0.13);
                String total = String.valueOf(zaric);
                resul.setText(total);
            }
        });

        EXIT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog d = new JDialog();
                d.setVisible(true);
                d.setBounds(200, 200, 50, 80);
                d.add(exit);
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        window.setTitle("Swing work");
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setSize(500, 300);

    }
}
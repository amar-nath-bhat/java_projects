package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    JButton exit, cont;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(new Color(12, 192, 223));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-50,0,600,500);
        add(image);

        JLabel heading = new JLabel("MasterMinds");
        heading.setBounds(650, 60, 300, 45);
        heading.setFont(new Font("TimesRoman", Font.BOLD, 40));
        add(heading);

        JLabel name = new JLabel("Enter Your Name: ");
        name.setBounds(500, 168, 300, 45);
        name.setFont(new Font("Courier", Font.BOLD, 20));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(710, 175, 300, 30);
        tfname.setFont(new Font("Courier", Font.BOLD,15));;
        add(tfname);

        cont = new JButton("Continue");
        cont.setBounds(600, 270, 120, 25);
        cont.setBackground(new Color(240,240,240));
        cont.setFont(new Font("Courier",Font.PLAIN,15));
        add(cont);
        cont.addActionListener(this);

        exit = new JButton("Exit");
        exit.setBounds(850, 270, 120, 25);
        exit.setBackground(new Color(240,240,240));
        exit.setFont(new Font("Courier",Font.PLAIN,15));
        add(exit);
        exit.addActionListener(this);


        setSize(1200,500);
        setLocation(200, 150);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cont)
        {
            String name = tfname.getText();
            setVisible(false);
            new Continue(name);
            
        }
        else if(e.getSource()==exit)
            setVisible(false);

    }
}
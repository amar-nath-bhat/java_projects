package quizapp;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,500,500);
        add(image);

        JLabel heading = new JLabel("MasterMinds");
        heading.setBounds(600, 60, 300, 45);
        heading.setFont(new Font("  Hand ITC", Font.BOLD, 40));
        add(heading);

        setSize(1000,500);
        setLocation(700, 325);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Login();
    }
}
package quizapp;
import java.awt.*;
import javax.swing.*;

public class Continue extends JFrame {
    String name;
    
    Continue(String name){
        this.name=name;
        getContentPane().setBackground(new Color(12, 192, 223));
        setLayout(null);

        JLabel heading = new JLabel("Welcome to MasterMinds "+name+"!!");
        heading.setBounds(15, 20, 600, 45);
        heading.setFont(new Font("Serif", Font.BOLD, 25));
        add(heading);

        setSize(1200,500);
        setLocation(200, 150);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Continue("User");
    }
}

package quizapp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Continue extends JFrame implements ActionListener {
    String name;
    JButton start, back;
    
    Continue(String name){
        this.name=name;
        getContentPane().setBackground(new Color(12, 192, 223));
        setLayout(null);

        JLabel heading = new JLabel("Welcome to MasterMinds "+name+"!!");
        heading.setBounds(15, 20, 1200, 40);
        heading.setFont(new Font("Serif", Font.BOLD, 40));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 325);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rules.setText(
            "<html>"+
            "<br><b> Rules of the Game!: </b>" + "<br><br>" +
            "1. The Quiz comprises of 10 questions." + "<br><br>" +
            "2. Each question is worth 10 points." + "<br><br>" +
            "3. You get 10 seconds to answer each question" + "<br><br>" +
            "4. If you dont lock one option within the time limit, sekected option will be submitted automatically." + "<br><br>" +
            "5. Final score is awarded out of 100, and this will decide whether you are a MasterMind or not!!"+ "<br><br>" +
            "</html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(20, 420, 120, 25);
        back.setBackground(new Color(240,240,240));
        back.setFont(new Font("Courier",Font.PLAIN,15));
        add(back);
        back.addActionListener(this);

        start = new JButton("Start");
        start.setBounds(150, 420, 120, 25);
        start.setBackground(new Color(240,240,240));
        start.setFont(new Font("Courier",Font.PLAIN,15));
        start.addActionListener(this);
        add(start);

        setSize(1200,500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==start)
        {
          
        }
        else 
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[])
    {
        new Continue("User");
    }
}

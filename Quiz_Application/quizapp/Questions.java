package quizapp;

import javax.swing.*;
import java.awt.*;


public class Questions extends JFrame{

    String questions[][] = new String [10][5];
    String answers [][] = new String [10][2];
    String user_answer[][] = new String [10][2];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupOption;
    public static int timer = 11;
    public static int flag = 0;
    public static int count = 0;

    Questions() {
        getContentPane().setBackground(Color.white);
        setLayout(new BorderLayout()); // Use BorderLayout

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/questions.jpg"));
        Image img = i1.getImage();
        Image newImg = img.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        i1 = new ImageIcon(newImg);
        JLabel image = new JLabel(i1);

        // Add the image to the left side
        add(image, BorderLayout.WEST);

        qno = new JLabel();
        qno.setBounds(1300, 100, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 25));
        rightPanel.add(qno);
        
        question = new JLabel();
        question.setBounds(1350, 150, 300, 30); // Adjust the Y-coordinate and width to fit your layout
        question.setFont(new Font("Tahoma", Font.PLAIN, 25));
        rightPanel.add(question);
        

        questions[0][0] =   "<html>What is the result of the following code in Java?<br>" +
                            "int x = 5;<br>" + 
                            "x = x++;<br>" + 
                            "System.out.println(x);</html>";

        questions[0][1] = "4";
        questions[0][2] = "5";
        questions[0][3] = "6";
        questions[0][4] = "7";

        questions[1][0] = "In Python, which data structure is typically used for implementing a Last-In-First-Out (LIFO) order?";
        questions[1][1] = "Queue";
        questions[1][2] = "Stack";
        questions[1][3] = "List";
        questions[1][4] = "Set";

        questions[2][0] = "Which of the following is not a valid way to create a new object in JavaScript?";
        questions[2][1] = "new Object()";
        questions[2][2] = "{}";
        questions[2][3] = "Object.create()";
        questions[2][4] = "new {}";

        questions[3][0] = "In C++, what is the function used to dynamically allocate memory for a single variable of a specified type?";
        questions[3][1] = "alloc()";
        questions[3][2] = "new()";
        questions[3][3] = "malloc()";
        questions[3][4] = "create()";

        questions[4][0] = "Which of the following is not a valid variable naming convention in Java?";
        questions[4][1] = "camelCase";
        questions[4][2] = "snake_case";
        questions[4][3] = "kebab-case";
        questions[4][4] = "PascalCase";

        questions[5][0] = "What is the time complexity of a standard QuickSort algorithm in the best case?";
        questions[5][1] = "O(n)";
        questions[5][2] = "O(n^2)";
        questions[5][3] = "O(log n)";
        questions[5][4] = "O(n log n)";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In HTML, which tag is used to create a hyperlink?";
        questions[7][1] = "<link>";
        questions[7][2] = "<a>";
        questions[7][3] = "<href>";
        questions[7][4] = "<url>";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "What is the result of 3 + '3' in JavaScript?";
        questions[9][1] = "6";
        questions[9][2] = "33";
        questions[9][3] = "\'33\'";
        questions[9][4] = "36";

        answers[0][0] = "5";
        answers[1][0] = "Stack";
        answers[2][0] = "new {}";
        answers[3][0] = "new()";
        answers[4][0] = "kebab-case";
        answers[5][0] = "O(n log n)";
        answers[6][0] = "import";
        answers[7][0] = "<a>";
        answers[8][0] = "java.lang.StringBuilder";
        answers[9][0] = "\'33\'";

        opt1 = new JRadioButton();
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        rightPanel.add(opt1);

        opt2 = new JRadioButton();
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        rightPanel.add(opt2);

        opt3 = new JRadioButton();
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        rightPanel.add(opt3);

        opt4 = new JRadioButton();
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        rightPanel.add(opt4);

        // Create a ButtonGroup for radio buttons
        groupOption = new ButtonGroup();
        groupOption.add(opt1);
        groupOption.add(opt2);
        groupOption.add(opt3);
        groupOption.add(opt4);

        // Add the right panel to the right side
        
        
        JButton next = new JButton("Next");
        next.setBounds(150, 420, 120, 25);
        next.setBackground(new Color(240,240,240));
        next.setFont(new Font("Courier",Font.PLAIN,15));
        // next.addActionListener(this);
        rightPanel.add(next);

        JButton help = new JButton("HelpLine");
        help.setBounds(270, 420, 120, 25);
        help.setBackground(new Color(240,240,240));
        help.setFont(new Font("Courier",Font.PLAIN,15));
        // help.addActionListener(this);
        rightPanel.add(help);

        JButton submit = new JButton("Submit");
        submit.setBounds(390, 420, 120, 25);
        submit.setBackground(new Color(240,240,240));
        submit.setFont(new Font("Courier",Font.PLAIN,15));
        // submit.addActionListener(this);
        submit.setEnabled(false);
        rightPanel.add(submit);

        rightPanel.setBackground(Color.white);
        add(rightPanel, BorderLayout.CENTER);

        start(count);

        setBounds(50, 0, 2000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the window properly
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        String time = "Time left " + timer + " seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahom", Font.BOLD, 25));

        if(timer > 0)
            g.drawString(time, 1100, 500);
        else
            g.drawString("Times UP!", 1100, 500);

        timer--;

        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            // e.printStackTrace(null);
        }

        if(flag == 1){
            flag = 0;
            timer = 10;
        }

        else if(timer < 0){
            timer = 10;
            if(groupOption.getSelection() == null){
                user_answer[count][0]="";
            }else{
                user_answer[count][0]= groupOption.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
            
        

    }
    public void start(int count){
        qno.setText(""+(count + 1)+".");

        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupOption.clearSelection();
        
    }
    public static void main(String args[]) {
        new Questions();
    }
}

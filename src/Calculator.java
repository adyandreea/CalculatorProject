    import java.awt.*;
    import java.awt.event.*;
    import java.util.Arrays;
    import javax.swing.*;
    import javax.swing.border.LineBorder;


    public class Calculator {
        int boardWidth = 360;
        int boardHeight = 540;

        Color customLightGray = new Color(212,212,210);
        Color customDarkGray = new Color(80,80,80);
        Color customBlack = new Color(28,28,28);
        Color customOrange = new Color(255,149,0);

        JFrame frame = new JFrame("Calculator");
        JLabel displayLabel = new JLabel();
        JPanel displayPanel = new JPanel();

        Calculator(){
            frame.setVisible(true);
            frame.setSize(boardWidth,boardHeight);
            frame.setLocationRelativeTo(null); //Așază fereastra în centru pe ecran
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            displayLabel.setBackground(customBlack);
            displayLabel.setForeground(Color.WHITE);
            displayLabel.setFont(new Font("Arial", Font.PLAIN,80));
            displayLabel.setHorizontalAlignment(JLabel.RIGHT);
            displayLabel.setText("0");
            displayLabel.setOpaque(true);

            
        }
    }

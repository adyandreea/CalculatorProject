import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculator {
    int boardWidth = 360;
    int boardHeight = 540;

    JFrame frame = new JFrame("Calculator");
    Calculator(){
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null); //Așază fereastra în centru pe ecran
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}

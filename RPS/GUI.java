package RPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {

    private JFrame myFrame;
    private JPanel myPanel;  // Panel for buttons
    private JPanel textFieldPanel;  // Panel for text fields
    private JPanel labelPanel;  // Panel for labels
    private JButton button1, button2, button3;
    private JTextField player1NameField;  // Declare it as a class member
    private JTextField player2NameField;   // Similarly, if needed
    private JTextField roundsField;


    RPSGame myGame;
    

    public GUI(){
        myFrame = new JFrame("Rock Paper Scissors");
        myFrame.setSize(600, 400);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void createGame(){
        
        
        myPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));  // 20 as vertical gap for spacing
        myPanel.setBackground(Color.ORANGE);
        
        myFrame.add(myPanel, BorderLayout.EAST);
        
        button1 = new JButton("Play");
        
        setupPlayButtonAction();

        myPanel.add(button1);

        // Panel for Text Fields
        textFieldPanel = new JPanel();
        player1NameField = createTextField("Player 1");
        player2NameField = createTextField("Player 2");
        roundsField = createTextField("Rounds");
        textFieldPanel.add(player1NameField);
        textFieldPanel.add(player2NameField);
        textFieldPanel.add(roundsField);
        textFieldPanel.setPreferredSize(new Dimension(150, 50));
        myFrame.add(textFieldPanel, BorderLayout.CENTER);

        // Panel for Labels
        labelPanel = new JPanel();
        JLabel player1NameLabel = createLabel("Player 1");
        JLabel player2NameLabel = createLabel("Player 2");
        JLabel roundsLabel = createLabel("Rounds");
        labelPanel.add(player1NameLabel);
        labelPanel.add(player2NameLabel);
        labelPanel.add(roundsLabel);
        labelPanel.setPreferredSize(new Dimension(150, 50));
        myFrame.add(labelPanel, BorderLayout.WEST);


        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public JTextField createTextField(String tipText) {
        JTextField field = new JTextField(10);
        field.setToolTipText(tipText);
        return field;
    }


    public JLabel createLabel(String labelText) {
        JLabel label = new JLabel(labelText);
        Font font = new Font("Calibri", Font.PLAIN, 18);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        return label;
    }

    private void setupPlayButtonAction() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve text from text fields
                String player1Name = player1NameField.getText();
                String player2Name = player2NameField.getText();
                int rounds = Integer.parseInt(roundsField.getText());
                
                myGame = new RPSGame(player1Name, player2Name);
                myGame.playGame(rounds);
            }
        });
    }


    
    public void show() {
        myFrame.setVisible(true);
    } 
    

    
}

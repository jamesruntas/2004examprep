package GUI;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class View extends JPanel implements Observer{ 
    private JTextField ourString; 
    
    public View() { 
        ourString = new JTextField(); 
        ourString.setEditable(false); 
        ourString.setHorizontalAlignment(JTextField.RIGHT); 
        setLayout(new GridLayout(1,1)); 
        add(ourString); 

    }

    @Override
    public void update(String newData) {
        ourString.setText(newData);
    } 

} 
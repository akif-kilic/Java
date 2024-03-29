import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutEx{
    
public static void main(String[] args ) {

    SwingUtilities.invokeLater(new Runnable() {
public void run()
{
new A();
}
});	

}//Closing the main method
}//Closing the class A


class A implements ActionListener
{
JFrame jf;
JPanel parentPanel;
CardLayout cd;


A()
{
jf = new JFrame("CardLayout Example");
cd = new CardLayout();


//Creating a main parent panel that will contain two child panels
parentPanel = new JPanel();

//Creating two child panels.
JPanel childPanel1 = new JPanel();
JPanel childPanel2 = new JPanel();


JButton button1 = new JButton("Alphabets");
JButton button2 = new JButton("Numbers");

JButton button3 = new JButton("4");
JButton button4 = new JButton("5");
JButton button5 = new JButton("6");

//Adding buttons to childPanel1
childPanel1.add(button3);
childPanel1.add(button4);
childPanel1.add(button5);

JButton button6 = new JButton("A");
JButton button7 = new JButton("B");
JButton button8 = new JButton("C");

//Adding buttons to childPanel2
childPanel2.add(button6);
childPanel2.add(button7);
childPanel2.add(button8);


//Setting the positioning of the components in parentPanel, JPanel(that contains childPanel1 and childPanel2) to CardLayout
parentPanel.setLayout(cd);

//Adding childPanel1 and childPanel2 to parentPanel
parentPanel.add(childPanel1, "Num");
parentPanel.add(childPanel2, "Alp");

button1.addActionListener(this);
button2.addActionListener(this);


//Setting container JFrame's layout to FlowLayout.
jf.setLayout(new FlowLayout());

//Adding two buttons to JFrame, these buttons will remain commonly visible to all panels 
jf.add(button1); 	
jf.add(button2);

//Adding JPanel, parentPanel to JFrame
jf.add(parentPanel);

jf.setSize(300,200);
jf.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
//If "Numbers" button is clicked, open the JPanel with buttons showing numbers.
if(ae.getActionCommand()=="Numbers") 
cd.show(parentPanel,"Num");

//If "Alphabets" button is clicked, open the JPanel with buttons showing alphabets.
if(ae.getActionCommand()=="Alphabets") 
cd.show(parentPanel,"Alp");
}
}

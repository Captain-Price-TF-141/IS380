//Captain-Price-TF-141

package simplegui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ColorFactory 
{
   public static void main(String[] args) 
   {
      createWindow();
   }

   private static void createWindow() 
   {    
      JFrame frame = new JFrame("employee records");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(560, 200);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }

   private static void createUI(final JFrame frame)
   {  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("1. Show all information");
      final JLabel label = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "Select one of the color", 
               "Swing Tester",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "Red"
            );
            if(result != null && result.length() > 0){
               label.setText("You selected:" + result);
            }else {
               label.setText("None selected");
            }
         }
      });
      
      JButton button1 = new JButton("2. Show licenses");
      final JLabel label1 = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "Select one of the color", 
               "Swing Tester",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "Red"
            );
            if(result != null && result.length() > 0){
               label.setText("You selected:" + result);
            }else {
               label.setText("None selected");
            }
         }
      });
      
      JButton button2 = new JButton("3. Show certificates");
      final JLabel label2 = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "Select one of the color", 
               "Swing Tester",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "Red"
            );
            if(result != null && result.length() > 0){
               label.setText("You selected:" + result);
            }else {
               label.setText("None selected");
            }
         }
      });
      JButton button3 = new JButton("4. Search");
      final JLabel label3 = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "Select one of the color", 
               "Swing Tester",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "Red"
            );
            if(result != null && result.length() > 0){
               label.setText("You selected:" + result);
            }else {
               label.setText("None selected");
            }
         }
      });
      
      JButton button4 = new JButton("5. Exit");
      final JLabel label4 = new JLabel();
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String result = (String)JOptionPane.showInputDialog(
               frame,
               "Select one of the color", 
               "Swing Tester",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "Red"
            );
            if(result != null && result.length() > 0){
               label.setText("You selected:" + result);
            }else {
               label.setText("None selected");
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }  
} 


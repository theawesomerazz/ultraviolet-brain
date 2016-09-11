import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IntrusiveFighter 
{
   
   public static void main(String[] args)
   {
      //set up the window.
      JFrame frame = new JFrame("UVHEAD");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setResizable(false);
      frame.setLayout(new BorderLayout());
      
      frame.add(new GamePanel(), BorderLayout.CENTER);
      frame.pack();
      
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
   }
}

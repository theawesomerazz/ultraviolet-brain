import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

public class MenuState extends GameState 
{
   private String[] options = {"START", "HELP", "DEV", "QUIT"};
   private int currentSelection = 0;
   
   public MenuState(GameStateManager gsm)
   {
      super(gsm);
   }
   
   public void init()
   {
   }
   
   public void tick()
   {
   }
   
   public void draw(Graphics g)
   {
      g.setColor(new Color(20, 0, 80));
      g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
      
      for (int i = 0; i < options.length;i++)
      {
         if (i == currentSelection)
         {
            g.setColor(Color.WHITE);
         }
         else
         {
            g.setColor(new Color(200, 0, 150));
         }
         
         g.setFont(new Font("Arial", Font.PLAIN, 72));
         g.drawString(options[i], GamePanel.WIDTH / 2 - 100, 100 + i * 100);
      }
   
   }
   
   public void keyPressed(int k)
   {
      if (k == KeyEvent.VK_DOWN)
      {
         currentSelection++;
         
         if (currentSelection >= options.length)
         {
            currentSelection = 0;
         }
      }
      
      else if (k == KeyEvent.VK_UP)
      {
         currentSelection--;
         
         if (currentSelection < 0)
         {
            currentSelection = options.length - 1;
         }
      }
      
   }
   
   public void keyReleased(int k)
   {
   }
} 


package controls;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;

public class JMyButton extends JButton {
   public JMyButton(){
       setOpaque(false);
       setContentAreaFilled(false);
       setForeground(Color.WHITE);
       setCursor(new Cursor(Cursor.HAND_CURSOR));
       
       
   }
   @Override
   protected void paintComponent(Graphics g){
   g.setColor(new Color(70,130,180));
   g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 15);
   super.paintComponent(g);
   
   }
   @Override
   protected void paintBorder(Graphics g){
   g.setColor(new Color(15,130,167));
   g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 15);

   }
 
}

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Palette extends Applet {
 Color[] c={Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW}; int sel=0;
 public void init(){addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e){int i=(e.getX()-20)/60;if(e.getY()<60&&i>=0&&i<4)sel=i;repaint();}});}
 public void paint(Graphics g){for(int i=0;i<c.length;i++){g.setColor(c[i]);g.fillRect(20+i*60,20,50,40);}g.setColor(c[sel]);g.fillRect(20,90,230,60);}
}
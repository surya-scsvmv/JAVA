import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class BarChart extends Applet {
 int[] marks={78,91,45,66,88}; String msg="Click a bar";
 public void init(){addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e){int i=(e.getX()-20)/50;if(i>=0&&i<5)msg="Subject "+(i+1)+" = "+marks[i];repaint();}});}
 public void paint(Graphics g){g.drawString(msg,20,20);for(int i=0;i<marks.length;i++){g.setColor(marks[i]>=50?Color.GREEN:Color.RED);g.fillRect(20+i*50,150-marks[i],40,marks[i]);}}
}
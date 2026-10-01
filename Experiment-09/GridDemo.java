import javax.swing.*;
import java.awt.*;
public class GridDemo { public static void main(String[] args){JFrame f=new JFrame("GridLayout 4 x 3");f.setLayout(new GridLayout(4,3,5,5));String[] keys={"1","2","3","4","5","6","7","8","9","*","0","#"};for(String k:keys)f.add(new JButton(k));f.setSize(260,300);f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setVisible(true);} }
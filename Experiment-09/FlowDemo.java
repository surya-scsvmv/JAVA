import javax.swing.*;
import java.awt.*;
public class FlowDemo { public static void main(String[] args){JFrame f=new JFrame("FlowLayout");f.setLayout(new FlowLayout());String[] b={"New","Open","Save","Print","Exit"};for(String s:b)f.add(new JButton(s));f.setSize(300,120);f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setVisible(true);} }
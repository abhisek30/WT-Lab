import java.applet.Applet;
import java.awt.*;

/*
<applet code = "prog3.class" width = 400 height = 200> </applet>
*/
public class prog3 extends Applet {

String name;
String name_2;
public void init() {
    setBackground(Color.blue);
    setForeground(Color.black);

    name=getParameter("user");
    name_2=getParameter("user_2");
    }


public void paint(Graphics g){

    
    g.drawString("Welcome       "+name,30,40);
    g.drawString("       "+name_2,80,50);
    }

}
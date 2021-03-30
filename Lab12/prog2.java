import java.applet.Applet;
import java.awt.*;
/*
<applet code = "prog2.class" width = 400 height = 200> </applet>
*/
public class prog2 extends Applet {

    public void init() {
        setBackground(Color.yellow);
        setForeground(Color.black);

    }

    public void paint(Graphics g) {
        g.drawRect(50, 80, 600, 300);
        //System.out.println("Working Directory = " + path);
        g.drawString("Current Folder Name :-  "+getCodeBase(), 80, 100);
    }
}
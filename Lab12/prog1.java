import java.applet.Applet;
import java.awt.*;
/*
<applet code = "prog1.class" width = 400 height = 200> </applet>
*/
public class prog1 extends Applet {

    // paint the applet
    public void paint(Graphics g)
    {
        g.drawString("Roll No. :1929195", 100, 100);
        g.drawString("Name :Abhisek", 100, 120);
        g.drawString("Branch :CSCE", 100, 140);
        g.drawString("School :SCE ", 100, 160);

        g.setColor(Color.red);

        g.drawRect(50, 80, 200, 100);


    }
}

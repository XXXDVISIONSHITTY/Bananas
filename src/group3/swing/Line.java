package group3.swing;

import java.awt.Graphics;
import javax.swing.JLabel;

public class Line extends JLabel {
<<<<<<< HEAD

=======
//this is my line class
>>>>>>> refs/remotes/origin/main
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getForeground());
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
    }
}

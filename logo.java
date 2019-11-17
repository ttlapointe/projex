import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

public class logo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo");
        Container cp = jf.getContentPane();
        cp.add(new JComponent() {
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(10));
                g2.LineBorder(white, 5, yes);
                g2.draw(new Line2D.Float(0, 0, 0, 700));
            }
        });
        jf.setSize(600, 700);
        jf.setVisible(true);
    }
}
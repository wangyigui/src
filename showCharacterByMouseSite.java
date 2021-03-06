import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Snoopy on 2016/11/30.
 */

public class showCharacterByMouseSite extends JFrame {
    private DisplayPanel panel = new DisplayPanel();

    public showCharacterByMouseSite() {
        add(panel, BorderLayout.CENTER);
        panel.setFocusable(true);
    }

    /** Main method */
    public static void main(String[] args) {
        JFrame frame = new showCharacterByMouseSite();
        frame.setTitle("Exercise16_11");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    class DisplayPanel extends JPanel {
        private int x = 20;
        private int y = 20;
        private char keyChar = ' '; // Default key

        public DisplayPanel() {
            // Add key listener
            this.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    keyChar = e.getKeyChar();
                    repaint();
                }
            });

            // Add mouse motion listener
            this.addMouseMotionListener(new MouseAdapter() {
                public void mouseMoved(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
            g.drawString(String.valueOf(keyChar), x, y);
        }
    }
}


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.*;

public class MainFrame2 extends JFrame {
    private JLabel jlb = new JLabel("Start!");
    private JButton jbtn_up = new JButton("Up");
    private JButton jbtn_down = new JButton("Down");
    private JButton jbtn_left = new JButton("Left");
    private JButton jbtn_right = new JButton("Right");
    private Container cp;
    private int x = 0, y = 0;

    public MainFrame2() {
        init();
    }

    private void init() {
        setBounds(500, 500, 500, 400);
        setTitle("Q2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp = this.getContentPane();
        cp.setLayout(null);
        jlb.setBounds(225, 150, 50, 25);
        jbtn_up.setBounds(200, 10, 80, 25);
        jbtn_down.setBounds(200, 315, 80, 25);
        jbtn_left.setBounds(10, 150, 80, 25);
        jbtn_right.setBounds(390, 150, 80, 25);
        cp.add(jlb);
        cp.add(jbtn_up);
        cp.add(jbtn_right);
        cp.add(jbtn_down);
        cp.add(jbtn_left);

        jbtn_up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y += 10;
                jlb.setBounds(225 + x, 150 - y, 50, 25);
                jlb.setText(Integer.toString(x) + "," + Integer.toString(y));
            }
        });
        jbtn_down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                y -= 10;
                jlb.setBounds(225 + x, 150 - y, 50, 25);
                jlb.setText(Integer.toString(x) + "," + Integer.toString(y));
            }
        });
        jbtn_left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x -= 10;
                jlb.setBounds(225 + x, 150 - y, 50, 25);
                jlb.setText(Integer.toString(x) + "," + Integer.toString(y));
            }
        });
        jbtn_right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                x += 10;
                jlb.setBounds(225 + x, 150 - y, 50, 25);
                jlb.setText(Integer.toString(x) + "," + Integer.toString(y));
            }
        });
    }
}
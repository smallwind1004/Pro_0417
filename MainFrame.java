import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.*;

public class MainFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton jbtn = new JButton("Start");
    private Container cp;

    public MainFrame() {
        init();
    }

    private void init() {
        setBounds(500, 300, 500, 400);
        setTitle("Q1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cp = this.getContentPane();
        cp.setLayout(null);
        jbtn.setBounds(10, 10, 460, 330);
        cp.add(jbtn);

        jbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                for (int i = 1; i < 10; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.print(i + "x" + j + "=" + i*j + "\t");
                    }
                    System.out.println();
                }
            }
        });

    }
}
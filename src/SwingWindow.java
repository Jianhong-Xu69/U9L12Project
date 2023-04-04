import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingWindow extends JFrame implements ActionListener {
    private JPanel bob;
    private JButton hello_bob;
    private JButton do_wacky_thing;
    private JTextArea talk_wit_bob;
    private JTextArea issac_dumbass;

    public SwingWindow() {
        setContentPane(bob);
        setTitle("Hmm bob");
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        do_wacky_thing.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object thing = e.getSource();
        if (thing instanceof JButton) {
            JButton butt = (JButton) thing;
            String text = butt.getText();
            if (text.equalsIgnoreCase("Talk to issac")){
                issac_dumbass.setText("FUCKING KILL YOURSELF");
            }
        }
    }
}

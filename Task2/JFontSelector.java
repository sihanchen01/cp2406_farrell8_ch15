import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    private int fontSize = 12;
    private String fontName = "Arial";
    private Font font;

    JButton b1 = new JButton("Arial");
    JButton b2 = new JButton("Times New Roman");
    JButton b3 = new JButton("Verdana");
    JButton b4 = new JButton("Bodoni");
    JButton b5 = new JButton("Helvetica");
    JButton b6 = new JButton("Larger");
    JLabel result = new JLabel();

    public JFontSelector() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        font = new Font(fontName, Font.PLAIN, fontSize);
        result.setFont(font);
        result.setText("Font: " + fontName + " Size: " + fontSize);
        add(result);
    }

    public static void main(String[] args) {
        JFontSelector frame = new JFontSelector();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b6){
            fontSize += 1;
        } else {
            fontName = b.getText();
        }
        font = new Font(fontName, Font.PLAIN, fontSize);
        result.setFont(font);
        result.setText("Name: " + fontName + " Size: " + fontSize);
    }
}
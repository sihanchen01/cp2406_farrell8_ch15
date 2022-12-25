import javax.swing.*;
import java.awt.*;

public class JColorFrame extends JFrame {
    String[] regions = {"north", "south", "east", "west"};
    JButton bChangeColor = new JButton("Change color");
    Container container;
    JPanel np = new JPanel();
    JPanel sp = new JPanel();
    JPanel ep = new JPanel();
    JPanel wp = new JPanel();

    public JColorFrame() throws HeadlessException {
        super("Color frame");
        setLayout(new BorderLayout());
        container = getContentPane();
        container.add(np, BorderLayout.NORTH);
        container.add(sp, BorderLayout.SOUTH);
        container.add(ep, BorderLayout.EAST);
        container.add(wp, BorderLayout.WEST);
        container.add(bChangeColor, BorderLayout.CENTER);

        bChangeColor.addActionListener(e -> {
            String region = regions[(int)Math.floor(Math.random()*4)];
            switch (region) {
                case "north" -> np.setBackground(Color.red);
                case "south" -> sp.setBackground(Color.red);
                case "east" -> ep.setBackground(Color.red);
                case "west" -> wp.setBackground(Color.red);
            }

        });
    }

    public static void main(String[] args) {
        JColorFrame frame = new JColorFrame();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}

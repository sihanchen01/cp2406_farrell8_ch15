import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class JMovieFrame extends JFrame implements ActionListener {
    JButton nb = new JButton("The Northman");
    JButton sb = new JButton("Southpaw");
    JButton eb = new JButton("East of Eden");
    JButton wb = new JButton("West Side Story");
    JLabel movieInfo = new JLabel();
    Container con;

    public JMovieFrame(){
        super("Movie with region in its name");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(nb, BorderLayout.NORTH);
        nb.addActionListener(this);
        con.add(sb, BorderLayout.SOUTH);
        sb.addActionListener(this);
        con.add(eb, BorderLayout.EAST);
        eb.addActionListener(this);
        con.add(wb, BorderLayout.WEST);
        wb.addActionListener(this);
        con.add(movieInfo, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JMovieFrame frame = new JMovieFrame();
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == eb){
            movieInfo.setText("Year: 1995, Star: James Dean");
        } else if (source == nb){
            movieInfo.setText("Year: 2022, Star: Nicole Kidman");
        } else if (source == wb){
            movieInfo.setText("Year: 2021, Star: Rachel Zegler");
        } else if (source == sb){
            movieInfo.setText("Year: 2015, Star: Jake Gyllenhaal");
        }
    }
}

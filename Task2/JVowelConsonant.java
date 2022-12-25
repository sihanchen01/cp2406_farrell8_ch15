import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JVowelConsonant extends JFrame {
    static final int ALPHABET_START = 97;
    static final int[] VOWELS_INDEX = {97, 101, 105, 111, 117};

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JLabel result = new JLabel();
    JButton[] buttons = new JButton[26];

    public JVowelConsonant() {
        super("Consonants");

        for (int i=0; i<26; i++){
            int index = i + ALPHABET_START;
            char c = (char) (index);
            String text = Character.toString(c);
            JButton button = new JButton(text);
            button.addActionListener(e -> {
                JButton b = (JButton) e.getSource();
                String buttonText = b.getText();
                int textIndex = (int) buttonText.charAt(0);
                if (Arrays.stream(VOWELS_INDEX).anyMatch(x -> x==textIndex)){
                    result.setText("This is a vowel");
                } else {
                    result.setText("This is a consonant");
                }
                char newChar = (char) (Math.floor(Math.random() * 26 + 97));
                String newText = Character.toString(newChar);
                b.setText(newText);
            });
            buttons[i] = button;
        }

        ArrayList<Integer> seen = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            int index = (int) Math.floor(Math.random() * 26);
            while (seen.contains(index)){
                index = (int) Math.floor(Math.random() * 26);
            }
            p1.add(buttons[index]);
            seen.add(index);

            int index2 = (int) Math.floor(Math.random() * 26);
            while (seen.contains(index2)){
                index2 = (int) Math.floor(Math.random() * 26);
            }
            p2.add(buttons[index2]);
            seen.add(index);

        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        add(p1);
        add(p2);
        p3.add(result);
        add(p3);
    }

    public static void main(String[] args) {
        JVowelConsonant frame = new JVowelConsonant();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}

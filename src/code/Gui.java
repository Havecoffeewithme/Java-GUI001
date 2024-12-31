import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class Gui
{
    private int clickCount = 0;

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()-> {
            new Gui().createAndShowGUI();
    });
    }

    private void createAndShowGUI(){

        final JFrame frame;
        frame = new JFrame("Buttons and Labels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 255);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2,10,10));

        JLabel helloLabel = new JLabel("Click to count");
        JLabel timeLabel = new JLabel("Click to show current time");

        JButton helloButton = new JButton("Count");
        JButton timeButton = new JButton("Show Time");

        helloButton.addActionListener(e -> {
            clickCount++;
            System.out.println("Button clicked " + clickCount + " times");
        });

        timeButton.addActionListener(e -> System.out.println(LocalDateTime.now()));

        JLabel titleLabel = new JLabel("Welcome to the Time and Counter App", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial",Font.ITALIC, 16));
        frame.add(titleLabel,BorderLayout.NORTH);

        // adding the components to the panel

        panel.add(helloButton);
        panel.add(helloLabel);
        panel.add(timeButton);
        panel.add(timeLabel);

        // padding for the frame
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }


}


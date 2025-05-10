
package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    private JLabel welcomeLabel, photoLabel;
    private JPanel mainPanel;

    public Welcome() {
        setTitle("Welcome Frame");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.white);

        welcomeLabel = new JLabel("Welcome to Our restaurant", SwingConstants.CENTER);
        welcomeLabel.setForeground(Color.pink);
        welcomeLabel.setFont(new Font("serif", Font.BOLD,30));


        ImageIcon photo = new ImageIcon("C:\\Users\\nadam\\OneDrive\\Desktop\\project VP\\mn.jpg");

        photoLabel = new JLabel(photo, SwingConstants.CENTER);
        mainPanel.add(photoLabel, BorderLayout.CENTER);

        mainPanel.add(welcomeLabel, BorderLayout.SOUTH);
        add(mainPanel);

        Timer timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MenuFrame();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        welcome.setVisible(true);
    }
}
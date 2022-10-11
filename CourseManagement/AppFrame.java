import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame
{
    AppPanel panel;

    public AppFrame()
    {
        panel = new AppPanel();
        this.setTitle("Course Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBackground(Color.black);
        this.getContentPane().setBackground(Color.black);

        this.setResizable(true);
        this.setLayout(new GridBagLayout());
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

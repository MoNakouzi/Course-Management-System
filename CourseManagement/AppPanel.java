import javax.swing.*;
import java.awt.*;

public class AppPanel extends JPanel
{
    // get the dimensions of the user's screen, to be used for the fix below
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Set the initial dimensions of the system

    // TO FIX: Make the size of everything to be relative to the user screen, while allowing the window to resize
        // (resized window doesn't need to be usable fully)
    static final int PANEL_WIDTH = 1200;
    static final int PANEL_HEIGHT = 650;
    static final Dimension SCREEN_SIZE = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);

    public AppPanel()
    {
        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);
        this.setMinimumSize(new Dimension(AppPanel.PANEL_WIDTH, AppPanel.PANEL_HEIGHT));
        this.setMaximumSize(new Dimension(AppPanel.PANEL_WIDTH, AppPanel.PANEL_HEIGHT));
    }
}
